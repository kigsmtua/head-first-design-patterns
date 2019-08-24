package abstractfactory;

/**
 * This duck cant quack
 * What can this duck actually do
 */
public class CantQuackDuck implements  QuackBehavior {

    @Override
    public void quack() {
        ///This duck just happens to be the silent one!
        System.out.println("Silence");
    }
}
