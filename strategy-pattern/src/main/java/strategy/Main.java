package strategy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo world");

        MallardDuck duck = new MallardDuck();
        duck.setFlyBehaviour(new FlyWithWings());
        duck.performFly(); ///This will change the behaviour of the duck dynamically ?
    }
}
