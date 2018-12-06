package ducksim;

import java.awt.*;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(Color.ORANGE, new FlyNoWay(), new QuackNoWay());
    }

    @Override
    public String display() { return "Decoy!"; }
}
