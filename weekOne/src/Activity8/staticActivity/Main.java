package Activity8.staticActivity;

public class Main {
    public static void main(String[] args) {
        //Instances
        TestScore math = new TestScore("Trinity", 25, 85);
        TestScore science = new TestScore("Jason", 45, 35);


        System.out.printf("Math Test: %d\n", math.getCorrectCount());
        System.out.printf("Science Test: %d\n", science.getCorrectCount());
        System.out.printf("Test Score: %d\n", TestScore.getCorrectCount());

    }
}
