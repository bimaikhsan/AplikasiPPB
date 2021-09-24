package com.example.aplikasipbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Button buttonFragment1 = findViewById(R.id.fragment1);
        Button buttonFragment2 = findViewById(R.id.fragment2);
        Button buttonKembali = findViewById(R.id.kembali);

        buttonFragment1.setOnClickListener(view -> {
//            FragmentManager fm = getSupportFragmentManager();
//            fm.beginTransaction().add(R.id.konten, new SatuFragment()).commit();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.konten, new SatuFragment());
            ft.commit();
        });
        buttonFragment2.setOnClickListener(view -> {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.konten, new DuaFragment());
            ft.commit();
        });
        buttonKembali.setOnClickListener(view -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}