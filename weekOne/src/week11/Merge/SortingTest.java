package week11.Merge;

import week11.Bubble.Sorting;

public class SortingTest {
    public static void main (String[] args) {
        mergeSort sorter = new mergeSort();
        int[] array3 = { 3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        sorter.mergeSort(array3);
        printArray(array3);
    }
    
    
    //static method to print an array
    public static void printArray(int[] array){
        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


