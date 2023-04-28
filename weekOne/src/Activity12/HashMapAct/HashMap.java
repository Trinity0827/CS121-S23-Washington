package Activity12.HashMapAct;

import java.util.Map;

public class HashMap {
    private Map<Character, Integer> testMap = new java.util.HashMap<>();

    //add
    public void addTestList(Character grade, int score){
        testMap.put(grade, score);
    }

    //remove
    public void removeTestList(Character grade){
        testMap.remove(grade);
    }

    //to get value
    public Object getScore(Character grade){
        Object score;
        if (testMap.containsKey(grade)){
            score = testMap.get(grade);
        }else{
            score = "Test not graded";
        }
        return score;
    }


    //to display
    public void displayTest(){
        testMap.forEach((grade, score)->{
            System.out.printf("Grade: %c | Score: %d\n", grade, score);
        });
    }
}






