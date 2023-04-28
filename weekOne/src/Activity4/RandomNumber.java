package Activity4;
import java.util.Random;
import java.util.Scanner;
    public class RandomNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int correct = 0;


            for (int i = 1; i <= 10; i++) {
                System.out.println("What color has the computer chosen? ");
                String color = scanner.nextLine();
                String chooseColor = "";
                int colorNumber = random.nextInt(5);
                {
                    if (colorNumber == 0) {
                        chooseColor = "red";
                        correct = correct + 1;
                    }
                    if (colorNumber == 1) {
                        chooseColor = "green";
                        correct = correct + 1;
                    }
                    if (colorNumber == 2) {
                        chooseColor = "blue";
                        correct = correct + 1;
                    }
                    if (colorNumber == 3) {
                        chooseColor = "orange";
                        correct = correct + 1;
                    }
                    if (colorNumber == 4) {
                        chooseColor = "yellow";
                        correct = correct + 1;

                    } else if (chooseColor != color) {
                        System.out.println("\nThe computer choose " + chooseColor + "\n");
                    }
                }
            }
            System.out.println("You have gotten " + correct + "/10 guesses correct!");
        }
    }
