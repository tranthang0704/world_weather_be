package tthang.world_weather.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WorldWeatherApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorldWeatherApplication.class, args);
    }
}
