package Activity11.Binary;

import java.util.ArrayList;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> array) {
        int counter = 0;  // keeps track of comparisons
        int low = 0;
        int high = array.size() - 1;
        int mid = (low + high) / 2;

        while (low <= high && array.get(mid) != key){
            if (array.get(mid) < key){   // if mid is less than key...
                low = mid + 1;     // low is reset to position after key
            } else{                // if mid is greater than key
                high = mid -1;      // high is reset to position key
            }
            mid = (low + high)/2;   // mis is reset to mid between new low/high
            System.out.printf("Comparison %d\t", ++counter);
            for (int i = low; i <= high; i++){
                System.out.print(array.get(i) + "");
            }
            System.out.printf("\n\tLow Index: %d (%d)\tMid Index: %d(%d)\tHigh Index: %d (%d)\n\n",
                    low, array.get(low), mid, array.get(mid), high, array.get(high));
        }
        // if not found
        if (low > high){
            mid = -1;
        }
        return mid;
    }
}
