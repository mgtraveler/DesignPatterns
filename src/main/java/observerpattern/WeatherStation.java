package observerpattern;

import observerpattern.publishers.CurrentConditions;
import observerpattern.publishers.ForecastDisplay;
import observerpattern.publishers.HeatIndexDisplay;
import observerpattern.publishers.StatisticsDisplay;
import observerpattern.publishers.WeatherData;

/*
 * Observer defines a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 * Subjects (Observables) update Observers using a common interface.
 * Observers are loosely coupled in that the Observable knows nothing about them, other than
 * they implement the Observer interface.
 * Strive for loosely coupled designs between objects that interact.
 */
public class WeatherStation {
	public static void main (String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditions currentConditionsDisplay = new CurrentConditions(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
