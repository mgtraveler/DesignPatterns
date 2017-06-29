package strategypattern.ducks;

import strategypattern.behaviours.FlyBehaviour;
import strategypattern.behaviours.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	};
	
	public void performQuack() {
		quackBehaviour.quack();
	};
	
	public void swim() {
		System.out.println("All ducks can swim, even decoys!");
	};
	
	public void setFlyBehavior(FlyBehaviour fb) {
		flyBehaviour = fb;
	};
	
	public void setQuackBehavior(QuackBehaviour qb) {
		quackBehaviour = qb;
	};
}
