package abstractfactory;

public class FlyWithWings implements FlyBehaviour {

    /**
     * Let us implement some behaviour here
     */
    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
