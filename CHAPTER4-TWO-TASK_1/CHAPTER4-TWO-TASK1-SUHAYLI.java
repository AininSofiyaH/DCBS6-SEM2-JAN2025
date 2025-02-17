/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2a;

/**
 *
 * @author lammm
 */

import javax.swing.JOptionPane;
public class Chapter4Task2a {
    
    private static final String Password = "lam"; // password
    private static final int MaxAttempts = 3; // maximum attempts

    public static void main(String[] args) {
        int attempts = 0;
        boolean isAuthenticated = false;

        while (attempts < MaxAttempts) {
            String userInput = JOptionPane.showInputDialog("Enter password:"); 

            if (userInput == null) { // if user click cancel
                JOptionPane.showMessageDialog(null, "Operation cancelled.");
                return;
            }

            if (userInput.equals(Password)) { 
                isAuthenticated = true; // correct password entered
                break;
            } else { // if password entered is incorrect
                attempts++;
                JOptionPane.showMessageDialog(null, "Incorrect password. Attempts left:" + (MaxAttempts - attempts));
            }
        }

        if (isAuthenticated) {
            JOptionPane.showMessageDialog(null, "Access Granted.");
        } else {
            JOptionPane.showMessageDialog(null, "Maximum password limit exceeded given. Access denied.");
        }
    }
}
