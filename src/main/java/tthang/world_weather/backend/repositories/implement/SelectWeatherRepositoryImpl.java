package tthang.world_weather.backend.repositories.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import tthang.world_weather.backend.mapper.WeatherInfoRowMapper;
import tthang.world_weather.backend.models.WeatherInfo;
import tthang.world_weather.backend.repositories.interfaces.SelectWeatherRepository;

@Repository
public class SelectWeatherRepositoryImpl implements SelectWeatherRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public WeatherInfo getWeatherInfo(String id) {

        log();
        String selectSql = "SELECT * FROM weather.weather_info WHERE city_id = :city_id";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("city_id", id);
        try {
            var mapper =  new WeatherInfoRowMapper();
            WeatherInfo response = namedParameterJdbcTemplate.queryForObject(selectSql, namedParameters, mapper);
            return response;
        } catch (Exception e1) {
            return new WeatherInfo();
        }
    }
}
