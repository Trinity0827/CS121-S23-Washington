package week2;

import java.util.Scanner;

public class consoleInput {
    public static void main(String[] args){
         Scanner console = new Scanner(System.in);

         System.out.println("Enter your first name:");
         String firstName = console.nextLine();
         System.out.println("Enter your last name");
         String lastName = console.nextLine();

         System.out.printf("Full name: %s %s", firstName, lastName);

         console.close();

    }
}
