package ducksim;

public class CrossBling extends  Bling {

    Duck duck;

    protected CrossBling(Duck duck) {
        super(duck);
        this.duck = duck;
    }

    @Override
    public String display() {
        return duck.display() + ":+";
    }
}
