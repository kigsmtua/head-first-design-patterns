package abstractfactory;


/**
 * This is a duck that has a lot of behavior
 */
public class MallardDuck extends   Duck {
    /**
     * Ideally this params should be Dependency Injections not concrete implementations
     * Does this mean the values that come here have nothing on this implementation
     */
    public MallardDuck () {
        /**
         * This is what happens when such values come along here
         * Does this mean that such values come along here for usage
         */
        quackBehaviour = new QuackDuck();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
