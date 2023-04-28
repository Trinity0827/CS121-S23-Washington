package Activity4;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = randomNumber.nextInt((100) + 1);
        int guess = 1;
        int count = 0;
        String quit;

        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you give up");
        System.out.println();

        while( guess != number ) {
            count = count+1;
            guess = scanner.nextInt();
            quit = scanner.nextLine();
            if (quit.equals("q")) {
                break;

            } else if (guess < number){
                System.out.println("Too low.Guess again:");
                
            } else if ( guess > number){
                System.out.println("Too high.Guess again:");
            }else{
                System.out.println("Correct!!! The number was: " + number + " Number of Guesses: " + count);
            }
        }
        System.out.println();
        System.out.println("Quitter!!!! The number was " + number );
        scanner.close();
    }
}
