package Activity7.StringArrayList;

import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> names = new ArrayList<>();

    // add String to the list
    public void addName(String name){
        names.add(name);
    }

    // remove String from list
    public void removeName(String name){
        names.remove(name);
    }

    // get size of list
    public String getSizeOfNameList(){
        return String.valueOf(names.size());
    }

    // get an element by index
    public String getName(String index){
        return names.get(Integer.parseInt(index));
    }


    // for each loop
    public void displayNames1(){
        System.out.printf("Names:%n");
        for (Object name: names);{
            System.out.printf("%s%n", names);
        }
    }

    // regular for loop
    public void displayNames2(){
        System.out.printf("Names:%n");
        for (int i = 0; i < names.size(); i++){
            System.out.printf("%s%n", names.get(i));
        }
    }



}
