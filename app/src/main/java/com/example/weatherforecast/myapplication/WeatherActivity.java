package com.example.weatherforecast.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.weatherforecast.R;

public class WeatherActivity extends AppCompatActivity {
    private TextView textViewTemperature;
    EditText editTextUrl;
    private Button btnCurrentTime, btnIncreaseByOneHour, btnIncreaseByTwoHour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_degrees);
        initView();
        setOnClickBtnCurrentTime();
        setOnClickBtnOneHour();
        setOnClickBtnTwoHour();
        setOnClickBtnOpenOnBrowser();

    }


    private void initView() {
        btnCurrentTime = findViewById(R.id.BtnCurrentTime);
        btnIncreaseByOneHour = findViewById(R.id.BtnIncreaseByOneHour);
        btnIncreaseByTwoHour = findViewById(R.id.BtnIncreaseByTwoHour);
        textViewTemperature = findViewById(R.id.textViewTemperature);

    }


    private void setOnClickBtnCurrentTime() {
        btnCurrentTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String counterText = textViewTemperature.getText().toString();
                int count = Integer.parseInt(counterText);
                String newCounterValueText = String.valueOf(count = 0);
                textViewTemperature.setText(newCounterValueText);
            }
        });
    }

    private void setOnClickBtnOneHour() {
        btnIncreaseByOneHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String counterText = textViewTemperature.getText().toString();
                int count = Integer.parseInt(counterText);
                String newCounterValueText = String.valueOf(++count);
                textViewTemperature.setText(newCounterValueText);
            }
        });
    }

    private void setOnClickBtnTwoHour() {
        btnIncreaseByTwoHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String counterText = textViewTemperature.getText().toString();
                int count = Integer.parseInt(counterText);
                String newCounterValueText = String.valueOf(count + 2);
                textViewTemperature.setText(newCounterValueText);
            }
        });
    }


    private void setOnClickBtnOpenOnBrowser(){
        final EditText site = findViewById(R.id.editTextUrl);
        Button go = findViewById(R.id.btnClickOpenOnBrowser);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = site.getText().toString();
                Uri uri = Uri.parse(url);
                Intent browser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(browser);
            }
        });
    }

}
