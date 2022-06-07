package com.example.testapp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity implements BlueFragment.UpdateDetailListener {
    RedFragment redFragment;
    BlueFragment blueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        blueFragment = new BlueFragment();
        ft.add(R.id.layout_blue, blueFragment);
        redFragment = new RedFragment();
        ft.add(R.id.layout_red, redFragment);
        ft.commit();
    }

    @Override
    public void UpdateDetail(String item) {
        redFragment.UpdateDetail(item);
    }
}