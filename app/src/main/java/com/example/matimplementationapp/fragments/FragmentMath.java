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

public class FragmentMath extends Fragment {

    private Button btnSong;
    private Button btnRepeat;
    private Button btnNext;
    private Button btnPrev;
    private Button btnDigitFree;
    private Button btnDigitAsk;
    private Button btnCount;
    private Button btnQuestion;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;

    private Button btnSum;
    private Button btnSubtract;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnEquals;

    @Override
    public void onResume() {
        super.onResume();
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
        View view = inflater.inflate(R.layout.fragment_math,container,false);
        findViewByIds(view);
        addListeners();
        return view;
    }

    private void findViewByIds(View view) {
        btnSong = view.findViewById(R.id.btnSong);
        btnRepeat = view.findViewById(R.id.btnRepeat);
        btnNext = view.findViewById(R.id.btnNext);
        btnPrev = view.findViewById(R.id.btnPrev);
        btnCount = view.findViewById(R.id.btnCount);
        btnQuestion = view.findViewById(R.id.btnQuestion);
        btnDigitFree = view.findViewById(R.id.btnDigitFree);
        btnDigitAsk = view.findViewById(R.id.btnDigitAsk);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btn0 = view.findViewById(R.id.btn0);
        btnSum = view.findViewById(R.id.btnSum);
        btnSubtract = view.findViewById(R.id.btnSubtract);
        btnMultiply = view.findViewById(R.id.btnMultiply);
        btnDivide = view.findViewById(R.id.btnDivide);
        btnEquals = view.findViewById(R.id.btnEqual);
    }

    private void addListeners() {
        btnSongAddListener();
        btnRepeatAddListener();
        btnNextAddListener();
        btnPrevAddListener();
        btnDigitFreeAddListener();
        btnDigitAskAddListener();
        btnCountAddListener();
        btnQuestionAddListener();
        btn1AddListener();
        btn2AddListener();
        btn3AddListener();
        btn4AddListener();
        btn5AddListener();
        btn6AddListener();
        btn7AddListener();
        btn8AddListener();
        btn9AddListener();
        btn0AddListener();
        btnSumAddListener();
        btnSubtractAddListener();
        btnMultiplyAddListener();
        btnDivideAddListener();
        btnEqualsAddListener();
    }

    private void btnDigitFreeAddListener() {
        btnDigitFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                        "80;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnDigitAskAddListener() {
        btnDigitAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                        "0;0;0;0;0;80;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnCountAddListener() {
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                        "0;0;0;0;0;0;0;0;0;80;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnQuestionAddListener() {
        btnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;80;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }


    private void btnRepeatAddListener() {
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;0;80;" +
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

    private void btnSongAddListener() {
        btnSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;80;" +
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
    private void btnNextAddListener() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;0;0;0;0;80;0;0;0;0;0;0;0;0;" +
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

    private void btnPrevAddListener() {
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;80;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn1AddListener() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;80;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn2AddListener() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;80;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn3AddListener() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;80;0;0;0;0;0;0;0;0;" +
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

    private void btn4AddListener() {
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;80;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn5AddListener() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;80;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn6AddListener() {
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;80;0;0;0;0;0;0;0;0;" +
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

    private void btn7AddListener() {
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;80;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn8AddListener() {
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;80;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btn9AddListener() {
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;80;0;0;0;0;0;0;0;0;" +
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

    private void btn0AddListener() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;0;0;80;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btnSumAddListener() {
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;" +
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

    private void btnSubtractAddListener() {
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;" +
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

    private void btnMultiplyAddListener() {
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;");
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

    private void btnDivideAddListener() {
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;" +
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

    private void btnEqualsAddListener() {
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;" +
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
