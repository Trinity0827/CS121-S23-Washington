package Activity11.BubbleSorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting st = new Sorting();

        int[] values = st.getArray();


        System.out.println("Unsorted Array: ");
        for(int element: values)
            System.out.print(element + " ");
        


        st.sortArray(values);


        System.out.println("\nSorted Array");
        for(int element: values)
            System.out.print(element + " ");


        System.out.println();
    }
}


