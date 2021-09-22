package com.example.aplikasipbb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    EditText varNamaInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button entryButton = findViewById(R.id.entryBtn);
        varNamaInput = findViewById(R.id.inputNama);

        entryButton.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("ISINYA", Objects.requireNonNull(varNamaInput.getText().toString()));
            startActivity(intent);
        });

    }
}