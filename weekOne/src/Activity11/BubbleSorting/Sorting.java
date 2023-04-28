package Activity11.BubbleSorting;

import java.util.Arrays;
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
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}




