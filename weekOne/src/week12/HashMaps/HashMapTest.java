package week12.HashMaps;

public class HashMapTest {
    public static void main(String[] args){
        HashMapDemo demo = new HashMapDemo();

        demo.addToGradesList("Cs121", 98);
        demo.addToGradesList("Cs124", 87);
        demo.addToGradesList("Cs224", 79);

        demo.displayGrades();

        System.out.println(demo.getScore("CS121"));
        demo.removeFromGradesList("CS121");
        System.out.println(demo.getScore("CS121"));

        demo.displayGrades();

    }
}

// To add key/value pairs we use variableName.put(key, value).
//  To remove pairs: variableName.remove(key).
//  To return a value based on the key: variableName.get(key).
//  To return the number of k/v pairs: variableName.size().
//  To return true or false if the HashMap contains a key: variableName.containsKey(key).
// To return true or false if the HashMap contains a value: variableName.containsValue(value).
//  To loop through a HashMap, we can use the forEach() method (method, not the for each loop,aka enhanced for loop).

