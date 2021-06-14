package com.example.matimplementationapp.fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

public class FragmentAnimal extends Fragment {

    private Button btnPrev;
    private Button btnNext;
    private Button btnLearnMode;
    private Button btnAskMode;
    private Button btnRepeat;
    private Button btnInfo;
    private Button btnSound;
    private Button btnName;
    private Button btnYes;
    private Button btnNo;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_animal,container,false);

        findViewByIds(view);
        addListeners();

        return view;
    }

    private void findViewByIds(View view) {
        btnPrev = view.findViewById(R.id.btnPrev);
        btnNext = view.findViewById(R.id.btnNext);
        btnLearnMode = view.findViewById(R.id.btnLearn);
        btnAskMode = view.findViewById(R.id.btnAsk);
        btnRepeat = view.findViewById(R.id.btnRepeat);
        btnInfo = view.findViewById(R.id.btnInfo);
        btnSound = view.findViewById(R.id.btnSound);
        btnName = view.findViewById(R.id.btnName);
        btnYes = view.findViewById(R.id.btnYes);
        btnNo = view.findViewById(R.id.btnNo);
    }

    private void addListeners() {
        btnPrevListener();
        btnNextListener();
        btnLearnListener();
        btnAskListener();
        btnRepeatListener();
        btnInfoListener();
        btnSoundListener();
        btnNameListener();
        btnYesListener();
        btnNoListener();
    }

    private void btnPrevListener(){
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "80;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnNextListener(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;80;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnLearnListener(){
        btnLearnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;80;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnAskListener(){
        btnAskMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;80;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnRepeatListener(){
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;80;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnInfoListener(){
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;80;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnSoundListener(){
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;80;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnNameListener(){
        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;80;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnYesListener(){
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;80;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
    private void btnNoListener(){
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;80;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }
}
