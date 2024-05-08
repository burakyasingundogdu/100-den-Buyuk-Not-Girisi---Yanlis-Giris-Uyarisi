package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        number = findViewById(R.id.editTextNumber);

    }
    public void kontrolEt (View view){
        int sayi = Integer.parseInt(number.getText().toString());
        if (sayi>100){
            Toast.makeText(this, "100'den büyük not olamaz.", Toast.LENGTH_LONG).show();
        }
    }
}