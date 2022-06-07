package com.example.testapp6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RedFragment extends Fragment {

    TextView textDetail;

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_red, container, false);
        textDetail = view.findViewById(R.id.text_detail);
        return view;
    }

    public void UpdateDetail(String item) {
        textDetail.setText(item);
    }
}