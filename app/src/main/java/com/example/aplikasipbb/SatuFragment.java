package com.example.aplikasipbb;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SatuFragment extends Fragment {

    public SatuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.fragment_satu, container, false);

        TextView textView = view.findViewById(R.id.text);
        textView.setText("Fragment 1");

        return view;
    }
}