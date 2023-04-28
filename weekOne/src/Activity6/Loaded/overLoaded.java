package Activity6.Loaded;

public class overLoaded {
    private String name;
    private int code;
    private int number;
    private int score;

    public overLoaded(){
    }

    public overLoaded(String name){
        this.name = name;
    }

    public overLoaded(String name, int code, int number, int score) {
        this.name = name;
        this.code = code;
        this.number = number;
        this.score = score;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }

    public void setNumber(int newNumber, int score){
        if(score > 20){
            number = newNumber + 10;
        }
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
