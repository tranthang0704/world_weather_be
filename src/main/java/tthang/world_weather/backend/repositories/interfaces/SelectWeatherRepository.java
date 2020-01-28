package tthang.world_weather.backend.repositories.interfaces;

import tthang.world_weather.backend.models.WeatherInfo;

import java.util.List;

public interface SelectWeatherRepository {
    List<WeatherInfo> getWeatherInfo(String id);
}
