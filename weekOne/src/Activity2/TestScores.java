package Activity2;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double test1, test2, test3, averageScore;
        char letterGrade;

        System.out.println("What score did u get on test 1");
        test1 = console.nextDouble();

        System.out.println("What score did u get on test 2");
        test2 = console.nextDouble();

        System.out.println("What score did u get on test 3");
        test3 = console.nextDouble();

        averageScore = (test1 + test2 + test3) / 3;


        if (averageScore >= 90 && averageScore <= 100) {
            letterGrade = 'A';
            System.out.println("Letter Grade:" + letterGrade);
        } else if (averageScore >= 80 && averageScore <= 89) {
            letterGrade = 'B';
            System.out.println("Letter Grade:" + letterGrade);
        } else if (averageScore >= 70 && averageScore <= 79) {
            letterGrade = 'C';
            System.out.println("letter Grade:" + letterGrade);
        } else if (averageScore >= 60 && averageScore <= 69) {
            letterGrade = 'D';
            System.out.println("letter Grade: " + letterGrade);
        } else if (averageScore < 60) {
            letterGrade = 'F';
            System.out.println("letter Grade: " + letterGrade);
        }
        console.close();
        System.out.printf("Average Score:" + averageScore);
    }
}