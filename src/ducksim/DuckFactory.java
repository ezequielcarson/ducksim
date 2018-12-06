package ducksim;

public class DuckFactory {

    private static DuckFactory instance = null;

    private DuckFactory(){
    }

    public static DuckFactory getInstance() {

        if (instance == null) {
            instance = new DuckFactory();
        }

        return instance;
    }

    public Duck createDuck(String duckType, int starCount, int moonCount, int crossCount)
    {
        Duck duck;

        switch (duckType) {
            case "Mallard":
                duck = new MallardDuck();
                break;
            case "Redhead":
                duck = new RedheadDuck();
                break;
            case "Rubber":
                duck = new RubberDuck();
                break;
            case "Decoy":
                duck = new DecoyDuck();
                break;
            default:
                duck = null;
        }

        for (int i = 0; i < starCount; i++)  { duck = new StarBling(duck); }
        for (int i = 0; i < moonCount; i++)  { duck = new MoonBling(duck); }
        for (int i = 0; i < crossCount; i++) { duck = new CrossBling(duck); }

        return duck;
    }

}
