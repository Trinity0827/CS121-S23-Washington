// Assignment 1
// Trinity Washington
// 01/17/2023
package activityOneDialogbox;

// Task 1 Dialog box method
import javax.swing.JOptionPane;


public class activityOneDialogbox {
  public static void main(String[] args) {
    String firstName;
    String lastName;

    firstName = JOptionPane.showInputDialog("What is your First Name");
    lastName = JOptionPane.showInputDialog("What is your last Name");

    JOptionPane.showMessageDialog(null, String.format("Hello %s." + firstName, lastName));

    System.out.println(firstName.toLowerCase() + lastName.toLowerCase());
    System.out.println(firstName.toUpperCase() + lastName.toUpperCase());
    System.exit(0);
  }
}


