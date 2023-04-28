package Activity3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println( num + " is odd");

    }
}
