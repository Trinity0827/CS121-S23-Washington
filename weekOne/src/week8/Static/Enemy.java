package week8.Static;


public class Enemy {

    //instance variables
    private String name;
    private int health;
    private int strength;

    //class or static variable
    private static int enemyCount = 0;



    public Enemy(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
        enemyCount++;
    }

    public String getName() {
        return name;
    }



    public int getHealth() {
        return health;
    }


    public int getStrength() {
        return strength;
    }


    public static int getEnemyCount() {
        return enemyCount;
    }
}
