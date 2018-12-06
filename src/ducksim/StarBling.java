package ducksim;

import java.awt.*;

public class StarBling extends Bling {

    Duck duck;

    protected StarBling(Duck duck) {
        super(duck);
        this.duck = duck;
    }

    @Override
    public String display() {
        return duck.display() + ":*";
    }
}
