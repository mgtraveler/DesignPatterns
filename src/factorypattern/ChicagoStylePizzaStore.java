package factorypattern;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("pepperoni".equals(type))
			pizza = new ChicagoStylePepperoniPizza();

		if (pizza == null) {
			throw new IllegalArgumentException(String.format(
					"Pizza under {%s} name is not available in the Chicago menu", type));
		}
		return pizza;
	}
}
