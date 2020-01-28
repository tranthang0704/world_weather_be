package tthang.world_weather.backend.controllers;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class CheckController {

    @GetMapping(path = "/check")
    public String checkWeather(@RequestParam String location) {
        JSONObject responseObject = new JSONObject();
        responseObject.put("gps", "10.7666713,106.6018106,17");
        responseObject.put("city", "HoChiMinh");
        responseObject.put("description", "10.7666713,106.6018106,17");
        responseObject.put("time", new Date(System.currentTimeMillis()));
        responseObject.put("tempC", 25.0);
        responseObject.put("tempF", 285.15);
        String res = responseObject.toString();
        return res;
    }
}
