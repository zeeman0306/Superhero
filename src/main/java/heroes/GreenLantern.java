package heroes;

public class GreenLantern extends Superhero implements IFlightSpeed{




    public GreenLantern(String rN, String[] sP) {
        super(rN, sP);
    }



    String listPowers() {
        return "Flight, Hard-light Constructs, Energy blasts";
    }

    public double flightSpeed() {
        return 670616629.0;
    }
}
