package week2;

import java.util.Scanner;

public class payRoll {
    public static void main(String[] args){
        String name;
        int hours;
        double payRate;
        double grossPay;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        System.out.print("How many hours did you work? ");
        hours = Integer.parseInt(keyboard.nextLine());


        System.out.print("What is your hourly pay rate? ");
        payRate = Double.parseDouble(keyboard.nextLine());

        grossPay = hours * payRate;

        System.out.println("Hello, %s\n" + name);
        System.out.println("Your gross pay is $%.2f" + grossPay);

    }
}
