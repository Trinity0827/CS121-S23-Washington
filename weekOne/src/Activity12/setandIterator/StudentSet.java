package Activity12.setandIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentSet {
    Set<String> students = new HashSet<>();

    public void addStudents() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Enter Student name into set or \"q\" to quite");
        while (input !="q") {
            students.add(input);
            input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                System.out.println(input);
            }
        }
    }


    public void displayStudents() {
        Iterator<String> it = students.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(students);
    }
}
