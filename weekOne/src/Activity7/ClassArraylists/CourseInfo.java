package Activity7.ClassArraylists;

import java.util.ArrayList;

public class CourseInfo {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();
    private ArrayList<Double> gpas = new ArrayList<>();
    private ArrayList<String> cNames = new ArrayList<>();


    public void addName(String name){
        this.cNames.add(name);
    }

    public void addScore(int score){
        this.scores.add(score);
    }

    public void addLetter(char letter){
        this.letterGrades.add(letter);
    }

    public void addGPA(double gpa){
        this.gpas.add(gpa);
    }


    // methods that prints
    public void getCourseInfo(String header){
        System.out.printf(header);
        // adding a for loop
        for(int i = 0; i < cNames.size(); i++) {
            System.out.printf("%-15s %-10s %-10s %-15s\n", cNames.get(i), scores.get(i), letterGrades.get(i), gpas.get(i));
        }
    }
}
