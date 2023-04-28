package Activity5;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mytext.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credit;
        String score;

        output.printf("%s %s %s\n", "course", "credit", "score");//header

        for (int i = 1; i <= 3; i++) {
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credit = JOptionPane.showInputDialog(String.format("Enter name of credit"));
            score = JOptionPane.showInputDialog(String.format("Enter name of score"));
            output.printf("%s %s %s\n", course, credit, score);
        }
        output.close();
    }
}