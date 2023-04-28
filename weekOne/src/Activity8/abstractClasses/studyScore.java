package Activity8.abstractClasses;

public class studyScore extends Study {
    private double score;
    public studyScore(String name,String course, double score){
        super(name, course);
        this.score = score;
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
