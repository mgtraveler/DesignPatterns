package adapterpattern;

import adapterpattern.impl.MallardDuck;
import adapterpattern.impl.TurkeyAdapter;
import adapterpattern.impl.WildTurkey;

/**
 * The Adapter pattern converts an interface of a class into another interface the client expects.
 * Adapter lets classes work together that could not otherwise due to incompatible interfaces.
 * There are 2 kinds of adapters: object adapters and class adapters.
 * Object adapters:
 * Client makes request to Adapter using the Target interface and thinks he is talking to Target.
 * Adapter implements the Target interface and translates request to Adaptee using the Adaptee interface.
 * Adapter is composed with the Adaptee.
 * Client receives the result and never knows it was Adapter doing the translation.
 * Class adapters:
 * Multiple inheritance is required to implement it.
 * Client makes request to Adapter using the Target class and thinks he is talking to Target.
 * Adapter subclasses both the Target and Adaptee classes. Adaptee has not got the same methods as Target,
 * but Adapter translates the calls.
 * Examples:
 * Vector implements elements() method  which returns Enumeration,
 * Enumeration interface has asIterator() method which returns Iterator
 */
public class TurkeyAdapterTestDrive {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The duck says...");
        testDuck(mallardDuck);

        System.out.println("The turkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("The wildTurkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
