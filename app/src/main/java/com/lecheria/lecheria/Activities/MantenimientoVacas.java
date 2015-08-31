package com.lecheria.lecheria.Activities;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.lecheria.lecheria.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MantenimientoVacas extends Fragment implements View.OnClickListener{
    Button btn;

    @Override
    public void onClick(View view) {
        Toast.makeText(this.getActivity(),
                "Button is clicked!", Toast.LENGTH_LONG).show();
        Context context = getActivity();
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_signin);
        dialog.setTitle("Title...");
        dialog.show();
    }

    public MantenimientoVacas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(
                R.layout.fragment_mantenimiento_vacas, container, false);

        btn = (Button) view.findViewById(R.id.showDialog);
        btn.setOnClickListener(this);
        return view;
    }
}
