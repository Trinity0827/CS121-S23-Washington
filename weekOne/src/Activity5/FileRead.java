package Activity5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args){
        //File inputFile1 = new File("C:/Users/trinitywashington/Desktop/courses.txt"); (another way if not imported)
        File inputFile2 = new File("text.txt");


        try {
            Scanner input = new Scanner(inputFile2);
            String header = input.nextLine();
            System.out.println(header);

            while (input.hasNextLine()) { // each time it loop, it would go to the next line
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d %7d\n ", course, credits, score); //seven spaces justifying it to the left, giving three spaces, justifying it to the right
            }
            input.close();
        } catch(FileNotFoundException e) {
            System.err.println("File not Found");
        }
    }
}
