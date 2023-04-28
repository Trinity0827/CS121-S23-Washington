package week12.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    private Map<String, Integer> gradesMap = new HashMap<>();

    public void addToGradesList(String course, int score){
        gradesMap.put(course, score);
    }

    public void removeFromGradesList(String course){
        gradesMap.remove(course);
    }

    //using object for the type so we can return either an int(the score) or a String(a message)
    public Object getScore(String course){
        Object score;
        if (gradesMap.containsKey(course)){
            score = gradesMap.get(course);
        }else{
            score = "Course not found";
        }
        return score;
    }

    public void displayGrades(){
        gradesMap.forEach((course, score)->{
            System.out.printf("Course: %s | Grade: %d\n", course, score);
        });
    }
}


// To add key/value pairs we use variableName.put(key, value).
//  To remove pairs: variableName.remove(key).
//  To return a value based on the key: variableName.get(key).
//  To return the number of k/v pairs: variableName.size().
//  To return true or false if the HashMap contains a key: variableName.containsKey(key).
// To return true or false if the HashMap contains a value: variableName.containsValue(value).
//  To loop through a HashMap, we can use the forEach() method (method, not the for each loop,aka enhanced for loop).
