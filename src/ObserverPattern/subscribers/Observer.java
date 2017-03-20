package observerpattern.subscribers;

@FunctionalInterface
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}