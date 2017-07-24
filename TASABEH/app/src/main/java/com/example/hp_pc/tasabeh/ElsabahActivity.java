package com.example.hp_pc.tasabeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ElsabahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorey);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ElsabahFragment())
                .commit();
    }
}
