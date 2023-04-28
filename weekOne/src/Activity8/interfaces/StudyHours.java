package Activity8.interfaces;

import Activity8.abstractClasses.Study;

public class StudyHours implements getStudy{
    private double hours;
    private int breaks;
    private String name;
    private String course;

    public StudyHours(String name, String course, double hours, int breaks){
        this.hours = hours;
        this.breaks = breaks;
        this.name = name;
        this.course = course;
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
