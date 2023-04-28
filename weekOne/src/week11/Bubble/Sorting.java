package week11.Bubble;

public class Sorting {
    public void ascendingBubbleSort (int[] array){
        //Variable to temporaily hold a value during switch
        int temp;

        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++){
            // for each unsorted element, loop through and compare to next element

            // length - i - 1 because we only need to loop through unsorted elements
            for (int index = 0; index < array.length - i - 1; index++){

                // compared unsorted element to next element
                if (array[index] > array[index + 1]){

                    // temporarily holds value
                    temp = array[index];

                    // assigns next value to current index
                    array[index] = array[index + 1];

                    // assgins current value to next index
                    array[index + 1] = temp;

                }
            }
        }

    }
    public void descendingBubbleSort(int [] array){
        int temp;

        // loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++){
            // for each unsorted element, loop through and compare to next element

            // length - i - 1 because we only need to loop through unsorted elements
            for (int index = 0; index < array.length - i - 1; index++){

                // compared unsorted element to next element
                if (array[index] < array[index + 1]){

                    // temporarily holds value
                    temp = array[index];

                    // assigns next value to current index
                    array[index] = array[index + 1];

                    // assgins current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    }
}
