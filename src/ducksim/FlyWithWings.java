package ducksim;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying...");
    }

    @Override
    public State getFlyBehavior() {
        return State.FLYING;
    }
}
