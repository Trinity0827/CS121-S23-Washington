package Activity12.GenericsAct;

public class GenericM {
    public <T> void printArrayList(T[] inputArray){
        for (T type : inputArray){
            System.out.printf("%s ", type);
        }
        System.out.println();
    }
}

