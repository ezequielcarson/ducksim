package ducksim;

import java.awt.*;

public class GooseDuck extends Duck {

    Goose goose;


    protected GooseDuck(Goose goose) {
        super(Color.BLUE,  new FlyNoWay(), new QuackNormal());
        this.goose = goose;
    }

    @Override
    public String getQuack() { return goose.getHonk(); }

    @Override
    public String display() { return goose.getName(); }
}
