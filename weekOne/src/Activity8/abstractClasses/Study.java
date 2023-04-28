package Activity8.abstractClasses;

public abstract class Study {
    protected String name;
    protected String course;


    public Study(String name, String course) {
        this.name = name;
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString(){
        return String.format("Name: %s\nCourse: %s\n", name, course);
    }

    public abstract double getStudy();

}
