import java.io.IOException;

import Enum.Periods;

public interface WeatherProvider {
    void getWeather(Periods periods) throws IOException;
}
