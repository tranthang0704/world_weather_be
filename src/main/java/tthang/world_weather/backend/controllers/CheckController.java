package tthang.world_weather.backend.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tthang.world_weather.backend.models.WeatherInfo;
import tthang.world_weather.backend.repositories.interfaces.SelectWeatherRepository;

import java.sql.Date;
import java.util.List;

@RestController
public class CheckController {

    @Autowired
    SelectWeatherRepository selectWeatherRepository;

    @GetMapping(path = "/check")
    public String checkWeather(@RequestParam String cityId) {
        JSONObject responseObject = new JSONObject();
        responseObject.put("gps", "10.7666713,106.6018106,17");
        responseObject.put("city", "HoChiMinh");
        responseObject.put("description", "10.7666713,106.6018106,17");
        responseObject.put("time", new Date(System.currentTimeMillis()));
        responseObject.put("tempC", 25.0);
        responseObject.put("tempF", 285.15);

        List<WeatherInfo> weatherInfo = selectWeatherRepository.getWeatherInfo(cityId);

        String res = responseObject.toString() + "\n" + weatherInfo.toString();
        return res;
    }
}
