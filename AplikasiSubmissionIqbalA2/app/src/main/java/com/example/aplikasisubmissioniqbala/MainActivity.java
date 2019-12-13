package com.example.aplikasisubmissioniqbala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.aplikasisubmissioniqbala.Adapter.KeretaListAdapter;
import com.example.aplikasisubmissioniqbala.Model.DataKereta;
import com.example.aplikasisubmissioniqbala.Model.Kereta;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView keretaApi;
    private ArrayList<Kereta> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keretaApi = findViewById(R.id.kereta_api);
        keretaApi.setHasFixedSize(true);

        list.addAll(DataKereta.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        keretaApi.setLayoutManager(new LinearLayoutManager(this));
        KeretaListAdapter keretaListAdapter = new KeretaListAdapter(list);
        keretaApi.setAdapter(keretaListAdapter);

        keretaListAdapter.setOnItemClickCallback(new KeretaListAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Kereta data) {
                showSelectedKereta(data);
            }
        });
    }

    private void showSelectedKereta(Kereta kereta) {
        switch (kereta.getNama()){
            case "Tentang Saya":
                Intent pertama = new Intent(MainActivity.this, TentangSaya.class);
                startActivity(pertama);
                break;

            case "Kereta Api Uap":
                Intent kedua = new Intent(MainActivity.this, KeretaApiUap.class);
                startActivity(kedua);
                break;

            case "Kereta Api Ringan Dijalan":
                Intent ketiga = new Intent(MainActivity.this, KeretaApiRinganDijalan.class);
                startActivity(ketiga);
                break;

            case "Kereta Api Rel Listrik":
                Intent keempat = new Intent(MainActivity.this, KeretaApiRelListrik.class);
                startActivity(keempat);
                break;

            case "Kereta Api Mono Rail":
                Intent kelima = new Intent(MainActivity.this, KeretaApiMonoRail.class);
                startActivity(kelima);
                break;

            case "Kereta Api Diesel":
                Intent keenam = new Intent(MainActivity.this, KeretaApiDiesel.class);
                startActivity(keenam);
                break;

            case "Kereta Api Daya Magnet":
                Intent ketujuh = new Intent(MainActivity.this, KeretaApiDayaMagnet.class);
                startActivity(ketujuh);
                break;

            case "Kereta Api CC200":
                Intent kedelapan = new Intent(MainActivity.this, KeretaApiCC200.class);
                startActivity(kedelapan);
                break;

            case "Kereta Api BB204":
                Intent kesembilan = new Intent(MainActivity.this, KeretaApiBB204.class);
                startActivity(kesembilan);
                break;

            case "Kereta Api Bawah Tanah":
                Intent kesepuluh = new Intent(MainActivity.this, KeretaApiBawahTanah.class);
                startActivity(kesepuluh);
                break;
        }
    }
}
