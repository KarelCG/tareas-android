package com.example.act8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_link, btn_link2, btn_link3, btn_link4, btn_link5;
    private String url, url2, url3, url4, url5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_link = findViewById(R.id.btn_link);
        btn_link2 = findViewById(R.id.btn_link2);
        btn_link3 = findViewById(R.id.btn_link3);
        btn_link4 = findViewById(R.id.btn_link4);
        btn_link5 = findViewById(R.id.btn_link5);
        url = "https://www.ae.com/mx/es/p/men/polos/polos/ae-slim-fit-pique-polo-shirt/1165_9150_100?nvid=pdp%3A1165_9150_613&menu=cat4840004";
        url2 = "https://www.ae.com/mx/es/p/men/polos/polos/ae-slim-fit-pique-polo-shirt/1165_9150_613?nvid=pdp%3A1165_9150_308&menu=cat4840004";
        url3 = "https://www.ae.com/mx/es/p/men/polos/polos/ae-slim-fit-pique-polo-shirt/1165_9150_001?nvid=pdp%3A1165_9150_100&menu=cat4840004";
        url4 = "https://www.ae.com/mx/es/p/men/polos/polos/ae-slim-fit-pique-polo-shirt/1165_9150_499?nvid=pdp%3A1165_9150_410&menu=cat4840004";
        url5 = "https://www.ae.com/mx/es/p/men/polos/polos/ae-slim-flex-polo-shirt/1165_9146_800?menu=cat4840004";
    }

    public void Comprar(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.btn_link:
                Uri uri = Uri.parse(url);
                intent = new Intent(Intent.ACTION_VIEW, uri);
                break;
            case R.id.btn_link2:
                Uri uri2 = Uri.parse(url2);
                intent = new Intent(Intent.ACTION_VIEW, uri2);
                break;
            case R.id.btn_link3:
                Uri uri3 = Uri.parse(url3);
                intent = new Intent(Intent.ACTION_VIEW, uri3);
                break;
            case R.id.btn_link4:
                Uri uri4 = Uri.parse(url4);
                intent = new Intent(Intent.ACTION_VIEW, uri4);
                break;
            case R.id.btn_link5:
                Uri uri5 = Uri.parse(url5);
                intent = new Intent(Intent.ACTION_VIEW, uri5);
                break;
        }
        startActivity(intent);
    }


}