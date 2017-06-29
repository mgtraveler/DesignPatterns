package decoratorpattern;

import java.util.Map;

public class Espresso extends Beverage {

	public Espresso(BeverageSize size, Map<BeverageSize, Float> prices) {
		super(prices);
		this.size = size;
		description = "Espresso";
    }
}
