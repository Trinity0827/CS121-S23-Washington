package week6;

public class Employee {
    //Instance variables
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double totalPay;

    //constructor
    public Employee(String name, String id, double salary, double bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    //method to calculate total pay
    public double calculateTotalPay(){
        totalPay = salary + bonus;
        return totalPay;
    }

    //method to print Employee information
    void getEmployeeInfo(){
        System.out.printf("Name: %s\nID:%s\nSalary:%.2f\nBonus: %.2f\nTotal Pay: %.2f\n", name, id, salary, bonus, totalPay);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

}
