package week10;

public class PrefixPostfix {
    public static void main (String[] args) {
        int x = 10;
        int y = 20;

        System.out.printf("Printing result of x + 1 = %d\n", x + 1);
        System.out.printf("Printing result of y - 1 = %d\n", y - 1);
        System.out.println();
        // prints x is 11
        // print y is 19

        x = 10;
        y = 20;
        System.out.printf("Printing postfix x = %d\n", x++);
        System.out.printf("Printing postfix y = %d\n", y--);
        System.out.printf("Printing x after postfix increment: %d\n", x);
        System.out.printf("Printing x after postfix decrement: %d\n", y);
        System.out.println();
        // prints postfix x = 10  first return value as is
        // prints postfix y = 20
        // prints x is 11   then incremented the value
        //prints y is 19

        x = 10;
        y = 20;
        System.out.printf("Printing prefix x = %d\n", ++x);
        System.out.printf("Printing prefix x = %d\n", --y);
        System.out.printf("Printing x after pretfix increment: %d\n", x);
        System.out.printf("Printing x after prefix decrement: %d\n", y);
        // prints x = 11
        // prints x = 19
        // inc 11
        // dec 19
        // pre u getting it right now


    }
}
