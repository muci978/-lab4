import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

import java.util.List;

public class main {

    public static void main(String[] args) {
        WeatherWS factory = new WeatherWS();
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        ArrayOfString weatherInfo = weatherWSSoap.getWeather("成都", null);
        List<String> lstWeatherInfo = weatherInfo.getString();
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}