package com.example.matimplementationapp.fragments;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;
import com.example.matimplementationapp.adapters.BTDeviceAdapter;

import java.util.ArrayList;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class FragmentBluetooth extends Fragment  {

    private Button btnStartScan;
    private Button btnStopScan;
    private Button btnSelect;
    private Button btnConnect;
    private Button btnSend;

    private TextView selectedBtDeviceTextView;

    private RecyclerView btDevicesRecyclerView;
    private Intent bluetoothEnabledIntent;
    private ArrayList<BluetoothDevice> btDevices;
    private ArrayList<String> deviceNames;

    private int REQUEST_ENABLE_BLUETOOTH = 1;

    private static final String TAG = "BT";

    private BTDeviceAdapter btDeviceAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bluetoothEnabledIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        deviceNames = new ArrayList<>();
        btDevices = new ArrayList<>();
        btDeviceAdapter = new BTDeviceAdapter(((MainActivity)getActivity()).getApplicationContext(),deviceNames);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_bluetooth, container, false);

        findViewByIds(view);

        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        ((MainActivity)getActivity()).registerReceiver(receiver,filter);

        addListeners();

        btDevicesRecyclerView.setLayoutManager(new LinearLayoutManager(((MainActivity)getActivity()).getApplicationContext()));
        btDevicesRecyclerView.setAdapter(btDeviceAdapter);

        return view;
    }

    private void findViewByIds(View view) {
        btnStartScan = view.findViewById(R.id.btnStartScan);
        btnStopScan = view.findViewById(R.id.btnStopScan);
        btDevicesRecyclerView = view.findViewById(R.id.btDeviceRecyclerView);
        btnSelect = view.findViewById(R.id.btnSelect);
        btnConnect = view.findViewById(R.id.btnConnect);
        selectedBtDeviceTextView = view.findViewById(R.id.selectedBtDeviceTextView);
    }

    private void addListeners(){
        btnStartScanListener();
        btnStopScanListener();
        btnSelectListener();
        btnConnectListener();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUEST_ENABLE_BLUETOOTH){
            if(resultCode == RESULT_OK){
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(), "Bluetooth Enabled", Toast.LENGTH_SHORT).show();
            } else if(resultCode == RESULT_CANCELED){
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth Enabling Cancelled",Toast.LENGTH_LONG).show();
            }
        }
    }


    private void btnStartScanListener(){
        btnStartScan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if(((MainActivity)getActivity()).getBluetoothAdapter()==null){
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth is not supported by device.",Toast.LENGTH_LONG).show();
                } else {
                    if(!((MainActivity)getActivity()).getBluetoothAdapter().isEnabled()){
                        startActivityForResult(bluetoothEnabledIntent,REQUEST_ENABLE_BLUETOOTH);
                    }
                }
                // Quick permission check
                int permissionCheck = ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_FINE_LOCATION");
                permissionCheck += ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_COARSE_LOCATION");
                if (permissionCheck != 0) {

                    ((MainActivity)getActivity()).requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001); //Any number
                }
                ((MainActivity)getActivity()).getBluetoothAdapter().startDiscovery();
                Log.i(TAG,"scan started");
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Scan Started",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void btnStopScanListener(){
        btnStopScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getBluetoothAdapter().cancelDiscovery();
                Log.i(TAG,"scan stopped");
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Scan Stopped",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void btnSelectListener(){
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btDevices.size()>0){
                    selectedBtDeviceTextView.setText(btDevices.get(btDeviceAdapter.getBluetoothDeviceIndex()).getName());
                    Log.i(TAG, btDevices.get(btDeviceAdapter.getBluetoothDeviceIndex()).getName());
                }
            }
        });

    }

    private void btnConnectListener() {
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btDevices.size() > 0) {
                    Log.i(TAG, "Try connecting to " + btDevices.get(btDeviceAdapter.getBluetoothDeviceIndex()).getName());
                    ((MainActivity)getActivity()).startConnectThread(btDevices.get(btDeviceAdapter.getBluetoothDeviceIndex()));
                }
            }
        });
    }


    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                Log.i(TAG, "action found");
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                if (device.getName() != null) {
                    if (!btDevices.contains(device)) {
                        deviceNames.add(device.getName());
                        btDevices.add(device);
                        btDeviceAdapter.notifyDataSetChanged();
                        Log.i(TAG, device.getName());
                        Log.i(TAG, String.valueOf(deviceNames.size()));
                    }
                    Log.i(TAG, "device found");
                } else {
                    // handle
                }

            }
        }
    };

//    private void btnShowPairedDevicesListener(){
//        btnScan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Set<BluetoothDevice> bluetoothDeviceSet = ((MainActivity)getActivity()).getBluetoothAdapter().getBondedDevices();
//                String[] deviceNames = new String[bluetoothDeviceSet.size()];
//                int index = 0;
//
//                if(bluetoothDeviceSet.size() > 0){
//                    for (BluetoothDevice device : bluetoothDeviceSet){
//                        deviceNames[index] = device.getName();
//                        index++;
//                    }
//                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(((MainActivity)getActivity()).getApplicationContext(), android.R.layout.simple_list_item_1,deviceNames);
//                    scanListView.setAdapter(arrayAdapter);
//                }
//            }
//        });
//    }

}
