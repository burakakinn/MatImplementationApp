package com.example.matimplementationapp.fragments;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

public class FragmentQuizMode extends Fragment {

    private Button btnSend;
    private EditText animalNameEditext;

    @Override
    public void onResume() {
        super.onResume();
        //   getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
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
        View view = inflater.inflate(R.layout.fragment_quiz_mode,container,false);

        findViewByIds(view);
        addListeners();

        return view;
    }

    private void findViewByIds(View view) {
        btnSend = view.findViewById(R.id.btn_send);
        animalNameEditext = view.findViewById(R.id.animal_name_edit_text);
    }

    private void addListeners() {
        btnSendListener();
    }

    private void btnSendListener(){
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData(animalNameEditext.getText().toString());
            }
        });
    }
}
