
package ducksim;

import java.awt.Color;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {

        setDefaultFlyBehavior(new FlyWithWings());
        setCurrentFlyBehavior(new FlyNoWay());
        setColor(Color.RED);
    }
    
    @Override
    public String display() {
        return "Redhead";
    }
}
