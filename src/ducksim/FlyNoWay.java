package ducksim;

public class FlyNoWay implements FlyBehavior {

    @Override
    public State getFlyBehavior() {
        return State.SWIMMING;
    }
}
