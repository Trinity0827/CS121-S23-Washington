package Activity1;


import java.util.Scanner;

public class activityOneScanner {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        int num1,num2;

        // Reads in first num from user
        System.out.println("Pick a number");
        num1 = Integer.parseInt(console.nextLine());

        System.out.println("Pick a another number");
        num2 = Integer.parseInt(console.nextLine());

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.sqrt(num2));
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.log(num1));
        System.out.println(Math.log(num2));





        console.close();


    }
}
