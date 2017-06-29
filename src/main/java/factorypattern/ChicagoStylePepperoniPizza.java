package factorypattern;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		toppings.add("Shredded Mozarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cut the pizza into square slices.");
	}
}