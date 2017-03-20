package strategypattern.ducks;

import strategypattern.behaviours.FlyWithWings;
import strategypattern.behaviours.Quack;

public class MallardDuck extends Duck{

	public MallardDuck () {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I am a Mallard Duck.");
	}
	
}
