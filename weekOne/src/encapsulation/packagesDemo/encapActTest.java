package encapsulation.packagesDemo;

import examples.student.Student;

public class encapActTest {
    public static void main(String[] args){
        encapAct kid = new encapAct("Patrick Star", "soccer",13,"November");

        System.out.printf("Name: %s\n", kid.name);
        System.out.printf("Sport: %s\n", kid.sport);

        // age causes error because its private
       // System.out.printf("Age: %s\n", kid.age);

        //month causes error because its private
       // System.out.printf("Month: %s\n", kid.month);


        kid.getActivityInfo();

        // that method has private variables
       //kid.getImportInfo();

        kid.getSport();
        kid.getKid();
    }
}
