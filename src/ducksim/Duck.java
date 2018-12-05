
package ducksim;

import java.awt.Color;

public abstract class Duck {
    
    private Color color = Color.BLACK;
    private State state = State.SWIMMING;
    private boolean isFree = true;
    private boolean isOnDSWC = false;

    private FlyBehavior previousFlyBehavior;
    private FlyBehavior currentFlyBehavior;
    private FlyBehavior defaultFlyBehavior;


    // typical duck commands
    
    public void swim() {
        currentFlyBehavior = new FlyNoWay();
    }
    
    public void quack() {

        state = State.QUACKING;
    }
    
    public String getQuack() {
        return "Quack!";
    }
    
    public void fly() {
        currentFlyBehavior = defaultFlyBehavior;
    }
    
    public State getState() {
        return currentFlyBehavior.getFlyBehavior() ;
    }

    public void setColor(Color c) {
        color = c;
    }
    
    public Color getColor() {
        return color;
    }
    
    // join / quit and capture / release commands
    
    public void joinDSWC() {
        isOnDSWC = true;
    }
    
    public void quitDSWC() {
        isOnDSWC = false;
    }
    
    public boolean isOnDSWC() {
        return isOnDSWC;
    }
    
    public void capture() {

        previousFlyBehavior = defaultFlyBehavior;
        defaultFlyBehavior = new FlyNoWay();
        isFree = false;
    }
    
    public void release() {

        defaultFlyBehavior = previousFlyBehavior;
        previousFlyBehavior = null;
        isFree = true;
    }
    
    public boolean isFree() {
        return isFree;
    }
    
    public abstract String display();

    public void setDefaultFlyBehavior(FlyBehavior flyBehavior) {  defaultFlyBehavior = flyBehavior; }

    public void setCurrentFlyBehavior(FlyBehavior flyBehavior) {  currentFlyBehavior = flyBehavior; }


}
