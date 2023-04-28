package Activity7;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main (String[] args) {
        String[][] color1 = {{"Red", "Blue", "Green",}, {"Yellow", "Purple", "Orange"}};

        Scanner console = new Scanner(System.in);
        for (String[] row : color1) {
            for (String column : row) {
                System.out.printf("%s", column);
            }
            System.out.println();
        }
        console.close();
    }
}
