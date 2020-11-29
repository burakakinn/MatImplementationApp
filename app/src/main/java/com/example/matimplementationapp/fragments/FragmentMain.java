package com.example.matimplementationapp.fragments;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class FragmentMain extends Fragment  {

    private Button btnBluetoothOn;
    private Button btnBluetoothOff;
    private Button btnStartScan;
    private Button btnStopScan;
    private Button btnEnableDiscoverability;

    private RecyclerView btDevicesRecyclerView;
    private Intent bluetoothEnabledIntent;
    private ArrayList<BluetoothDevice> btDevices;
    private ArrayList<String> deviceNames;

    static final int STATE_LISTENING = 1;
    static final int STATE_CONNECTING = 2;
    static final int STATE_CONNECTED = 3;
    static final int STATE_CONNECTION_FAILED = 4;
    static final int STATE_MESSAGE_RECEIVED = 5;

    private int REQUEST_ENABLE_BLUETOOTH = 1;

    private static final String APP_NAME = "BT_SERVER";
    public static final UUID MY_UUID = UUID.fromString("750aaea4-3254-11eb-adc1-0242ac120002");

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
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        findViewByIds(view);

        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        ((MainActivity)getActivity()).registerReceiver(receiver,filter);

        bluetoothOnMethod();
        bluetoothOffMethod();
        btnStartScanListener();
        btnStopScanListener();
        btnEnableDiscoverabilityListener();

        btDevicesRecyclerView.setLayoutManager(new LinearLayoutManager(((MainActivity)getActivity()).getApplicationContext()));
        btDevicesRecyclerView.setAdapter(btDeviceAdapter);

        return view;
    }

    private void findViewByIds(View view) {
        btnBluetoothOn = view.findViewById(R.id.btnBluetoothOn);
        btnBluetoothOff = view.findViewById(R.id.btnBluetoothOff);
        btnStartScan = view.findViewById(R.id.btnStartScan);
        btnStopScan = view.findViewById(R.id.btnStopScan);
        btDevicesRecyclerView = view.findViewById(R.id.btDeviceRecyclerView);
        btnEnableDiscoverability = view.findViewById(R.id.btnEnableDiscoverability);
    }

    private class AcceptThread extends Thread {
        private final BluetoothServerSocket mmServerSocket;

        public AcceptThread() {
            // Use a temporary object that is later assigned to mmServerSocket
            // because mmServerSocket is final.
            BluetoothServerSocket tmp = null;
            try {
                // MY_UUID is the app's UUID string, also used by the client code.
                tmp = ((MainActivity)getActivity()).getBluetoothAdapter().listenUsingRfcommWithServiceRecord(APP_NAME, MY_UUID);
            } catch (IOException e) {
                Log.e("Server", "Socket's listen() method failed", e);
            }
            mmServerSocket = tmp;
        }

        public void run() {
            BluetoothSocket socket = null;
            // Keep listening until exception occurs or a socket is returned.
            while (true) {
                try {
                    socket = mmServerSocket.accept();
                } catch (IOException e) {
                    Log.e("Server", "Socket's accept() method failed", e);
                    break;
                }

                if (socket != null) {
                    // A connection was accepted. Perform work associated with
                    // the connection in a separate thread.
//                    manageMyConnectedSocket(socket);
                    try {
                        mmServerSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }

        // Closes the connect socket and causes the thread to finish.
        public void cancel() {
            try {
                mmServerSocket.close();
            } catch (IOException e) {
                Log.e("Server", "Could not close the connect socket", e);
            }
        }
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

    private void bluetoothOnMethod(){
        btnBluetoothOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((MainActivity)getActivity()).getBluetoothAdapter()==null){
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth is not supported by device.",Toast.LENGTH_LONG).show();
                } else {
                    if(!((MainActivity)getActivity()).getBluetoothAdapter().isEnabled()){
                        startActivityForResult(bluetoothEnabledIntent,REQUEST_ENABLE_BLUETOOTH);
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
                if(((MainActivity)getActivity()).getBluetoothAdapter().isEnabled()){
                    ((MainActivity)getActivity()).getBluetoothAdapter().disable();
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Bluetooth Disabled.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void btnStartScanListener(){
        btnStartScan.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                // Quick permission check
                int permissionCheck = ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_FINE_LOCATION");
                permissionCheck += ((MainActivity)getActivity()).checkSelfPermission("Manifest.permission.ACCESS_COARSE_LOCATION");
                if (permissionCheck != 0) {

                    ((MainActivity)getActivity()).requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 1001); //Any number
                }
                ((MainActivity)getActivity()).getBluetoothAdapter().startDiscovery();
                Log.i("btscan","scan started");
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Scan Started",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void btnStopScanListener(){
        btnStopScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).getBluetoothAdapter().cancelDiscovery();
                Log.i("btscan","scan stopped");
                Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Scan Stopped",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void btnEnableDiscoverabilityListener() {
        btnEnableDiscoverability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverableIntent =
                        new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 60);
                startActivity(discoverableIntent);
            }
        });
    }


    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if(BluetoothDevice.ACTION_FOUND.equals(action)){
                Log.i("btscan","action found");
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                if(device.getName() != null){
                    if(!btDevices.contains(device)){
                        deviceNames.add(device.getName());
                        btDevices.add(device);
                        btDeviceAdapter.notifyDataSetChanged();
                        Log.i("btscan",device.getName());
                        Log.i("btscan",String.valueOf(deviceNames.size()));
                    }
                    Log.i("btscan","device found");
                } else {
                    // handle
                }

            }
        }
    };

    Handler handler = new Handler(new Handler.Callback(){
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            switch (msg.what){
                case STATE_LISTENING:
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Listening",Toast.LENGTH_LONG).show();
                case STATE_CONNECTING:
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Connecting",Toast.LENGTH_LONG).show();
                case STATE_CONNECTED:
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Connected",Toast.LENGTH_LONG).show();
                case STATE_CONNECTION_FAILED:
                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Connection Failed",Toast.LENGTH_LONG).show();
                case STATE_MESSAGE_RECEIVED:
//                    Toast.makeText(((MainActivity)getActivity()).getApplicationContext(),"Listening",Toast.LENGTH_LONG).show();
            }
            return true;
        }
    });

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
