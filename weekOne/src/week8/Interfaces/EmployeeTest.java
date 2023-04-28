package week8.Interfaces;

import week8.Inheritance.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee(12345, "John Doe") {
            @Override
            public double calculatePay() {
                return 0;
            }
        };


        //System.out.println(employee1.getName());
       // System.out.println(employee1.getId());

        System.out.println(employee1);

    }
}
