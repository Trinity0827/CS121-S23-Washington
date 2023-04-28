package week4;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        //double randomDouble = Math.random() * 20 + 1;
       // int randomInt = (int)(Math.random() * 20 + 1);

       // System.out.printf("%.2f\n", randomDouble);
       // System.out.printf("%d\n", randomInt);
        Random random = new Random();
        //int randomInt = random.nextInt(50);
       // double randomDouble = random.nextDouble() * 50;


        //System.out.printf("random int: %d\n", randomInt);
       // System.out.printf("random double: %.2f", randomDouble);
        int randomInt1 = random.nextInt((50 - 1) + 1);
        int randomInt2 = random.nextInt((50 - 15) + 1 + 15);
        System.out.printf("between 1 & 50: %d\n", randomInt1);
        System.out.printf("between 15 & 50: %d\n", randomInt2);

    }
}
