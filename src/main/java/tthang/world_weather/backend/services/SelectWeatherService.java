package tthang.world_weather.backend.services;

import tthang.world_weather.backend.models.WeatherInfo;

public interface SelectWeatherService {
    WeatherInfo getWeatherInfo(String id);
}
