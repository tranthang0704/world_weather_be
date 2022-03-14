package tthang.world_weather.backend.mapper;

import org.springframework.jdbc.core.RowMapper;
import tthang.world_weather.backend.models.WeatherInfo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WeatherInfoRowMapper implements RowMapper<WeatherInfo> {

    @Override
    public WeatherInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        WeatherInfo wi = new WeatherInfo();
        wi.setCity(resultSet.getString("city_id"));
        wi.setDescription(resultSet.getString("description"));
        wi.setGps(resultSet.getString("gps"));
        wi.setTempC(resultSet.getDouble("temp_c"));
        wi.setTempF(resultSet.getDouble("temp_f"));
        wi.setUpdatedTime(resultSet.getString("update_time"));

        return wi;
    }
}
