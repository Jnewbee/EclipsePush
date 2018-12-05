package webservice.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class MainClient {

	public static void main(String[] args) {
		WeatherWSSoap weatherWSSoap = new WeatherWS().getWeatherWSSoap();
		ArrayOfString arrayOfString = weatherWSSoap.getWeather("杭州", "");
		List<String> list = arrayOfString.getString();
		for (String result : list) {
			System.out.println(result);
		}
	}

}
