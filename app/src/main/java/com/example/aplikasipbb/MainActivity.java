package com.example.aplikasipbb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonUrl = findViewById(R.id.url);
        Button buttonKeluar = findViewById(R.id.keluar);
        Button checkBox = findViewById(R.id.checkbox);

        checkBox.setOnClickListener(view -> {
            finish();
            Intent intent = new Intent(this, CheckboxActivity.class);
            startActivity(intent);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Toast toast1 = Toast.makeText(this, "Tentang",Toast.LENGTH_SHORT);
                toast1.show();
            case R.id.setting:
                Toast toast2 = Toast.makeText(this, "Setting",Toast.LENGTH_SHORT);
                toast2.show();
            case R.id.help:
                Toast toast3 =  Toast.makeText(this, "Bantuan",Toast.LENGTH_SHORT);
                toast3.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}