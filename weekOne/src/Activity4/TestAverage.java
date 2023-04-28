package Activity4;
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        int ans, ans1;
        double sum = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("\nHow many student there are? ");
        ans = console.nextInt();

        for(int i = 0; i < ans; i ++){
            System.out.println("\nHow many test scores does " + (i + 1) + " have?: ");
            ans1 = console.nextInt();

            for(int j = 0; j < ans1; j++){
                double ans2;
                System.out.print("\nEnter score " + (j + 1) + " for student " + (i + 1) + ": ");
                ans2 = console.nextDouble();
                sum += ans2;
            }
            double avg = sum/ans1;
            System.out.printf("\nStudent " + (i + 1) + " Average score: %.1f", avg);
            sum = 0;
        }

    }
}
