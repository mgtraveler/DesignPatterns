package decoratorpattern;

import java.util.Map;

public class HouseBlend extends Beverage {

	public HouseBlend(BeverageSize size, Map<BeverageSize, Float> prices) {
		super(prices);
		this.size = size;
		description = "House Blend Coffee";
	}
}
