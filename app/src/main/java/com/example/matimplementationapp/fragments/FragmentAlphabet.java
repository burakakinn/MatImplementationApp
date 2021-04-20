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

public class FragmentAlphabet extends Fragment {

    private Button btnSong;
    private Button btnRepeat;
    private Button btnSpell;
    private Button btnLetterFreeMode;
    private Button btnObjectFreeMode;
    private Button btnLetterAskMode;
    private Button btnObjectAskMode;
    private Button btnA;
    private Button btnB;
    private Button btnC;
    private Button btnD;
    private Button btnE;
    private Button btnF;
    private Button btnG;
    private Button btnH;
    private Button btnI;
    private Button btnJ;
    private Button btnK;
    private Button btnL;
    private Button btnM;
    private Button btnN;
    private Button btnO;
    private Button btnP;
    private Button btnQ;
    private Button btnR;
    private Button btnS;
    private Button btnT;
    private Button btnU;
    private Button btnV;
    private Button btnW;
    private Button btnX;
    private Button btnY;
    private Button btnZ;


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
        View view = inflater.inflate(R.layout.fragment_alphabet,container,false);
        findViewByIds(view);
        addListeners();
        return view;
    }

    private void findViewByIds(View view) {
        btnSong = view.findViewById(R.id.btnSong);
        btnRepeat = view.findViewById(R.id.btnRepeat);
        btnSpell = view.findViewById(R.id.btnSpell);
        btnLetterFreeMode = view.findViewById(R.id.btnLetterFree);
        btnObjectFreeMode = view.findViewById(R.id.btnObjectFree);
        btnLetterAskMode = view.findViewById(R.id.btnLetterAsk);
        btnObjectAskMode = view.findViewById(R.id.btnObjectAsk);
        btnA = view.findViewById(R.id.btnA);
        btnB = view.findViewById(R.id.btnB);
        btnC = view.findViewById(R.id.btnC);
        btnD = view.findViewById(R.id.btnD);
        btnE = view.findViewById(R.id.btnE);
        btnF = view.findViewById(R.id.btnF);
        btnG = view.findViewById(R.id.btnG);
        btnH = view.findViewById(R.id.btnH);
        btnI = view.findViewById(R.id.btnI);
        btnJ = view.findViewById(R.id.btnJ);
        btnK = view.findViewById(R.id.btnK);
        btnL = view.findViewById(R.id.btnL);
        btnM = view.findViewById(R.id.btnM);
        btnN = view.findViewById(R.id.btnN);
        btnO = view.findViewById(R.id.btnO);
        btnP = view.findViewById(R.id.btnP);
        btnQ = view.findViewById(R.id.btnQ);
        btnR = view.findViewById(R.id.btnR);
        btnS = view.findViewById(R.id.btnS);
        btnT = view.findViewById(R.id.btnT);
        btnU = view.findViewById(R.id.btnU);
        btnV = view.findViewById(R.id.btnV);
        btnW = view.findViewById(R.id.btnW);
        btnX = view.findViewById(R.id.btnX);
        btnY = view.findViewById(R.id.btnY);
        btnZ = view.findViewById(R.id.btnZ);
    }

    private void addListeners() {
        btnAAddListener();
        btnBAddListener();
        btnCAddListener();
        btnDAddListener();
        btnEAddListener();
        btnFAddListener();
        btnGAddListener();
        btnHAddListener();
        btnIAddListener();
        btnJAddListener();
        btnKAddListener();
        btnLAddListener();
        btnMAddListener();
        btnNAddListener();
        btnOAddListener();
        btnPAddListener();
        btnQAddListener();
        btnRAddListener();
        btnSAddListener();
        btnTAddListener();
        btnUAddListener();
        btnVAddListener();
        btnWAddListener();
        btnXAddListener();
        btnYAddListener();
        btnZAddListener();
        btnSongAddListener();
        btnRepeatAddListener();
        btnSpellAddListener();
        btnLetterFreeAddListener();
        btnLetterAskAddListener();
        btnObjectFreeAddListener();
        btnObjectAskAddListener();
    }

    private void btnObjectAskAddListener() {
        btnObjectAskMode.setOnClickListener(new View.OnClickListener() {
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
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;60;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;60;60;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnObjectFreeAddListener() {
        btnObjectFreeMode.setOnClickListener(new View.OnClickListener() {
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
                                        "0;0;0;0;0;0;0;0;0;0;0;0;50;50;50;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;50;50;50;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnLetterAskAddListener() {
        btnLetterAskMode.setOnClickListener(new View.OnClickListener() {
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
                                        "0;0;0;0;0;0;0;0;0;0;50;50;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;60;60;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnLetterFreeAddListener() {
        btnLetterFreeMode.setOnClickListener(new View.OnClickListener() {
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
                                        "0;0;0;0;0;0;0;0;0;0;40;40;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;40;40;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnSpellAddListener() {
        btnSpell.setOnClickListener(new View.OnClickListener() {
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
                                        "0;0;0;0;0;0;0;50;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;50;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                                        "281#");
                    }
                },100);
            }
        });
    }

    private void btnRepeatAddListener() {
    }

    private void btnSongAddListener() {
    }

    private void btnZAddListener() {
        btnZ.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;0;0;0;0;0;69;50;0;0;0;" +
                                "0;0;0;0;0;0;0;0;0;0;37;76;0;0;0;" +
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

    private void btnYAddListener() {
        btnY.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;0;0;0;70;0;0;0;0;0;0;" +
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

    private void btnXAddListener() {
        btnX.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;0;0;60;0;0;0;0;0;0;0;" +
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

    private void btnWAddListener() {
        btnW.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;50;60;0;0;0;0;0;0;0;0;0;" +
                                "0;0;0;0;0;70;0;0;0;0;0;0;0;0;0;" +
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

    private void btnVAddListener() {
        btnV.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;50;40;0;0;0;0;0;0;0;0;0;0;0;" +
                                "0;0;20;70;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btnUAddListener() {
        btnU.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;0;0;0;0;0;0;0;0;80;0;" +
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

    private void btnTAddListener() {
        btnT.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;0;0;0;0;0;0;47;0;0;0;" +
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

    private void btnSAddListener() {
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;53;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "0;0;0;0;0;0;0;0;90;0;0;0;0;0;0;" +
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

    private void btnRAddListener() {
        btnR.setOnClickListener(new View.OnClickListener() {
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

    private void btnQAddListener() {
        btnQ.setOnClickListener(new View.OnClickListener() {
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
                                "0;0;0;0;0;60;0;0;0;0;0;0;0;0;0;" +
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

    private void btnPAddListener() {
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;65;0;0;0;0;0;0;0;0;0;0;0;0;");
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

    private void btnOAddListener() {
        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "50;63;0;0;0;0;0;0;0;0;0;0;0;0;0;");
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ((MainActivity)getActivity()).sendData(
                                "60;80;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btnNAddListener() {
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;70;70;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;76;48;0;" +
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

    private void btnMAddListener() {
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;50;50;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;50;50;0;0;0;" +
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

    private void btnLAddListener() {
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;50;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;88;0;0;0;0;0;0;" +
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

    private void btnKAddListener() {
        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;50;60;0;0;0;0;0;0;0;" +
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

    private void btnJAddListener() {
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;60;0;0;0;0;0;0;0;0;0;" +
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

    private void btnIAddListener() {
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;50;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;67;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btnHAddListener() {
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "60;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;60;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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

    private void btnGAddListener() {
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;55;50;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;45;65;0;" +
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

    private void btnFAddListener() {
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;60;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;80;0;0;0;" +
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

    private void btnEAddListener() {
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;50;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;45;0;0;0;0;0;" +
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

    private void btnDAddListener() {
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;70;0;0;0;0;0;0;0;0;" +
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

    private void btnCAddListener() {
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;45;60;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;30;60;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;1;2;3;");

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
                                        "0;0;0;0;0;0;0;0;0;0;0;0;4;5;6;" +
                                        "281#");
                    }
                },100);


            }
        });
    }

    private void btnBAddListener(){
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;50;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "0;0;0;50;0;0;0;0;0;0;0;0;0;0;0;" +
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
    private void btnAAddListener(){
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).sendData("!" +
                        "0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "45;45;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
                        "45;45;0;0;0;0;0;0;0;0;0;0;0;0;0;" +
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
                                        "281#");
                    }
                },100);

            }
        });
    }
}
