package Activity6.Classes;

public class MainClasses {
    public static void main(String[] args){
        classes student1 = new classes ("Trinity Washington", "51015", "Math", 86);
        classes student2 = new classes ("Brooklyn Lane", "62523", "Science", 73);

        student1.getStudentInfo();
        System.out.println();
        student2.getStudentInfo();
        System.out.println();

    }
}
