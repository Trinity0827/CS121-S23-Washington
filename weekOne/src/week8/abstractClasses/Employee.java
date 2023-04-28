package week8.abstractClasses;

public abstract class Employee {
    protected int id;
    protected String name;

    //Constructor

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    //override
    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\n",name, id);
    }


    public abstract double calculatePay();{
    }

}
