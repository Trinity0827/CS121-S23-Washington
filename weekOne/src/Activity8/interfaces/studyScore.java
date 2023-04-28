package Activity8.interfaces;

import Activity8.abstractClasses.Study;

public class studyScore implements getStudy {
    private double score;
    private String name;
    private String course;

    public studyScore(String name, String course, double score){
        this.score = score;
        this.name = name;
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nCourse: %d\nScore: %.2f\n",name, course, score);
    }

    @Override
    public double getStudy(){
        return score/100;
    }
}
