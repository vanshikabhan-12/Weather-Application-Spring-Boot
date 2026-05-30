package com.weatherapp.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeatherByCity(String city) {

        if(city.equalsIgnoreCase("Pune")) {
            return "Pune: 27°C, Cloudy";
        } else if(city.equalsIgnoreCase("Mumbai")) {
            return "Mumbai: 30°C, Humid";
        } else if(city.equalsIgnoreCase("Delhi")) {
            return "Delhi: 25°C, Sunny";
        } else {
            return "Weather data not available for " + city;
        }
    }
}
