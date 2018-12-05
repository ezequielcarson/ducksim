package ducksim;

public class FlyWithWings implements FlyBehavior {

    @Override
    public State getFlyBehavior() {
        return State.FLYING;
    }
}
