package com.example.ndpsh.ejercicio_08.Fragments;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ndpsh.ejercicio_08.R;


public class InfoFragment extends Fragment implements View.OnClickListener {

    FloatingActionButton fab;

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information");
        builder.setMessage("This alert dialog is just to show a normal informative message to the user, nothing to interact with");
        builder.setNeutralButton("Got it", null);
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
