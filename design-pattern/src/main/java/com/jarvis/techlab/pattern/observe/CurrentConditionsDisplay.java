package com.jarvis.techlab.pattern.observe;

/**
 * 实时现实器类
 */
public class CurrentConditionsDisplay implements Observe,DisplayElement{

    private float temperature;

    private float humidity;

    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("temperature [%s] humidity [%s] pressure [%s]%n",temperature,humidity,pressure);
    }
}
