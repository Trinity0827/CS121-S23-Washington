package Activity8.Inheritance;

public class Professor extends UniversityMember {
    private String typeClass;
    public Professor(String email, int password, String typeClass){
        super(email, password);
        this.typeClass = typeClass;
    }



    public String gettypeClass(){
        return typeClass;
    }

    public void setClass(String atypeClass) {
        typeClass = atypeClass;
    }

    @Override
    public String toString(){
        return String.format("Email: %s\nPassword: %d\nType of Class: %s\n", email, password, typeClass);
    }
}
