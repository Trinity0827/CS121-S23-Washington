package week8.Interfaces;

import week8.Inheritance.Employee;

public class HourlyEmployee implements Pay, Print {
    private int id;
    private String name;
    private double wage;
    private int hours;

    public HourlyEmployee(int id, String name, double wages, int hours){
        this.id = id;
        this.name = name;
        this. wage = wage;
        this. hours = hours;
    }

    // getters and setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //override

    @Override
    public double calculatePay(){
        return wage * hours;
    }

    public void printEmployeeInfo(){
        System.out.printf("Name: %s\nID: %d\nWage: %.2f\nHours: %d\n", name, id, wage, hours);

    }

}
