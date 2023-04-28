package week5;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String course = JOptionPane.showInputDialog("Enter course name");
            String credit = JOptionPane.showInputDialog("Enter credit name");
            String score = JOptionPane.showInputDialog("Enter score name");

            output.printf("%s %s %s\n",course, credit, score);
            fileWriter.close();
            output.close();

        } catch (FileNotFoundException e){
            System.err.println("File not found");
        }
    }
}
