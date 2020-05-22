package com.example.weatherforecast;

public class Singleton {

    Singleton instance;

    private Singleton() {
    }

    public Singleton getInstance() {
        return instance;
    }
}
