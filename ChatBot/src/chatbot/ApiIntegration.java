package chatbot;

import chatbot.APIS.WeatherAPIData;
import chatbot.APIS.JokeTeller;

public class ApiIntegration {
    public static String getWeather(String city) {
        return WeatherAPIData.getWeather(city);
    }
    public static String getJoke() {
        return JokeTeller.getJoke();
    }
}
