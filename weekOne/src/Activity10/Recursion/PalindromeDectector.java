package Activity10.Recursion;

import java.util.Scanner;

public class PalindromeDectector {
    public static void main(String[] args) {
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an word for Palindrome Check:");
        String string = scanner.nextLine();
        if (yesPalin(string))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean yesPalin(String pal) {
        if (pal.length() == 0 || pal.length() == 1)
            return true;
        if (pal.charAt(0) == pal.charAt(pal.length() - 1))
            return yesPalin(pal.substring(1, pal.length() - 1));
        return false;
    }
}