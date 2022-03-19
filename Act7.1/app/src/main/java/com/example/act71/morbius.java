package com.example.act71;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class morbius extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morbius);
    }

    public void onClick(View view){
        Intent miIntent=new Intent(morbius.this, batman.class);
        startActivity(miIntent);
    }
}
