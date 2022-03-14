package tthang.world_weather.backend.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tthang.world_weather.backend.models.WeatherInfo;
import tthang.world_weather.backend.services.SelectWeatherService;

@RestController
public class CheckController {

    @Autowired
    SelectWeatherService selectWeatherService;

    @GetMapping(path = "/check/city/{cityId}")
    public String checkWeather(@PathVariable String cityId) {
//        JSONObject responseObject = new JSONObject();
//        responseObject.put("gps", "10.7666713,106.6018106,17");
//        responseObject.put("city", "HoChiMinh");
//        responseObject.put("description", "10.7666713,106.6018106,17");
//        responseObject.put("time", new Date(System.currentTimeMillis()));
//        responseObject.put("tempC", 25.0);
//        responseObject.put("tempF", 285.15);

        WeatherInfo weatherInfo = selectWeatherService.getWeatherInfo(cityId);

        return new JSONObject(weatherInfo).toString();
    }
}
