package com.compass.abdelrahmantarek.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String TAG = "smores";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //retrieving string from extras
        String value = getIntent().getStringExtra(TAG);
        Toast.makeText(this,value,Toast.LENGTH_LONG).show();
    }
}
