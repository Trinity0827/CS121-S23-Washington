package week6;

public class OverloadCharacter {
    private String name;
    private int health;
    private int attackPoints;
    private int strength;



    //constructor with no parameter list default
    public OverloadCharacter(){

    }

    //constructor with only name for parameter, health and attack points set with setters
    public OverloadCharacter(String charName){
        this.name = charName;
    }


    //constructor with 4 parameters
    public OverloadCharacter(String charName, int charHealth, int charAttackPts, int charStrength){
        this.name = charName;
        this.health = charHealth;
        this.attackPoints = charAttackPts;
        this.strength = charStrength;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int newHealth){
        health = newHealth;
    }

    public void setHealth(int newHealth, int strength){
        if(strength > 10){
            health = newHealth + 5;
        }
    }

    public int getStrength(){
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
