package com.example.aplikasisubmissioniqbala;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class TentangSaya extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_saya);

        Button tombolKembali = findViewById(R.id.tombol_kembali);
        TableRow Email = findViewById(R.id.email);

        tombolKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
