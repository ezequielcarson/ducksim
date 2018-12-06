package ducksim;

public class MoonBling extends Bling {

    Duck duck;

    protected MoonBling(Duck duck) {
        super(duck);
        this.duck = duck;
    }

    @Override
    public String display() {
        return duck.display() + ":)";
    }
}
