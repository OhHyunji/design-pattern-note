package com.headfirst.observer.simple;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temp;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object element : observers) {
            Observer observer = (Observer) element;
            observer.update(temp, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        measurementChanged();
    }
}
