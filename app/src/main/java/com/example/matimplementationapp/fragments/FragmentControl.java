package com.example.matimplementationapp.fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

public class FragmentControl extends Fragment {

    private Button btnName;
    private Button btnInfo;
    private Button btnSound;
    private Button btnNext;
    private Button btnPrev;

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_control,container,false);



        findViewByIds(view);
        addListeners();

        return view;
    }

    private void findViewByIds(View view) {
        btnName = view.findViewById(R.id.btnName);
        btnInfo = view.findViewById(R.id.btnInfo);
        btnSound = view.findViewById(R.id.btnSound);
        btnNext = view.findViewById(R.id.btnNext);
        btnPrev = view.findViewById(R.id.btnPrevious);
    }

    private void addListeners() {
        btnNameListener();
        btnSoundListener();
        btnInfoListener();
        btnNextListener();
        btnPrevListener();
    }

    private void btnNameListener(){
        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("Name");
            }
        });
    }
    private void btnSoundListener(){
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("Sound");
            }
        });
    }
    private void btnInfoListener(){
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("Info");
            }
        });
    }
    private void btnNextListener(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("Next");
            }
        });
    }
    private void btnPrevListener(){
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("Previous");
            }
        });
    }
}
