package week5;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a fahrenheit temperature");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        System.out.printf("Celsius: %.1f\n", convertToCelsius(fahrenheit));


        System.out.println("Enter a celsius temperature");
        double celsius = Double.parseDouble(scanner.nextLine());
        System.out.printf("fahrenheit: %.1f\n", convertToFahrenheit(celsius));


        //      printStudentInfo("John", 19, 3.8);
        //   }
        //   public static void printStudentInfo(String name, int age, double gpa){
        //       System.out.printf("Name: %s\nAge: %d\nGPA: %.1f\n", name, age, gpa);
        // }
        //  public static void printName(String name){
        //       System.out.println(name);
        //  }
    }
    public static double convertToCelsius(int fTemp){
        double celsius = (fTemp - 32) * 5.0 / 9;
        return celsius;
    }

    public static int convertToFahrenheit(double cTemp){
        double fahrenheit = 9 / 5 * cTemp + 32;
        return (int)fahrenheit;
    }
}
