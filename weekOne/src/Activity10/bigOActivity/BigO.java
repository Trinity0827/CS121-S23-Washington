package Activity10.bigOActivity;

import java.lang.reflect.Array;

public class BigO {

    char[] character = {'T'};

    String [] spongeBobCharacters = {"SpongeBob", "Patrick", "Sandy", "Squidward", "Mr.Krabs","Plankton", "Gary",
            "Mrs.Puff"};

    int [] ages = { 1, 2, 3, 4, 5, 6, 7, 8};




    public void printOnce (){ //O(1)
        System.err.println(character[0]);
        System.err.println(spongeBobCharacters[0]);
        System.err.println(ages[0]);
    }


    public void printNTimes(Object array) { //O(n)
        System.out.printf("%nIf n = %d, we print %d times:%n%n", Array.getLength(array), Array.getLength(array));
        for (int i = 0; i < Array.getLength(array); i++) {
            System.err.println(Array.get(array, i));

        }
    }

    public void printNSquaredTimes(Object array) {//O(n^2)
        int counter = 1;
        for (int i = 0; i < Array.getLength(array); i++) {
            for (int j = 0; j < Array.getLength(array); j++) {
                System.err.println(counter + ". " + Array.get(array, i) + ", " + Array.get(array, j));
                counter++;
            }
        }
    }
}
