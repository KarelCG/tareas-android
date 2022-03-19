package com.example.act71;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class batman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batman);
    }

    public void onClick(View view){

        Intent miIntent=null;

        switch (view.getId()){
            case R.id.btnregresar:
                miIntent=new Intent(batman.this, MainActivity.class);
                break;

            case R.id.btnsiguiente:
                miIntent=new Intent(batman.this, morbius.class);
                break;
        }
        startActivity(miIntent);
    }
}

