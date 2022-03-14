package tthang.world_weather.backend.repositories.interfaces;

import tthang.world_weather.backend.models.WeatherInfo;

import java.util.List;

public interface SelectWeatherRepository {

    default void log() {
        logout();
    }

    WeatherInfo getWeatherInfo(String id);
    private void logout() {
        System.out.println("Logged");
    }
}
