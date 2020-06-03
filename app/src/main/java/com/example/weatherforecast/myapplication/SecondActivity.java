package com.example.weatherforecast.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherforecast.R;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextWriteCity;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.city_layout);
//        initViews();
//
//    }


    private void initViews() {
        editTextWriteCity = findViewById(R.id.btnEditTextCity);
        editTextWriteCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });

    }

}
