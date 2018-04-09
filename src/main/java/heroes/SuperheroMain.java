package heroes;

public class SuperheroMain {
    public static void main(String[] args) {

    BlackPanther blackPanther = new BlackPanther("T'challa", new String[]{"Super Strength", "Enhanced Speed", "Super agility"});

    SpiderMan spiderMan = new SpiderMan("Miles Morales", new String[]{"Spider sense", "Super agility", "Wall crawling"});

    staticShock staticShock = new staticShock("Vergil Hawkins", new String[]{"Electrokinesis", "Flight(Riding metal disc)", "EMP's"});

    GreenLantern greenLantern = new GreenLantern("John Stewart", new String[]{"Flight", "Hard-light construction" ,"Energy blasts"});

    Superhero[] supesArr = new Superhero[]{blackPanther, spiderMan, greenLantern};
        for(Superhero powers: supesArr) {
            System.out.println(powers.getRealName() + " possess these super powers: [" + powers.listPowers() + "]");
            System.out.println("=========================================================================================================");
        }

        System.out.println(" greenLantern can fly at " + greenLantern.flightSpeed() + "mph");
        System.out.println("=========================================================================================================");
        System.out.println(" staticShock can fly at " + staticShock.flightSpeed() + "mph");
        System.out.println("=========================================================================================================");


        System.out.println(staticShock.myBlackHero() + ", and he can fly at " + staticShock.flightSpeed() + "mph");




    }
}
