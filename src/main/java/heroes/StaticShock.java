package heroes;

public class StaticShock extends Superhero implements IFlightSpeed, IBlackHeroes{



    public StaticShock(String rN, String[] sP) {
        super(rN, sP);
    }

    String[] listPowers() {
        return getSpecialPowers();
    }


    public double flightSpeed() {
        return 100.0;
    }

    public String myBlackHero() {
        return "My black hero is StaticShock";
    }
}
