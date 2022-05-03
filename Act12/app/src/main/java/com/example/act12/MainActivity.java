package com.example.act12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.act12.Adaptadores.GaleriaImagenesAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridViewImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViewImagenes = findViewById(R.id.grid_view_imagenes);
        gridViewImagenes.setAdapter(new GaleriaImagenesAdapter(this));
    }
}