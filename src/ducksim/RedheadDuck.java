
package ducksim;

import java.awt.Color;

public class RedheadDuck extends Duck {
    
    public RedheadDuck() {
        super(Color.RED, new FlyWithWings(), new QuackNormal());
    }
    
    @Override
    public String display() {
        return "Redhead";
    }
}
