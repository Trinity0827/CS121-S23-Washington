package Activity8.interfaces;

import Activity8.abstractClasses.studyScore;

public class StudyTest {
    public static void main(String[] args){
        Activity8.abstractClasses.studyScore student1 = new studyScore("Brooklyn", "Science", 85);
        System.out.printf("Study Results: %.2f\n", student1.getStudy());
    }
}
