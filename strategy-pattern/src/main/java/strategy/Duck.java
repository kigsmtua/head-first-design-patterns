package abstractfactory;

/**
 * A lot of code to make code easier to change ? no ?
 * feels like alot of boilerplate to define typefamilies
 * @haskell still rules
 */
public abstract class Duck {

    QuackBehavior quackBehaviour;

    FlyBehaviour flyBehaviour;

    public abstract void display();

    public  void performFly() {

        flyBehaviour.fly();
    }

    /**
     * This sets up the flyBehavior for this class dynamically
     * @param fb
     */
    public void  setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    /**
     * This is what happens when such behaviors are used here at runtime
     * ? no ?
     * @param qb
     */

    public void setQuackBehaviour(QuackBehavior qb) {

        quackBehaviour = qb;
    }

    public void  performQuack() {
        /**
         * This is what the quackBehavior
         */
        quackBehaviour.quack();
    }
}
