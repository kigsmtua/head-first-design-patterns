package strategy;

/**
 * This just means I can actually take out the application values
 * And use them here as some of the Kotlin hacks that I can use here
 */
public class SqueakDuck  implements QuackBehavior {
    /*8
     This is what some squeaky duck would do
     So this duck can come along here and expose
     A single interface that can be used along such works I think
     This is what happesn when such stuff is brought up for use
     */
    @Override
    public void quack() {
        System.out.println("squeak! Squeak!");
    }
}
