package week6;

public class classesObjects {
   /* String name = "John Doe";
    String id = "12345";
    String major = "Computer Science";
    double gpa = 3.8;
    */
   //declared instance variables
    String name;
    String id;
    String major;
    double gpa;

    //constructor
    public classesObjects(String name, String id, String major, double gpa){
        //variables are assigned the values of each instance of a student
        // this means what you creating right now
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    // methods
    void getStudentInfo() {
        System.out.printf("Name:%s\nID:%s\nMajor:%s\nGPA:%.1f\n", name, id, major, gpa);
    }
}
