package week11.Merge;

public class mergeSort {
    public void mergeSort(int[] array){
        // if array has 1 element, return: base case: stops recursive call, merge method stops
        if (array.length <= 1){
            return; // a method will stop when it reaches a return statement
        }

        //initialize array with size of left half the original array
        int[] leftHalf = new int[array.length / 2];

        // initialize array with size of right half the orginal array
        int[] rightHalf = new int[array.length - leftHalf.length];

        //assigning values from the left half of orginal array to leftHalf array
        for (int i = 0; i < leftHalf.length; i++){
            leftHalf[i] = array[i];
        }

        //assigning values from second half of orginal array to secondHalf array
        for (int i = 0; i < rightHalf.length; i++){
            rightHalf[i] = array[leftHalf.length + i];
        }

        //recursive call until array reach base case: 1 element
        mergeSort(leftHalf); // recurive call: divides leftHalf array into smaller array
        mergeSort(rightHalf); //recurive call: divides righttHalf array into smaller array

        // call merge method to merge the divided array
        merge(leftHalf, rightHalf, array);
    }

    private void merge (int[] leftHalf, int[] rightHalf, int[] array){
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = 0;

        // advance leftHalf array index or rightHalf array index accorfingly
        while ((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)){
            if (leftHalf[leftIndex] < rightHalf[rightIndex]) {
                array[arrayIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightHalf[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }

        //copy the rest of leftHalf array to orginal array
        while (leftIndex < leftHalf.length){
            array[arrayIndex] = leftHalf[leftIndex];
            arrayIndex++;
            leftIndex++;
        }

        // copy the rest of rightHalf array to orginal copy, only one of the while loops will be true
        while (rightIndex < rightHalf.length) {
            array[arrayIndex] = rightHalf[leftIndex];
            arrayIndex++;
            rightIndex++;
        }
    }
}
