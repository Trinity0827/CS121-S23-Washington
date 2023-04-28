package encapsulation.packagesDemo;

public class encapAct {
    //variables
    public String name;

    public String sport;

    private int age;
    private String month;

    //Constructor
    public encapAct(String name, String sport, int age, String month) {
        this.name = name;
        this.sport = sport;
        this.age = age;
        this.month = month;
    }

    public void getActivityInfo(){
        System.out.printf("Kid Name: %s\nSport to play: %s\n", name, sport);
    }

    private void getImportInfo(){
        System.out.printf("Kid age: %d\nKid birth month: %s\n");
    }

    protected void getSport(){
        System.out.printf("Kid Name: %s\nSport to play: %s\nKid age: %d\nKid birth month: %s\n",
                name, sport, age, month);
    }

    void getKid(){
        System.out.printf("Name: %s\n", name);
    }


}
