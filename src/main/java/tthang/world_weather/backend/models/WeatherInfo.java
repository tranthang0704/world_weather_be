package tthang.world_weather.backend.models;

import lombok.Data;

@Data
public class WeatherInfo {
    private String city;
    private String description;
    private String gps;
    private String time;
    private double tempC;
    private double tempF;
}
