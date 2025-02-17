import javax.swing.JOptionPane;

public class Password {
    public static void main(String[] args) {

        String firstGUI;
        String password = "ipin";

        for (int i = 3; i >= 0; i--) {
            firstGUI = JOptionPane.showInputDialog("Enter your password:");
            if (!firstGUI.equals(password)) {
            JOptionPane.showMessageDialog(null, "Wrong password. You have " + i + " more attempt. Hint: budak botak", "Error", JOptionPane.PLAIN_MESSAGE);
        if (i == 0)
            JOptionPane.showMessageDialog(null, "Too many attempts. Please try again in 30 minutes ", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        else {
            JOptionPane.showMessageDialog(null, "Welcome user", "Success", JOptionPane.PLAIN_MESSAGE);
            break;
            }

    }
}}