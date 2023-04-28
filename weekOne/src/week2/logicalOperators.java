package week2;

public class logicalOperators {
    public static void main(String[] args){
        int x = 5;
        int y = 4;
        int z = 3;
        String greatest = "null";

        if(x == y && x == z){
            greatest = "equal";
        } else if (x > y && x > z) {
            greatest = String.valueOf(x); //"5", give us 5 as an string
        }//else {
           // greatest = "null";
        System.out.println(greatest);
    }
}
