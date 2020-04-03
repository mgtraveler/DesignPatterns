package templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boil water");
    }

    final void pourInCup() {
        System.out.println("Pour in cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
