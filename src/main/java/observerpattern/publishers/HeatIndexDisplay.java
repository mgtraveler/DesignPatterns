package observerpattern.publishers;

import observerpattern.subscribers.DisplayElements;
import observerpattern.subscribers.Observer;

public class HeatIndexDisplay implements Observer, DisplayElements {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	private float heatIndex;
	
	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		setHeatIndex(temperature, humidity);
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
	
	private void setHeatIndex (float temp, float humidity) {
		heatIndex = (float) (16.293 + 1.85212 * 0.1 * temp + 5.37941 * humidity - 1.00254 * 0.1 * temp * humidity + 9.41695 * 0.001 * (temp * temp) + 7.28898 * 0.001 * (humidity * humidity) + 3.45372 * 0.0001);
	}

}
