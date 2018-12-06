package ducksim;

import java.awt.*;

public class GooseDuck extends Duck {

    Goose goose;


    protected GooseDuck(Goose goose) {
        super(Color.BLUE,  new FlyWithWings(), new QuackNormal());
        this.goose = goose;
    }

    
    @Override
    public String getQuack() {

        System.out.println("GOOSE QUACK");
        return goose.getHonk();
    }

    @Override
    public String display() { return goose.getName(); }
}
