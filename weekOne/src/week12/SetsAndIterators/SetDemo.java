package week12.SetsAndIterators;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main (String[] args){
        // create a new set
        Set<Integer> set = new HashSet<>();

        int[] intArray = {38,29,29,45,60,21,4,4,15};

        //add array elements to the set
        for (int num:intArray) {
            // add() method
            set.add(num);
        }

        //print the array -- contain duplicates
        System.out.print("Array: ");
        for (int elem : intArray){
            System.out.print(elem + " ");
        }
        System.out.println();

        //print the set -- no duplicates
        System.out.print("Set: ");
        for (int elem : set){
            System.out.print(elem + " ");
        }
        System.out.println();

        //returns number of elements in the set
        System.out.println("Size: " + set.size());

        // removes element from set
        set.remove(38);

        System.out.println("New Size: " + set.size());
        set.add(38);

        // returns true if element is in set
        System.out.println("38 is in Set: " + set.contains(38));

        //creates a new sorted tree set
        TreeSet<Integer> sortedSet = new TreeSet<>(set);

        System.out.println("Sorted set: ");
        for (int elem : sortedSet){
            System.out.printf(elem + " ");
        }
        System.out.println();

        System.out.println("First element in sorted set is: " + sortedSet.first());
        System.out.println("Last element in sorted set is: " + sortedSet.last());

        System.out.println("Set is empty: " + sortedSet.isEmpty());
        sortedSet.clear();

        System.out.println("Set is empty: " + sortedSet.isEmpty());
        System.out.println("Size: " + sortedSet.size());

    }
}
