package Activity3;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args){
        double side1, side2, side3;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three sides of the Triangle");
        side1 = keyboard.nextDouble();
        side2 = keyboard.nextDouble();
        side3 = keyboard.nextDouble();

        if(side1 == side2 && side2 == side3){
            System.out.println("It is an Equilateral Triangle");
        } else if(side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("It is an Isosceles Triangle");
        } else{
            System.out.println("It is an Scalene Triangle");
        }



    }
}
