package week2;
import java.util.Scanner;
public class StringEqualsTernaryOperator {

    // String.equals()
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
/*
        System.out.println("What is the capital of Iceland");
        String response = console.nextLine();
        String answer = new String ("Reykjavik");
        String capital = new String ("Reykjavik");

        if(answer.equals(capital)) {
            System.out.println("Equal");
        }

        if (answer.equals(response)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Incorrect! The correct answer is %s. \n", answer);
        }

        console.close();
 */
        // Ternary Operator
        int x = 10;
        int y = 20;
        String smallest;

        if (x == y){
            smallest = "x and y are equal";
        } else {
            if (x < y) {
                smallest = "x is smallest";
            } else {
                smallest = "y is smallest";
            }
        }
        System.out.printf("Smallest");

        //smallest = x < y ? x : y;
        //System.out.printf("Smallest: %d\n", smallest);

        smallest = (x == y ? "x and y are equal" : x < y ? "x is smallest" : "y is smallest");
        System.out.println(smallest);
    }
}
