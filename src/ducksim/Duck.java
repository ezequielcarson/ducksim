
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

    private QuackBehavior defaultQuackBehavior;
    private QuackBehavior currentQuackBehavior;
    private QuackBehavior previousQuackBehavior;


    protected Duck(Color color, FlyBehavior defaultFlyBehavior, QuackBehavior defaultQuackBehavior ) {
        this.color = color;

        this.currentFlyBehavior = new FlyNoWay();
        this.defaultFlyBehavior = defaultFlyBehavior;

        this.currentQuackBehavior = new QuackNoWay();
        this.defaultQuackBehavior = defaultQuackBehavior;

    }


    // typical duck commands
    
    public void swim() {

        currentFlyBehavior = new FlyNoWay();
        currentQuackBehavior = new QuackNoWay();
        state = State.SWIMMING;
    }
    
    public void quack() {

        currentQuackBehavior = defaultQuackBehavior;
        state = currentQuackBehavior.getQuackBehavior();

    }
    
    public String getQuack() {
        return currentQuackBehavior.getQuack();
    }
    
    public void fly() {

        currentFlyBehavior = defaultFlyBehavior;
        state = currentFlyBehavior.getFlyBehavior();
    }
    
    public State getState() {
        return state;
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

        previousQuackBehavior = defaultQuackBehavior;
        defaultQuackBehavior = new QuackNoWay();

        isFree = false;
    }
    
    public void release() {

        defaultFlyBehavior = previousFlyBehavior;
        previousFlyBehavior = null;

        defaultQuackBehavior = previousQuackBehavior;
        previousFlyBehavior = null;

        isFree = true;
    }
    
    public boolean isFree() {
        return isFree;
    }


    public FlyBehavior getDefaultFlyBehavior() { return defaultFlyBehavior; }

    public QuackBehavior getDefaultQuackBehavior() { return defaultQuackBehavior; }

    public abstract String display();

}
