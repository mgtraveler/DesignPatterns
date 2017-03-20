package decoratorpattern;

import java.util.Map;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage, Map<BeverageSize, Float> prices) {
		super(beverage, prices);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
}
