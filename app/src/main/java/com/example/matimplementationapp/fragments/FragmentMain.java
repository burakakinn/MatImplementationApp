package com.example.matimplementationapp.fragments;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

import java.net.Inet4Address;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;

public class FragmentMain extends Fragment {

    private Button btnBluetoothOn;
    private Button btnBluetoothOff;

    private BluetoothAdapter bluetoothAdapter;

    private Intent bluetoothEnabledIntent;
    private int requestCodeForEnabled;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothEnabledIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        btnBluetoothOn = view.findViewById(R.id.btnBluetoothOn);
        btnBluetoothOff = view.findViewById(R.id.btnBluetoothOff);
        requestCodeForEnabled = 1;

        bluetoothOnMethod();
        bluetoothOffMethod();
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == requestCodeForEnabled){
            if(resultCode == RESULT_OK){
                Toast.makeText((MainActivity)getActivity(), "Bluetooth Enabled", Toast.LENGTH_SHORT).show();
            } else if(resultCode == RESULT_CANCELED){
                Toast.makeText((MainActivity)getActivity(),"Bluetooth Enabling Cancelled",Toast.LENGTH_LONG).show();
            }
        }
    }

    private void bluetoothOnMethod(){
        btnBluetoothOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bluetoothAdapter==null){
                    Toast.makeText((MainActivity)getActivity(),"Bluetooth is not supported by device.",Toast.LENGTH_LONG).show();
                } else {
                    if(!bluetoothAdapter.isEnabled()){
                        startActivityForResult(bluetoothEnabledIntent,requestCodeForEnabled);
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
                    Toast.makeText((MainActivity)getActivity(),"Bluetooth Disabled.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
