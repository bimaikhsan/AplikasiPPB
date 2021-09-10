package com.example.aplikasipbb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout mainlayout = findViewById(R.id.layout);
        Button buttonUbah = findViewById(R.id.ubah);
        Button buttonUrl = findViewById(R.id.url);
        Button buttonKeluar = findViewById(R.id.keluar);

        CheckBox ckputih = findViewById(R.id.bgputih);
        CheckBox ckmerah = findViewById(R.id.bgmerah);

        buttonUbah.setOnClickListener(v -> {
            Context context = getApplicationContext();
            CharSequence text = "Pilih Warna !";
            int color = 0;
            if (ckputih.isChecked()){
                color = Color.rgb(255,255,255);
                text = "Putih";
            }
            if (ckmerah.isChecked()) {
                color = Color.rgb(255, 0, 0);
                text = "Merah";
            }
            if (ckputih.isChecked() & ckmerah.isChecked()) {
                color = Color.rgb(255, 102, 102);
                text = "Merah Muda";
            }

            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            mainlayout.setBackgroundColor(color);

        });
        buttonUrl.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, WebkampusActivity.class);
            startActivity(intent);
        });
        buttonKeluar.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(false);
            builder.setMessage("Apakah Yakin Ingin Keluar ?");
            builder.setPositiveButton("Ya", (dialogInterface, i) -> finish());
            builder.setNegativeButton("Tidak", (dialogInterface, i) -> dialogInterface.cancel());
            AlertDialog alert = builder.create();
            alert.show();
        });
    }
}