package decoratorpattern;

import java.util.EnumMap;
import java.util.Map;

import static decoratorpattern.BeverageSize.*;

/*
 * The Decorator pattern attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * Decorators have the same supertype as the objects they decorate.
 * You can use one or more decorators to wrap an object.
 * Given the decorator has the same supertype as the object it decorates, 
 * we can pass around a decorated object instead of the original (wrapped) object.
 * The decorator adds its own behaviour either before and/or after delegating to the object
 * it decorates to do the rest of the job.
 * Objects can be decorated any time, so we can decorate objects dynamically at runtime
 * with as many decorators as we like.
 */
public class StarbuzzCoffee {

	public static void main(String[] args) {

		Map<BeverageSize, Float> espressoPrices = createBeveragePricesMap(1.2f, 1f, .8f);
		Map<BeverageSize, Float> darkRoastPrices = createBeveragePricesMap(1.5f, 1.3f, 1f);
		Map<BeverageSize, Float> houseBlendPrices = createBeveragePricesMap(1.3f, 1.1f, .9f);
		Map<BeverageSize, Float> condimentPrices = createBeveragePricesMap(.25f, .2f, .1f);

		Beverage espresso = new Espresso(TALL, espressoPrices);
		System.out.println(espresso.getDescription() + " $" + espresso.getCost());

		Beverage darkRoast = new DarkRoast(GRANDE, darkRoastPrices);
		darkRoast = new Mocha(darkRoast, condimentPrices);
		darkRoast = new Mocha(darkRoast, condimentPrices);
		darkRoast = new Whip(darkRoast, condimentPrices);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.getCost());

		Beverage houseBlend = new HouseBlend(VENTI, houseBlendPrices);
		houseBlend = new Soy(houseBlend, condimentPrices);
		houseBlend = new Mocha(houseBlend, condimentPrices);
		houseBlend = new Whip(houseBlend, condimentPrices);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.getCost());
	}

	public static Map<BeverageSize, Float> createBeveragePricesMap(float tallPrice, float grandPrice,
			float ventiPrice) {
		Map<BeverageSize, Float> mapping = new EnumMap<>(BeverageSize.class);
		mapping.put(TALL, tallPrice);
		mapping.put(GRANDE, grandPrice);
		mapping.put(VENTI, ventiPrice);
		return mapping;
	}
}
