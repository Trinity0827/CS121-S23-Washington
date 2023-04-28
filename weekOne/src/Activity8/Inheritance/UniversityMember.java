package Activity8.Inheritance;

public class UniversityMember {
    protected String email;
    protected int password;


    //Constructor
    public UniversityMember(String email, int password) {
        this.email = email;
        this.password = password;
    }

    //Getters and Setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return String.format("Email: %s\nPassword: %d\n",email, password);
    }
}
