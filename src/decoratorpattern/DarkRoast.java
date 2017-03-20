package decoratorpattern;

import java.util.Map;

public class DarkRoast extends Beverage {
	public DarkRoast(BeverageSize size, Map<BeverageSize, Float> prices) {
		super(prices);
		this.size = size;
		description = "Dark Roast Coffee";
	}
}