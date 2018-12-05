
package ducksim;

import java.awt.Color;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        super(Color.YELLOW, new FlyNoWay(), new FlyNoWay(), new QuackSqueek());
    }

    @Override
    public String display() {
        return "Rubber";
    }
}

