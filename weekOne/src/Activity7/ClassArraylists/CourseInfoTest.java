package Activity7.ClassArraylists;

import java.util.Scanner;

public class CourseInfoTest {
    public static void main(String[] args) {
        CourseInfo user = new CourseInfo();
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Course name or press q to quit:");
            String input = console.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                user.addName(input);

                System.out.println("Enter your Score");
                int score = Integer.valueOf(console.nextLine());
                user.addScore(score);

                System.out.println("Enter your Letter Grade");
                char letter = (console.nextLine().charAt(0));
                user.addLetter(letter);

                System.out.println("Enter your GPA");
                double gpa = Double.parseDouble(console.nextLine());
                user.addGPA(gpa);
            }
        }
        String header = String.format("%-15s %-10s %-10s %-15s\n", "Course Names: ", "Score: ", "Letter Grade: ", "GPA: ");
        user.getCourseInfo(header);
    }
}



