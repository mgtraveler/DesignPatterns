package decoratorpattern;

import java.util.Map;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage, Map<BeverageSize, Float> prices) {
		super(beverage, prices);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
}
