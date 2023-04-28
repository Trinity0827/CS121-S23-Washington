package Activity6.Loaded;

public class MainoverLoaded {
    public static void main (String[] args){
        overLoaded one = new overLoaded();
        overLoaded two = new overLoaded("Trinity");
        overLoaded three = new overLoaded("Trin", 35, 45, 10);

        System.out.printf("Original Number: %d\n", three.getNumber());
        three.setNumber(20);
        System.out.printf("Set Number: %d\n", three.getNumber());
        three.setNumber(20,three.getScore());
        System.out.printf("Set number and score: %d\n", three.getNumber());
    }

}
