package week6;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee("John Doe", "12345", 75600.80, 20000);
        Employee emp2 = new Employee("Jane Doe", "02468", 80000.80, 25000);

        //to get total pay
        //emp1.calculateTotalPay();
       // emp2.calculateTotalPay();
        //System.out.println();
        //emp1.getEmployeeInfo();
        //emp2.getEmployeeInfo();
        System.out.printf("Name:%s\n", emp1.getName());
        emp1.setName("Jim Doe");
        System.out.printf("Name:%s\n", emp1.getName());
    }
}
