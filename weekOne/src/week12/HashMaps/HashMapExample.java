package week12.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main (String[] args){
        Map<String, String> capitalsMap = new HashMap<>();

        capitalsMap.put("France", "Paris");
        capitalsMap.put("China", "Beijing");
        capitalsMap.put("Australia", "Canberra");

        //use the foreach() method to loop through
        //the HashMap to get each k,v (key,value) pair
        capitalsMap.forEach((key,value) -> {
            System.out.printf("Country: %s - Capital: %s\n", key, value);
        });

        System.out.printf("The size of the HashMap is %d\n", capitalsMap.size());
        System.out.printf("France is in the HashMap %b\n", capitalsMap.containsKey("France"));
        System.out.printf("Paris is in the HashMap %b\n", capitalsMap.containsValue("Paris"));
        System.out.printf("The capital of France is %s\n", capitalsMap.get("France"));
        capitalsMap.remove("France");
        System.out.printf("Trying to get the value of a removed key now returns: %s\n", capitalsMap.get("France"));

    }
}


// To add key/value pairs we use variableName.put(key, value).
//  To remove pairs: variableName.remove(key).
//  To return a value based on the key: variableName.get(key).
//  To return the number of k/v pairs: variableName.size().
//  To return true or false if the HashMap contains a key: variableName.containsKey(key).
// To return true or false if the HashMap contains a value: variableName.containsValue(value).
//  To loop through a HashMap, we can use the forEach() method (method, not the for each loop,aka enhanced for loop).

