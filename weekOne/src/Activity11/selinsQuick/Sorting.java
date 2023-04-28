package Activity11.selinsQuick;

import java.util.Scanner;

public class Sorting {
    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter integer %d: \n", i + 1);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }


    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}




