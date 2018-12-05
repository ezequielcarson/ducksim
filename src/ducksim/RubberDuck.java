
package ducksim;

import java.awt.Color;

public class RubberDuck extends Duck {
    
    public RubberDuck() {

        setDefaultFlyBehavior(new FlyNoWay());
        setCurrentFlyBehavior(new FlyNoWay());
        setColor(Color.YELLOW);
    }
    
    @Override
    public String getQuack() {
        return "Squeek!";
    }
    
    @Override
    public String display() {
        return "Rubber";
    }
}
