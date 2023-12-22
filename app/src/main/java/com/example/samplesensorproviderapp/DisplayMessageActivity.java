package com.example.samplesensorproviderapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Recuperar a mensagem do Intent
        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Exibir a mensagem na TextView ou em qualquer componente de UI que você tenha
        TextView textView = findViewById(R.id.textViewMessage);
        textView.setText(message);
    }
}
