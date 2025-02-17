/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4.task2a1;

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class CHAPTER4TASK2a1 {

    /**
     * @param args the command line arguments
     */
 
 public static void main(String[] args) {
        String password = "880818"; 
        int attempts = 3;

        while (attempts > 0) {
            String input = JOptionPane.showInputDialog("Please enter your password:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "You canceled the login. Exiting...");
                return;
            }

            if (input.equals(password)) {
                JOptionPane.showMessageDialog(null, "Access granted!");
                return;
            } else {
                attempts--;
                JOptionPane.showMessageDialog(null, "Incorrect password. " + attempts + " attempts left.");
            }
        }

        JOptionPane.showMessageDialog(null, "Too many failed attempts! Access denied.");
    }
}
