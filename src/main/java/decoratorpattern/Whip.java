package decoratorpattern;

import java.util.Map;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage, Map<BeverageSize, Float> prices) {
		super(beverage, prices);
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
}
