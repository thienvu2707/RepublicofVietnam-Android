package com.example.android.republicofvietnam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DaNangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new DanangFragment()).commit();
    }
}
