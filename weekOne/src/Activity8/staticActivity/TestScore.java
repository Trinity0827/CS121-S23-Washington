package Activity8.staticActivity;


public class TestScore {

    //instance variables
    private String name;
    private int totalQuestions;
    private int score;

    //class or static variable
    private static int correctCount = 0;


    //Constructor


    public TestScore(String name, int totalQuestions, int score) {
        //initializes
        this.name = name;
        this.totalQuestions = totalQuestions;
        this.score = score;

        //increments
        correctCount++;
    }

    public String getName() {
        return name;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getScore() {
        return score;
    }


    //Static method
    public static int getCorrectCount() {
        return correctCount;
    }
}
