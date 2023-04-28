package examples.student;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("John Doe", "12345", "Freshman", "CS", 3.8);

        System.out.printf("Name: %s\n", student1.name);
        //System.out.printf("ID: %s\n", student1.id);// id is private
        System.out.printf("Class Standing: %s\n", student1.classStanding);
        System.out.printf("Major: %s\n", student1.major);
      //  System.out.printf("GPA: %.2f\n", student1.gpa);// gpa is private

        student1.getStudentInfo();
       // student1.getStudentId();// its private
        student1.getStudent();
        student1.getStudentRecord();





    }

}
