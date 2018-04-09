package heroes;

public class BlackPanther extends Superhero implements IBlackHeroes{



    //Constructor
    public BlackPanther(String rN, String[] sP) {
        super(rN, sP);
    }


    //Method
    String listPowers() {
        return "Super Strength, Enhanced Endurance, Super Agility";
    }


    public String myBlackHero() {
        return "My black hero is " + getRealName() + ", his powers are " + getSpecialPowers();
    }
}
