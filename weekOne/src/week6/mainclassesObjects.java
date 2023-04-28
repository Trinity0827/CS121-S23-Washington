package week6;

public class mainclassesObjects {
    public static void main(String[] args){
       /* the name of the class
       classesObjects student1 = new classesObjects();
       System.out.printf("Name: %s\n", student1.name);
       student1.getStudentInfo();
        */

        // put it in the same order
        classesObjects student1 = new classesObjects("John Does","12345","CS", 3.8);
        classesObjects student2 = new classesObjects("Jane Doe", "0246", "Bio", 3.9);
        classesObjects student3 = new classesObjects("Doey", "0369", "Math", 3.3);

        System.out.printf("Name: %s\n", student1.name);

        student1.getStudentInfo();
        System.out.println();
        student2.getStudentInfo();
        System.out.println();
        student3.getStudentInfo();
        System.out.println();
    }
}
