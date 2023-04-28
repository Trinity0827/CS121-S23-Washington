package week6;

public class MainOverloadCharacter {
    public static void main(String[] args){
        OverloadCharacter ch1 = new OverloadCharacter();
        OverloadCharacter ch2 = new OverloadCharacter("Joan");
        OverloadCharacter ch3 = new OverloadCharacter("John", 5, 25, 15);

        System.out.printf("Original health: %d\n", ch3.getHealth());
        ch3.setHealth(10);
        System.out.printf("Set health: %d\n", ch3.getHealth());
        ch3.setHealth(10,ch3.getStrength());
        System.out.printf("Set health with strength: %d\n", ch3.getHealth());
    }

}
