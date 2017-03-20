package strategypattern;

import strategypattern.behaviours.FlyRocketBehaviour;
import strategypattern.ducks.Duck;
import strategypattern.ducks.MallardDuck;
import strategypattern.ducks.ModelDuck;

/*
 * The Strategy Pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. Strategy lets the algorithm vary independently
 * from clients that use it.
 * Favor composition over inheritance
 * Program to interfaces, not implementations.
 * Encapsulate what varies.
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketBehaviour());
		model.performFly();
	}
}