package Activity8.abstractClasses;

public class StudyTest {
    public static void main(String[] args){
        studyScore student1 = new studyScore("Brooklyn", "Science", 85);
        System.out.printf("Study Results: %.2f\n", student1.getStudy());
    }
}
