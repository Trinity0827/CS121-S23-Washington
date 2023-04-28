package week12.Generics;

public class GenericMethods {
    public <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
