package Activity12.GenericsAct;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args){
        GenericM garray = new GenericM();

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> array1 = Arrays.asList(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        List<Double> array2 = Arrays.asList(doubleArray);

        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        List<Character> array3 = Arrays.asList(charArray);


        String[] stringArray = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};
        List<String> array4 = Arrays.asList(stringArray);



        System.out.print("Integer arrayList: ");
        garray.printArrayList(intArray);

        System.out.print("Double arrayList: ");
        garray.printArrayList(new List[]{array2});

        System.out.print("Character arrayList: ");
        garray.printArrayList(new List[]{array3});

       System.out.print("String arrayList: ");
       garray.printArrayList(new List[]{array4});
    }
}