package week4;
import java.util.Scanner;

public class whileLoops {
   public static void main(String[] args) {
       // int i = 6;
       // while(i <= 5);{
       //  System.out.println(i);
       // i++;
       //
       Scanner scanner = new Scanner(System.in);
       String course;

       System.out.println("Please enter all of your courses");
       System.out.println();
       while(true) {
           System.out.println("Enter a course or \"q\" to quite");
           course = scanner.nextLine();
           if (course.equals("q")) {
               break;
           } else {
               System.out.println(course);
           }
       }
       System.out.println();
       System.out.println("Thank you");
       scanner.close();
    }
}
