package week12.SetsAndIterators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Steve");
        names.add("Jack");

        //Display elements of names List
        //Initialize iterator by calling collections
        //iterator() method
        Iterator<String> iter = names.iterator();

        //hasNext() returns a boolean, true or false
        // while its true that iter has a next element

        while(iter.hasNext()){

            // the next element value will be assigned to name
            // add name's value printed
            String name = iter.next();
            System.out.println(name);
            //or you can skip assigning iter.next() and just use
            // System.out.println(iter.next());

         }

        //remove elements
        while(iter.hasNext()){
            String name = (String)iter.next();
            if (name.equals("Alice")){
                iter.remove();
            }
        }

        //to print out the list with Alice removed
        // try this first
        while(iter.hasNext()){
            String name = (String)iter.next();
            System.out.println(name);
        }

        //iter has already looped through the ArrayList
        //so hasNext() is false and it will not print
        //So we can print with for each loop
        for (String name : names ){
            System.out.println(name);
        }

        //Displays the remaining elements after the next element
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Amy", "Joe", "Lisa"));
        Iterator<String> i = nameList.iterator();
        i.next();
        i.forEachRemaining(System.out :: println);
        // the :: --> before the :: and the name of the method is placed after
        // where we want to print the print method


    }
}
