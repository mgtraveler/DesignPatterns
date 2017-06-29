package observerpattern.builtinobserverpattern;

import observerpattern.publishers.CurrentConditions;
import observerpattern.publishers.WeatherData;

public class WeatherStation {
	public static void main (String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditions currentConditionsDisplay = new CurrentConditions(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
