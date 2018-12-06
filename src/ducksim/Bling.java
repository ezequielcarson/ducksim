package ducksim;

import java.awt.*;

public abstract class Bling extends Duck {


    protected Bling(Duck duck) {
        super(duck.getColor(), duck.getDefaultFlyBehavior(), duck.getDefaultQuackBehavior());
    }

    public abstract String display();
}
