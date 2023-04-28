package Activity12.HashMapAct;

import week12.HashMaps.HashMapDemo;

public class HashMapTest {
    public static void main(String[] args){
        HashMap test = new HashMap();

        test.addTestList('A', 100);
        test.addTestList('D', 63);
        test.addTestList('B', 81);

        test.displayTest();

        System.out.println(test.getScore('B'));
        test.removeTestList('D');
        System.out.println(test.getScore('A'));

        test.displayTest();

    }
}

