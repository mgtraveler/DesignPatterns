package strategypattern.behaviours;

public class MuteQuack implements QuackBehaviour {
	public void quack() {
		System.out.println("I don't quack!");
	}
}
