package week8.Inheritance;

public class HourlyEmployee extends Employee{
    private double wage;
    private int hours;

    public HourlyEmployee(int id, String name, double wages, int hours){
        super(id, name);
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
    public String toString(){
        return String.format("Name: %s\nID: %d\nWages: %.2f\nHours: %d\n",name, id, wage, hours);
    }

    @Override
    public double calculatePay() {
        return wage / hours;
    }

}
