package singletonpattern;

/*
 * The Singleton pattern ensures a class has only one instance, and provides
 * a global point of access to it.
 * Java's implementation of the Singleton pattern makes use of a private constructor,
 * a static method combined with a static variable.
 * 
 * synchronized - two threads can not enter the method at the same time.
 */
public class Singleton {

	private volatile static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
