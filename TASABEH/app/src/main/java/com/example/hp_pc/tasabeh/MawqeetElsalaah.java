package com.example.hp_pc.tasabeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MawqeetElsalaah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mawqeet_elsalaah);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mohtawa, new MawqeetElsalaahFragment())
                .commit();
    }
}
