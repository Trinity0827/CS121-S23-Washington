package week11.Sorting;

public class insertionSort {
    public void insertionSort(int[] array) {
        // temporary variable for swapping elements
        int temp;

        //loop through array starting at the second index [1]
        // assuming [0]
        for (int i = 1; i < array.length; i++){

            // loop while j > 0 (could use while loop)
            // decrement j each loop
            for (int j = i; j > 0; j--){

                //check if element at j is less than preceding element
                if (array[j] < array[j - 1]) {

                    // if less, swap
                    temp = array[j];
                    array[j] = array[j -1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
