package week2;

public class StringsExamples {
    public static void main(String[] args){
        String name = "John" + " " + "Doe"; // joe doe
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        int age = 20;
        double gpa = 3.8;
        char grade = 'A';

        System.out.println(name);
        System.out.println();
        System.out.println(firstName + " " + lastName);
        System.out.println(fullName);
        System.out.println();
        System.out.println("name: " + name + ", age: " + age + ", gpa:" + gpa + ", grade: " + grade);
    }
}
