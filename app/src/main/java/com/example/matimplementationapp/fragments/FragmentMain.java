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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

import java.util.ArrayList;
import java.util.Set;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class FragmentMain extends Fragment  {

    private Button btnBluetoothOn;
    private Button btnBluetoothOff;
    private Button btnScan;

    private ListView scanListView;
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private Intent bluetoothEnabledIntent;
    private int requestCodeForEnabled;

    ArrayList<String> deviceNames;
//    ArrayAdapter arrayAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bluetoothEnabledIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btnBluetoothOn = view.findViewById(R.id.btnBluetoothOn);
        btnBluetoothOff = view.findViewById(R.id.btnBluetoothOff);
        btnScan = view.findViewById(R.id.btnScan);
        scanListView = view.findViewById(R.id.scanListView);
        requestCodeForEnabled = 1;

        bluetoothOnMethod();
        bluetoothOffMethod();
        btnScanListener();
//        btnShowPairedDevicesListener();

        deviceNames = new ArrayList<>();
//        arrayAdapter = new ArrayAdapter<String>(((MainActivity)getActivity()).getApplicationContext(), android.R.layout.simple_list_item_1,stringArrayList);

        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        ((MainActivity)getActivity()).registerReceiver(receiver,filter);

        // filling the listview
//        scanListView.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == requestCodeForEnabled){
            if(resultCode == RESULT_OK){
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(), "Bluetooth Enabled", Toast.LENGTH_SHORT).show();
            } else if(resultCode == RESULT_CANCELED){
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth Enabling Cancelled",Toast.LENGTH_LONG).show();
            }
        }
    }

    private void bluetoothOnMethod(){
        btnBluetoothOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bluetoothAdapter==null){
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth is not supported by device.",Toast.LENGTH_LONG).show();
                } else {
                    if(!bluetoothAdapter.isEnabled()){
                        startActivityForResult(bluetoothEnabledIntent,requestCodeForEnabled);
//                        Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth will be Enabled.",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    private void bluetoothOffMethod() {
        btnBluetoothOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bluetoothAdapter.isEnabled()){
                    bluetoothAdapter.disable();
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth Disabled.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void btnScanListener(){
        btnScan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                // Quick permission check
                int permissionCheck = ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_FINE_LOCATION");
                permissionCheck += ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_COARSE_LOCATION");
                if (permissionCheck != 0) {

                    ((MainActivity)getActivity()).requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001); //Any number
                }
                bluetoothAdapter.startDiscovery();
                Log.i("btscan","discovery started");
            }
        });
    }

    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
//            Log.i("btscan","action found but not equal");
            if(BluetoothDevice.ACTION_FOUND.equals(action)){
                Log.i("btscan","action found");
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
//                deviceNames.add(device.getName());
//                arrayAdapter.notifyDataSetChanged();
                Log.i("btscan",device.getName());
                Log.i("btscan",String.valueOf(deviceNames.size()));
            }
        }
    };

    private void btnShowPairedDevicesListener(){
        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Set<BluetoothDevice> bluetoothDeviceSet = bluetoothAdapter.getBondedDevices();
                String[] deviceNames = new String[bluetoothDeviceSet.size()];
                int index = 0;

                if(bluetoothDeviceSet.size() > 0){
                    for (BluetoothDevice device : bluetoothDeviceSet){
                        deviceNames[index] = device.getName();
                        index++;
                    }
                    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(((MainActivity)getActivity()).getApplicationContext(), android.R.layout.simple_list_item_1,deviceNames);
                    scanListView.setAdapter(arrayAdapter);
                }
            }
        });
    }

}
