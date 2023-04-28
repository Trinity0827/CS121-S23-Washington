package Activity2;
import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int books;

        System.out.println("How many books have you purchase");
        books = Integer.parseInt(keyboard.nextLine());

        if (books >= 4) {
            System.out.println("You have earned 60 points");
        } else if (books == 3) {
                System.out.println("You have earned 30 points");
            } else if (books == 2) {
                System.out.println("You have earned 15 points");
            } else if (books == 1) {
                System.out.println("You have earned 5 points");
            } else if (books == 0) {
                System.out.println("You have earned 0 points");
            }
            keyboard.close();
    }
}
