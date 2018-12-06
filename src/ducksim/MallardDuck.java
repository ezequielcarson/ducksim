
package ducksim;

import java.awt.Color;

public class MallardDuck extends Duck {

    public MallardDuck() {

        //We call super class constructor to create a Duck with color RED, FlyWithWings and QuackNormal
        super(Color.GREEN, new FlyWithWings(), new QuackNormal());
    }
    
    @Override
    public String display() {
        return "Mallard";
    }
    
}
