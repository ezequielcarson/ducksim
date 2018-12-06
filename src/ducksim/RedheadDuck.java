
package ducksim;

import java.awt.Color;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {

        //We call super class constructor to create a Duck with color RED, FlyWithWings and QuackNormal
        super(Color.RED, new FlyWithWings(), new QuackNormal());
    }
    
    @Override
    public String display() {
        return "Redhead";
    }
}
