package week11.Sorting;

public class selectionSort {
    public void selectionSort(int[] array){
        //loop to move boundary of unsorted array
        for (int i = 0; i < array.length - 1; i++){

            //assume element at first index [i] is the minimum or lowest value
            int min = i;

            // loop through sorted array
            //start with i + 1, so we can compare, in first loop, [0] with [1]
            for (int j = 1 + 1; j < array.length; j++){

                //see if element at index is less than the minimum
                if (array[j] < array[min]){

                    //if it is, we set minimum value to that index number
                    min = j;
                }
            }
            //swap the element at the minimum with the element at the beginning of the unsorted array
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
