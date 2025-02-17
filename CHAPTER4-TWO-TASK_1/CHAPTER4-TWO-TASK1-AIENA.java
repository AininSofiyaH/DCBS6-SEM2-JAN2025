/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paswordsys;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class PaswordSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String username, password = "poethonor"; // password 
        String inputPassword; // to declare variable to the String
        int attempts = 3; // limit attempts to 3

        
        System.out.println ("Hello!");
        System.out.println ("Enter username : ");
        username = read.nextLine();
        
        do {
            System.out.print("Enter password: "); //user will input their password
            inputPassword = read.nextLine();

            if (inputPassword.equals(password)) { //to compare actual value 
                System.out.println("Yup,Access Granted!"); //output for correct password
                break; //if user enter correct password, loop exit
            } else {
                attempts--; //decrease number of remaining attempts
                System.out.println("Incorrect password :( Attempts left: " + attempts);
            }
            
            }while (attempts >0); //loops run again
            
                
            if (attempts == 0) { // loop stops
            System.out.println("Access Denied"); //if attempt reach limit, access will be denied
        }
        read.close();
    }
}










    
    

