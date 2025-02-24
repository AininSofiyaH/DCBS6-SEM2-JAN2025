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
// Loop will keep running as long as the userstill has attempts left
        while (attempts > 0) {
// Show an input dialog to ask the user for password
            String input = JOptionPane.showInputDialog("Please enter your password:");
// If the user clicks "Cancel" instead of entering a password, exit the program.
            if (input == null) {
                JOptionPane.showMessageDialog(null, "You canceled the login. Exiting...");
                return;
            }
 // Check if the entered password matches the correct one.
            if (input.equals(password)) {
                JOptionPane.showMessageDialog(null, "Access granted!");
                return;
            } else {
                attempts--;
                JOptionPane.showMessageDialog(null, "Incorrect password. " + attempts + " attempts left.");
            }
        }
// If the user runs out of attempts, show an "Access denied" message
        JOptionPane.showMessageDialog(null, "Too many failed attempts! Access denied.");
    }
}
