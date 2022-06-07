package com.example.testapp6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity implements BlueFragment.UpdateDetailListener {

    BlueFragment blueFragment;
    RedFragment redFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);

        Log.v("TAG", fragment.getClass().getSimpleName());

        if (fragment.getClass().getSimpleName().equals("RedFragment"))
            redFragment = (RedFragment)fragment;
        else
            blueFragment = (BlueFragment) fragment;
    }

    @Override
    public void UpdateDetail(String item) {
        redFragment.UpdateDetail(item);
    }


}