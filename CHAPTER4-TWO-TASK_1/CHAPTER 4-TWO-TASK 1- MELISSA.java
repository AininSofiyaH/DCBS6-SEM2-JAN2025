/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordsystem;

/**
 *
 * @author PC STUDENT 04
 */
import java.util.Scanner;
public class PasswordSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variable
        String inputPass;
        String password = "ArtsyBirb";
        int maxAttempt = 2;
        int attempt = 0;
        int attemptLeft;
        boolean authenticated = false;
        Scanner userInput = new Scanner (System.in);
        
        System.out.println ("Welcome to the password system! You will only have 2 attempts.");
        
        //create password loop 
        while (attempt < maxAttempt){
        System.out.print ("Please enter your password : ");
        inputPass = userInput.nextLine();
        
        //if the password is correct
        if (inputPass.equals(password)) {
        System.out.print ("Your password is correct. Congratulation!!!");
        authenticated = true;
        break;
        } else {
            attempt++;
            attemptLeft = maxAttempt - attempt;
            System.out.println ("Incorrect password. You have " + (attemptLeft) + " left.");
        }
       }
        //when the password attempt had maxed ou by user
        if(!authenticated){
        System.out.println ("Your attempt had maxed out. Please try again.");
        }
        userInput.close();
        
    }
    
}
