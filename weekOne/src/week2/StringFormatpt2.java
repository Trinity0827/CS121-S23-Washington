package week2;

public class StringFormatpt2 {
    public static void main(String[] args) {
        String name = "John Doe";

       // System.out.printf("0. %s\n", name);
        //System.out.printf("1. %s\n", name.replace("John", "Jane"));
       // System.out.printf("2. %s\n", name);
       // name = name.replace("John", "Jane");
       // System.out.printf("3. %s\n" , name);

       // System.out.println(name.length());
       // System.out.println(name.toLowerCase());
       // System.out.println(name.toUpperCase());
        //System.out.println(name);

        //System.out.printf("Initials: %s.%s.\n", name.charAt(0), name.charAt(5));
        System.out.printf("First name: %s \n Last name:%s\n", name.substring(0,4), name.substring(5,8));

    }
}
