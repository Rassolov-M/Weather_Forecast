package com.example.weatherforecast.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherforecast.MainActivity;
import com.example.weatherforecast.R;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextWriteCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_city);
        initViews();

    }


    private void initViews() {
        editTextWriteCity = findViewById(R.id.writeCity);
        editTextWriteCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });

    }

}
