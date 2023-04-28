package Activity3;
import java.util.Scanner;
public class ResturantSelector {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String vegetarian;
        String vegan;
        String gluten_free;

        System.out.println("Is anyone in your party a vegetarian? yes or no?");
        vegetarian = console.nextLine();

        if (vegetarian.equals("yes") || vegetarian.equals("no")){
            System.out.println("Is anyone in your party a vegan? yes or no?");
            vegan= console.nextLine();
            if (vegan.equals("yes") || vegan.equals("no")){
                System.out.println("Is anyone in your party a gluten-free? yes or no?");
                gluten_free= console.nextLine();
                if (gluten_free.equals("yes") || gluten_free.equals("no")){
                    System.out.println("\nHere are your restaurant options:");
                    System.out.println("\n");

                    if( vegetarian.equals("yes")){
                        if(vegan.equals("yes")){
                            if(gluten_free.equals("yes") || gluten_free.equals("n")) {
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                        }
                        else{
                            if(gluten_free.equals("yes")){
                                System.out.println("   Main Street Pizza Company\n");
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                            else{
                                System.out.println("   Main Street Pizza Company\n");
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   Mama's Fine Italian\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                        }
                    }
                    else{
                        if (vegan.equals("yes")){
                            if (gluten_free.equals("yes")|| gluten_free.equals("n")){
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                        }
                        else{
                            if (gluten_free.equals("yes")){
                                System.out.println("   Main Street Pizza Company\n");
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                            else{
                                System.out.println("   Joe's Gourmet Burgers\n");
                                System.out.println("   Main Street Pizza Company\n");
                                System.out.println("   Corner Cafe\n");
                                System.out.println("   Mama's Fine Italian\n");
                                System.out.println("   The Chef's Kitchen\n");
                            }
                        }
                    }
                }
            }
        }
    }
}
