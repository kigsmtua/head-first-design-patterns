package strategy;

/**
 * This bugger cannot fly without
 */
public class FlyWithoutWings implements FlyBehaviour {

    /**
     * Understanding the stupid concept of polymorphism
     */
    @Override
    public void fly() {
        System.out.println("Oops... I can't fly");
    }
}
