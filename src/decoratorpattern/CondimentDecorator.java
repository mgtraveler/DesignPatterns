package decoratorpattern;

import java.util.Map;

public abstract class CondimentDecorator extends Beverage {
	
	Beverage beverage;

	public CondimentDecorator(Beverage beverage, Map<BeverageSize, Float> prices) {
		super(prices);
		this.beverage = beverage;
		this.size = beverage.getSize();
	}
	
	@Override
	public float getCost() {
		return prices.get(size) + beverage.getCost();
	}
	
	@Override
	public abstract String getDescription();
}
