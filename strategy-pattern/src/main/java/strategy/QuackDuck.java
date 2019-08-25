package strategy;

/**
 * This is where the duck comes along and can be used
 * To come up and use such items and make them available for usage!
 */
public class QuackDuck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
