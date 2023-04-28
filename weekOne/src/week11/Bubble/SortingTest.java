package week11.Bubble;

public class SortingTest {
    public static void main (String[] args){
        // create an instance of the sorting class so that we can run the public method from it
        Sorting sorter = new Sorting();

        int[] array = {30, 16, 24, 62, 25, 7};

        System.out.print("Unsorted: ");
        printArray(array);

        sorter.ascendingBubbleSort(array);
        System.out.print("Sorted ascending: ");
        printArray(array);

        sorter.descendingBubbleSort(array);
        System.out.print("Sorted descending: ");
        printArray(array);

    }

    //static method to print an array
    public static void printArray(int[] array){
     for (int num: array){
         System.out.print(num + " ");
     }
     System.out.println();
    }
}
