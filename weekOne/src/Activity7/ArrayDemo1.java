package Activity7;

public class ArrayDemo1 {
    public static void main (String[] args){
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };

        for (int row = 0; row < array1.length; row++){

            for (int column = 0; column < array1[row].length; column++){
                System.out.printf("%d", array1[row] [column]);
            }
            System.out.println();
        }
    }
}
