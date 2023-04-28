package week8.Interfaces;

import week8.Inheritance.Employee;

import javax.swing.*;

public class SalariedEmployee extends Employee {
    private double  salary;
    public SalariedEmployee(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }

    // getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public double calculatePay(){
        return salary/52;
    }

    public void printEmployeeInfo(){
        JOptionPane.showMessageDialog(null, String.format("Name: %s\nID: %d\nSalary: %.2f\n",name, id, salary));
    }

}
