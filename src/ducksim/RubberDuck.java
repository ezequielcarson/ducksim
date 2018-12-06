
package ducksim;

import java.awt.Color;

public class RubberDuck extends Duck {


    public RubberDuck() {

        //We call super class constructor to create a Duck with color YELLOW, No Fly and QuackSqueek
        super(Color.YELLOW, new FlyNoWay(), new QuackSqueek());
    }

    @Override
    public String display() {
        return "Rubber";
    }
}

