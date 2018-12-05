package ducksim;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {

        // Do nothing
    }

    @Override
    public State getFlyBehavior() {
        return State.SWIMMING;
    }
}
