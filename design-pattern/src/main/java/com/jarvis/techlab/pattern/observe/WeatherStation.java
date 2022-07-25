package com.jarvis.techlab.pattern.observe;

public class WeatherStation {
    /**
     * 总结，我认为当出现一对多关系的时候，就要首先想到使用观察者模式
     *
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80.0f,65f,30.4f);
    }
}
