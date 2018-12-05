
package ducksim;

import java.awt.Color;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(Color.GREEN, new FlyNoWay(), new FlyWithWings(), new QuackNormal());
    }
    
    @Override
    public String display() {
        return "Mallard";
    }
    
}
