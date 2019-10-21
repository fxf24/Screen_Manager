package com.example.screen_manager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    BlankFragment bf1;
    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.linear1);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        bf1 = new BlankFragment();
        ft.replace(R.id.linear1, bf1);
        ft.commit();
    }
}
