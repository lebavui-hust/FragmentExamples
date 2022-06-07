package com.example.testapp6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import io.bloco.faker.Faker;

public class BookActivity extends AppCompatActivity {

    List<String> pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Faker faker = new Faker();
        pages = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            pages.add(faker.lorem.paragraph());

        BookAdapter adapter = new BookAdapter(this);
        ViewPager2 viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
    }

    private class BookAdapter extends FragmentStateAdapter {


        public BookAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return GreenFragment.newInstance(pages.get(position), "");
        }

        @Override
        public int getItemCount() {
            return pages.size();
        }
    }
}