package com.lecheria.lecheria.Activities;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lecheria.lecheria.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConteoCuartoFragment extends Fragment {


    public ConteoCuartoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conteo_cuarto, container, false);
    }


}
