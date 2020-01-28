package tthang.world_weather.backend.repositories.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import tthang.world_weather.backend.models.WeatherInfo;
import tthang.world_weather.backend.repositories.interfaces.SelectWeatherRepository;

import java.util.List;

@Repository
public class SelectWeatherRepositoryImpl implements SelectWeatherRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<WeatherInfo> getWeatherInfo(String id) {
        String selectSql = "SELECT * FROM weather.weather_info";
        MapSqlParameterSource namedParameters = new MapSqlParameterSource();
        namedParameters.addValue("city_id", id);
        try {
            RowMapper<WeatherInfo> mapper = BeanPropertyRowMapper.newInstance(WeatherInfo.class);
            List<WeatherInfo> response = namedParameterJdbcTemplate.query(selectSql, namedParameters, mapper);
            return response;
        } catch (Exception e1) {
            return null;
        }
    }
}
