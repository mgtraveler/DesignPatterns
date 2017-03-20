package factorypattern;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("pepperoni".equals(type))
			pizza = new NYStylePepperoniPizza();
		
		if (pizza == null) {
			throw new IllegalArgumentException(String.format(
					"Pizza under {%s} name is not available in the NY menu", type));
		}
		return pizza;
	}

}
