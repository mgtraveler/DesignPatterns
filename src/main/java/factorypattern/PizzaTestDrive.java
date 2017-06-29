package factorypattern;

/*
 * Factory pattern encapsulates object creation.
 * The Factory Method Pattern encapsulates object creation by letting subclasses
 * decide which objects to create.
 * The Factory Method Pattern defines an interface for creating an object, but lets
 * subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 * Dependency inversion principle - high-level components should not depend on
 * low-level components, they should both depend on abstractions.
 * High-level component is a class with behaviour defined in terms of low-level 
 * component (PizzaStore high-level, Pizzas it uses are low-level components).
 * 
 * The Abstract Factory Pattern (PizzaIngredientsFactory) provides an interface for
 * creating families of related or dependent objects without specifying concrete
 * their concrete classes.
 * 
 * The Factory Method creates objects through inheritance, while the Abstract Factory 
 * through object composition.
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizza = new NYStylePizzaStore();
		PizzaStore chicagoPizza = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyPizza.orderPizza("pepperoni");
		System.out.println("Sasha ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoPizza.orderPizza("pepperoni");
		System.out.println("Maryna ordered a " + pizza.getName() + "\n");
	}
}
