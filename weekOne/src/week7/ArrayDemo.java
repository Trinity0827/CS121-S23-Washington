package week7;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
      /*  String[] firstNames = {"Mary", "Tom", "John", "Jane", "Lisa"};
        String[] lastNames = {"Johnson", "Jones", "Does", "Smith", "Allen"};
        int[] ages = {19, 21, 20, 19, 18};

        for (int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
            // -14s is spaces
            }
       */

        /*System.out.println("What the loop is doing");
        for (int i = 0; i < names.length; i++){
            System.out.printf("loop %d: is %d and gets the name at index %d: %s\n",
                    i + 1, i, i, names[i]);
        }
       */

      // for input users
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = new String[2];
        String[] lastNames = new String[2];
        int[] ages = new int[2];

        for (int i = 0; i < firstNames.length; i++){
            System.out.println("Enter first name");
            firstNames[i] = scanner.nextLine();
            System.out.println("Enter last name");
            lastNames[i] = scanner.nextLine();
            System.out.println("Enter ages");
            ages[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("%-14s %s\n", "Names", "Age");

       // for(int i = 0; i < firstNames.length; i++){
            //" " uses for string
        //    System.out.printf("%-14s %d\n", firstNames[i] + " " + lastNames[i], ages[i]);
       // }
        scanner.close();
    }
}
