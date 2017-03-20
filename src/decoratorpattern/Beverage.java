package decoratorpattern;

import java.util.Map;

public abstract class Beverage {

	protected String description;
	protected BeverageSize size;
	protected Map<BeverageSize, Float> prices;

	protected Beverage(Map<BeverageSize, Float> prices) {
		this.prices = prices;
	}

	public String getDescription() {
		return description;
	}

	protected BeverageSize getSize() {
		return size;
	}

	public float getCost() {
		return prices.get(size);
	}
}

enum BeverageSize {
	TALL, GRANDE, VENTI;
}