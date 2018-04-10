package heroes;

import java.util.Arrays;

public abstract class Superhero {

    //Instance Variables
    private String realName;
    private String[] specialPowers;

    //Constructor
    public Superhero (String rN, String[] sP){
        this.realName = rN;
        this.specialPowers = sP;
    }


    //method Signatures / stubs
    abstract String[] listPowers();


    //Getters and Setters
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getSpecialPowers() {
        return specialPowers;
    }

    public void setSpecialPowers(String[] specialPowers) {
        this.specialPowers = specialPowers;
    }


    //toString
    @Override
    public String toString() {
        return "Superhero{" +
                "realName='" + realName + '\'' +
                ", specialPowers=" + Arrays.toString(specialPowers) +
                '}';
    }
}
