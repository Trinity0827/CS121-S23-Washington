package Activity8.abstractClasses;

public class StudyHours extends Study {
    private double hours;
    private int breaks;

    public StudyHours(String name, String course, double hours, int breaks){
        super(name, course);
        this.hours = hours;
        this.breaks = breaks;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getBreaks() {
        return breaks;
    }

    public void setBreaks(int breaks) {
        this.breaks = breaks;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nCourse: %s\nHours: %.2f\nBreaks: %d\n", name, course, breaks, hours);
    }

    @Override
    public double getStudy(){
        return hours / breaks;
    }


}
