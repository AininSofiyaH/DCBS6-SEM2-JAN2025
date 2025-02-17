import javax.swing.JOptionPane;

public class Password {
    public static void main(String[] args) {

        String firstGUI; 
        String password = "ipin";

        for (int i = 3; i >= 0; i--) { //3 times loops for 3 attempts only
            firstGUI = JOptionPane.showInputDialog("Enter your password:");
            if (!firstGUI.equals(password)) { //if password is wrong
            JOptionPane.showMessageDialog(null, "Wrong password. You have " + i + " more attempt. Hint: budak botak", "Error", JOptionPane.PLAIN_MESSAGE);
        if (i == 0) //if the user out of attempts
            JOptionPane.showMessageDialog(null, "Too many attempts. Please try again in 30 minutes ", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        else { //if password is correct it will break the loop
            JOptionPane.showMessageDialog(null, "Welcome user", "Success", JOptionPane.PLAIN_MESSAGE);
            break;
            }

    }
}}
