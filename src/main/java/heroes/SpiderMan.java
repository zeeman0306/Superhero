package heroes;

public class SpiderMan extends Superhero implements IFlightSpeed{


    //Constructor
    public SpiderMan(String rN, String[] sP) {
        super(rN, sP);
    }

    //Method
    String[] listPowers() {
        return getSpecialPowers();
    }


    public double flightSpeed() {
        return 47.5;
    }
}

