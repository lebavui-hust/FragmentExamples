package com.example.testapp6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {

    RedFragment redFragment;
    BlueFragment blueFragment;
    GreenFragment greenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        redFragment = new RedFragment();
        blueFragment = new BlueFragment();
        greenFragment = new GreenFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_red) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layout_fragment, redFragment)
                    .addToBackStack("RED")
                    .commit();
        } else if (id == R.id.action_blue) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layout_fragment, blueFragment)
                    .addToBackStack("BLUE")
                    .commit();
        } else if (id == R.id.action_green) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layout_fragment, greenFragment)
                    .addToBackStack("GREEN")
                    .commit();
        }

        return true;
    }
}