package Activity3;
import java.util.Scanner;
public class SwitchActivity {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Choose a Planet of mercury, venus, earth, or mars ");
        String planet = console.nextLine();


        switch (planet) {
            case "mercury":
                System.out.println("The distance is from the sun is 3.5. The size of this planet is 3031.9");
                break;
            case "venus":
                System.out.println("The distance is from the sun is 6.7. The size of this planet is 3760.4");
                break;
            case "earth" :
                System.out.println("The distance is from the sun is 9.3. The size of this planet is 3958.8");
                break;
            case "mars":
                System.out.println("The distance is from the sun is 14.2. The size of this planet is 2106.1");
                break;
            }
        System.out.println(planet);
        console.close();
    }
}
