package com.example.ndpsh.ejercicio_08.Fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.ndpsh.ejercicio_08.R;


public class AlertsFragment extends Fragment implements View.OnClickListener, DialogInterface.OnClickListener {


    private FloatingActionButton fab;
    private TextView textViewTitle;

    private AlertDialog.Builder builder;
    private Switch switchBtn;


    public AlertsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alerts, container, false);

        fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(this);

        textViewTitle = view.findViewById(R.id.textViewTitle);


        return view;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        if (which == DialogInterface.BUTTON_POSITIVE) {
            if (switchBtn.isChecked()) {
                textViewTitle.setText("Alerts Enebled");
            }else {
                textViewTitle.setText("Alerts Disabled");
            }
        } else if (which == DialogInterface.BUTTON_NEGATIVE) {
            dialog.cancel();
        }

    }

    @Override
    public void onClick(View v) {
        builder = new AlertDialog.Builder(getContext());
        builder.setTitle("EMAIL");
        builder.setMessage("Type your email address to be displayed in the middle of the screen");


        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_fragment_dialog, null);

        switchBtn = dialogView.findViewById(R.id.switchDialog);

        builder.setView(dialogView);


        // Set up the buttons
        builder.setPositiveButton("OK", this);
        builder.setNegativeButton("Cancel", this);
        builder.show();

    }
}
