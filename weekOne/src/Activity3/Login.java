package Activity3;
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args){
        String userName;
        String password;
        userName = "name";
        password = "pw";

        userName= JOptionPane.showInputDialog("What is  userName");
        password= JOptionPane.showInputDialog("What is password");


        if (userName.equals("name") && password.equals("pw")){
            JOptionPane.showMessageDialog(null, "Welcome to Cs121");
        } else if (userName.equals("name") && password != "pw"){
            JOptionPane.showMessageDialog(null, "The password is incorrect");
        } else if(userName != ("name") && password != ("pw")){
            JOptionPane.showMessageDialog(null, "Both username & password incorrect");
        }
        }


}
