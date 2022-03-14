package tthang.world_weather.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tthang.world_weather.backend.models.WeatherInfo;
import tthang.world_weather.backend.repositories.interfaces.SelectWeatherRepository;

@Service
public class SelectWeatherServiceImpl implements SelectWeatherService {

    @Autowired
    SelectWeatherRepository selectWeatherRepository;

    @Override
    public WeatherInfo getWeatherInfo(String id) {
        return selectWeatherRepository.getWeatherInfo(id);
    }
}
