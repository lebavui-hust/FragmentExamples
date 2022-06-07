package com.example.testapp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        RedFragment redFragment = new RedFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.layout_fragment, redFragment).commit();

        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GreenFragment greenFragment = new GreenFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.layout_fragment, greenFragment, "GREEN_TAG")
                        .addToBackStack("GREEN")
                        .commit();
            }
        });

        findViewById(R.id.button_replace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GreenFragment greenFragment = new GreenFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layout_fragment, greenFragment, "GREEN_TAG")
                        .addToBackStack("GREEN")
                        .commit();
            }
        });

        findViewById(R.id.button_pop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().popBackStackImmediate();
            }
        });

        findViewById(R.id.button_remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentByTag("GREEN_TAG");
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }
        });
    }
}