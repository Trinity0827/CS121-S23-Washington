package week11.Sorting;

// To call in main method
//sorter.quickSort(array, 0, array.length - 1
public class QuickSort {
    public void quickSort(int[] array, int start, int end){
        // call partition method to divide the array
        int pivot = partition(array, start, end);

        if (start < pivot -1) {
            //call quickSort recursively
            quickSort(array, start, pivot - 1);
        }
        if (pivot < end){
            // call quickSort recursively
            quickSort(array, pivot, end);
        }
    }

    private int partition(int[] array, int start, int end){
        int i = start;
        int j = end;
        int temp;

        //pivot is middle index
        int pivot = array[(start + end) / 2];

        // make left less than pivot and right greater than pivot
        while(i <= j){

            // check until all values on left side are lower than pivot
            while (array[i] < pivot){
                j++;
            }
            // check until all values on right side are higher than pivot
            while (array[i] > pivot){
                j--;
            }
            //compare values from both sides of pivot to see of they should swap
            // After swap, move to next element on both sides
            if (i <= j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //return i as new pivot
        return i;
    }
}
