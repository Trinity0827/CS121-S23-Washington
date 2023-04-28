package week8.Static;

public class Main {
    public static void main(String[] args) {
        /*
        Enemy troll = new Enemy("troll", 15, 30);
        Enemy goblin = new Enemy("Goblin", 10, 20);
        Enemy orc = new Enemy("Orc", 30, 50);

        System.out.printf("Troll health: %d\n", troll.getEnemyCount());
        System.out.printf("Goblin health: %d\n", goblin.getEnemyCount());
        System.out.printf("Enemy health: %d\n", Enemy.getEnemyCount());
         */

        message();
    }

    static void message() {
        System.out.println("Static method call");
    }
}
