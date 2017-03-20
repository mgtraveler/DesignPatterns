package factorypattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	String name;
	List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Adding toppings: ");
		toppings.forEach(System.out::println);
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350 degrees.");
	}

	public void cut() {
		System.out.println("Cut the pizza into diagonal slices.");
	}

	public void box() {
		System.out.println("Box the pizza into official Pizzastore box.");
	}
}