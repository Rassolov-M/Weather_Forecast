package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherforecast.myapplication.SecondActivity;
import com.example.weatherforecast.myapplication.WeatherActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCurrentDate;
    private TextView getTextViewCurrentTime;
    private Button discoveryBtnWeather;
    private static Logger log = Logger.getLogger(MainActivity.class.getName());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState = "Первый запуск!";
        if (savedInstanceState != null) {
            instanceState = "Повторный запуск!";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_LONG).show();
        try {
            log.info("onCreate()");
        } catch (Exception e) {
            e.printStackTrace();
        }

        currentDate();
        currentTime();
        setOnBtnClickDiscoveryWeather();
    }

    private void setOnBtnClickDiscoveryWeather() {
        discoveryBtnWeather = findViewById(R.id.DiscoveryBtnWeather);
        discoveryBtnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    private void currentDate() {
        textViewCurrentDate = findViewById(R.id.textViewCurrentDate);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        textViewCurrentDate.setText(format.format(new Date()));

        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

    }

    private void currentTime() {
        getTextViewCurrentTime = findViewById(R.id.textViewCurrentTime);
        Date currentDate = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String timeText = timeFormat.format(currentDate);
        getTextViewCurrentTime.setText(timeText);
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onStart()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск!! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        try {
            log.info("Повторный запуск!! - onRestoreInstanceState()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onResume()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onPause()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onSaveInstanceState()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onStop()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onRestart()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
        try {
            log.info("onDestroy()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
