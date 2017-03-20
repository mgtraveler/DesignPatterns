package decoratorpattern;

import java.util.Map;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage, Map<BeverageSize, Float> prices) {
		super(beverage, prices);
	}

	@Override
	public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}