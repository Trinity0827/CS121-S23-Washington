package week2;

public class StringFormat {
    public static void main(String[] args){
        String name = "John" + " " + "Doe"; // joe doe
        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.format(" %s %s ", firstName, lastName);
        int age = 20;
        double gpa = 3.8;
        char grade = 'A';

        // \n is new line
        String info = String.format("name: %s\n age: %d\n gpa: %.1f\n grade: %c\n", fullName, age, gpa, grade);

        System.out.println(fullName);
        System.out.println(info);


    }
}

