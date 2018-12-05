package ducksim;

public abstract class QuackBehavior {


    private String quackString;
    private State quackBehavior;

    protected QuackBehavior(String tempString, State tempBehavior ){
        quackString = tempString;
        quackBehavior = tempBehavior;
    }


    public String getQuack() {
        return quackString;
    }

    public State getQuackBehavior() {
        return quackBehavior;
    }


}
