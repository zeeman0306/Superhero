package heroes;

public class staticShock extends Superhero implements IFlightSpeed, IBlackHeroes{



    public staticShock(String rN, String[] sP) {
        super(rN, sP);
    }

    String listPowers() {
        return "Electrokinesis, Flight(with use of metal disc), Partial Magnetism";
    }


    public double flightSpeed() {
        return 100.0;
    }

    public String myBlackHero() {
        return "My black hero is staticShock";
    }
}
