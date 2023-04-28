package Activity5;

import java.util.Scanner;
public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length;
        double width;
        double area;

        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length,width,area);

        scanner.close();
    }

    public static double getLength() {
        System.out.println("Enter the Length of a rectangle");
        double length = Double.parseDouble(scanner.nextLine());
        return length;
    }

    public static double getWidth() {
        System.out.println("Enter the Width of a rectangle");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }
    public static double getArea(double length,double width) {
        return length * width;
    }

    public static void displayData(double l, double w, double a ){
        System.out.println("Rectangle Length:" + l);
        System.out.println("Rectangle Width:" + w);
        System.out.println("Rectangle Area:" + a );
    }
}