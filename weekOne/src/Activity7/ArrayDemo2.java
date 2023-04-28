package Activity7;

public class ArrayDemo2 {
    public static void main (String[] args) {
       // int[][] array2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };

        int[][] array2 = new int[4][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;

        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;

        array2[2][0] = 7;
        array2[2][1] = 8;
        array2[2][2] = 9;

        array2[3][0] = 10;
        array2[3][1] = 11;
        array2[3][2] = 12;

        for (int[] row : array2){
            for (int column : row){
                System.out.printf("%d", column);
            }
            System.out.println();
        }

    }
}
