package Activity7.StringArrayList;

public class StringArrayListTest {
    public static void main (String[] args){
        StringArrayList array = new StringArrayList();

        array.addName("Trinity");
        array.addName("Brooklyn");


        System.out.printf("Names contains %s element.%n", array.getSizeOfNameList());
        array.displayNames1();

        System.out.printf("%nRemove first element: %s%n", array.getName(String.valueOf(0)));
        array.removeName(String.valueOf(0));

        System.out.printf("%nNames contains %s element.%n", array.getSizeOfNameList());
        array.displayNames2();
    }
}
