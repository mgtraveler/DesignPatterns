package strategypattern.ducks;

import strategypattern.behaviours.FlyNoWay;
import strategypattern.behaviours.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck () {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("I am a Model Duck.");
	}
}
