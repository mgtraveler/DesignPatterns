package observerpattern.publishers;

import observerpattern.subscribers.DisplayElements;
import observerpattern.subscribers.Observer;

public class CurrentConditions implements Observer, DisplayElements {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditions(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Current conditions " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
}
