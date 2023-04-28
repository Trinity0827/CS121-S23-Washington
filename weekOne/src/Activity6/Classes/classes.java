package Activity6.Classes;

public class classes {
    String name;
    String code;
    String typeTest;
    double score;

    public classes(String name, String code, String typeTest, double score){
        this.name = name;
        this.code = code;
        this.typeTest = typeTest;
        this.score = score;
    }

    void getStudentInfo() {
        System.out.printf("Name:%s\ncode:%s\nType of Test:%s\nScore:%.1f\n", name, code, typeTest, score);
    }
}
