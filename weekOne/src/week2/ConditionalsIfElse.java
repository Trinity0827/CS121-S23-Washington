package week2;
import javax.swing.JOptionPane;
public class ConditionalsIfElse {
    public static void main(String[] args){
        /*
        int age = 20;

        if (age >= 21){
            System.out.println("Is 21 or over");
        } else if (age % 2 == 0){
            System.out.println("this is an even number");
        } else if (age != 21){
            System.out.println("Age not 21");
        } else {
            System.out.println("None of the above");
        }
         */
        int testScore;

        testScore = Integer.parseInt(JOptionPane.showInputDialog("Enter numeric test score"));
        if(testScore < 60){
            JOptionPane.showMessageDialog(null,"Your grade is F");
        }
    }

}
