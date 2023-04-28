package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        //File inputFile1 = new File("C:/Users/trinitywashington/Desktop/courses.txt"); (another way if not imported)
        File inputFile2 = new File("courses.txt");
        Scanner input = new Scanner(inputFile2);

        while (input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}
