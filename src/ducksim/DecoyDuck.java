package ducksim;

import java.awt.*;

public class DecoyDuck extends Duck {

    public DecoyDuck() {

        //We call super class constructor to create a Duck with color ORANGE, No Fly and No Quack
        super(Color.ORANGE, new FlyNoWay(), new QuackNoWay());
    }

    @Override
    public String display() { return "Decoy"; }
}
