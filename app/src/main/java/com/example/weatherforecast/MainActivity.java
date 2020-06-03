package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.weatherforecast.myapplication.FragmentCity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        int countOfFragmentInManager = getSupportFragmentManager().getBackStackEntryCount();
        if(countOfFragmentInManager > 0) {
            getSupportFragmentManager().popBackStack();
            /*getSupportFragmentManager().popBackStack("Some_Key",
                    FragmentManager.POP_BACK_STACK_INCLUSIVE);*/
        }
    }

    private TextView textViewCurrentDate;
    private TextView getTextViewCurrentTime;
    private Button discoveryBtnWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentDate();
        currentTime();
        setOnBtnClickDiscoveryWeather();
    }

    private void setOnBtnClickDiscoveryWeather() {
        discoveryBtnWeather = findViewById(R.id.DiscoveryBtnWeather);
        discoveryBtnWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentCity.class);
                startActivity(intent);
            }
        });

    }

    private void currentDate() {
        textViewCurrentDate = findViewById(R.id.textViewCurrent_date);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        textViewCurrentDate.setText(format.format(new Date()));

        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());

    }

    private void currentTime() {
        getTextViewCurrentTime = findViewById(R.id.textViewCurrent_time);
        Date currentDate = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String timeText = timeFormat.format(currentDate);
        getTextViewCurrentTime.setText(timeText);
    }

}
