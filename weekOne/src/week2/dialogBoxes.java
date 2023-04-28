package week2;

import javax.swing.JOptionPane;

public class dialogBoxes{
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;

        name = JOptionPane.showInputDialog("What is your name?");

        // need to convert
        hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours did you work"));
        payRate = Double.parseDouble(JOptionPane.showInputDialog("What is your hourly pay rate?"));
        grossPay = hours * payRate;

        JOptionPane.showMessageDialog(null, String.format("Hello %s."+
                "\nYour gross pay is %.2f.", name, grossPay));

        System.exit(0);

    }
}
