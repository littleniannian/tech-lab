package com.jarvis.techlab.pattern.observe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    float temperature;

    float humidity;

    float pressure;

    private List<Observe> observes;

    public WeatherData() {
        this.observes = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserver(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notifyObserver() {
        for (Observe observe: observes) {
            observe.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
