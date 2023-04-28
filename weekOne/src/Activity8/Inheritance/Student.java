package Activity8.Inheritance;


public class Student  extends UniversityMember{
    private int id;
    public Student(String email, int password, int id){
        super(email, password);
        this.id = id;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Email: %s\nPassword: %d\nID: %d\n", email, password, id);
    }
}
