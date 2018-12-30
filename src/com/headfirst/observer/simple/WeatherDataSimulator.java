package com.headfirst.observer.simple;

public class WeatherDataSimulator {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);

        wd.setMeasurements(10.0f, 20.5f);
    }
}
