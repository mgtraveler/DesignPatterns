package templatemethod;

/**
 * The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
 * Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 *
 * Hook is a method declared in the abstract class, but only given empty or default implementation.
 */
public class CaffeineBeverageTestDrive {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}
