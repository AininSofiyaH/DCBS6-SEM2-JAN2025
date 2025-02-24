/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2b5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER4TASK2b5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner userinp = new Scanner(System.in); // Create a Scanner object for input.
        int choice; // Variable to store the user's menu choice.
        System.out.println("Wilkommen!"); // Welcome message.
        
        do {
             // Display menu options for the user to choose from.
            System.out.println("Choose a program to run:");
            System.out.println("1. Password System");
            System.out.println("2. Student Results");
            System.out.println("3. Even Odd Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = userinp.nextInt(); // Read user choice.
            userinp.nextLine(); // Consume the newline character.
            
        switch (choice) {
            case 1:
                 // Password System
                int option;
                String password;
                    do {
                        System.out.print("Enter password: ");
                        password = userinp.nextLine();  // Read password input.
                        if (password.equals("880818")) {
                            System.out.println("Access granted!");
                        } else {
                            System.out.println("Incorrect password.");
                        }
                        // Ask the user if they want to try again.
                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        option = userinp.nextInt();
                        userinp.nextLine(); // Consume the newline
                    } while (option == 1); // Repeat if user enters 1
                    break;
                       
            case 2:
              // Student Results System
               int choicetest, numstu, pass = 0, fail = 0;
                    do {
                        System.out.print("How many students took the test? ");
                        numstu = userinp.nextInt(); // Read number of students.

                        pass = 0;
                        fail = 0;
                        
                       // Loop through each student and get their score
                        for (int i = 1; i <= numstu; i++) {
                            System.out.print("Enter score for Student " + i + " (0-100): ");
                            int score = userinp.nextInt();

                            if (score >= 50) {
                                pass++; // Increment pass count.
                            } else {
                                fail++; // Increment fail count.
                            }
                        }

                        System.out.println("Passed: " + pass);
                        if (pass > numstu / 2) {
                            System.out.println("Bonus to instructor :)");
                        }
                        System.out.println(); // Print empty line
                        
                        System.out.println("Failed: " + fail);
                        System.out.println("More effort needed :(");
                        // Ask the user if they want to try again.
                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        choicetest = userinp.nextInt();
                    } while (choicetest == 1);  // Repeat if user enters 1.
                    break;
                    
            case 3: 
                // Even and Odd Number Counter
            int num, number, choiceint, even = 0, odd = 0;
                do {
                        System.out.print("How many numbers you want to enter? ");
                        num = userinp.nextInt(); // Read total number of inputs.

                        even = 0;
                        odd = 0;
                         // Loop to get numbers from the user.
                        for (int i = 1; i <= num; i++) {
                            System.out.print("Enter number " + i + ": ");
                            number = userinp.nextInt();

                            if (number % 2 == 0) {
                                even++; // Increment even count
                            } else {
                                odd++; // Increment odd count.
                            }
                        }

                        System.out.println("Total Even Numbers: " + even);
                        System.out.println("Total Odd Numbers: " + odd);
                        // Ask user if they want to repeat.
                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        choiceint = userinp.nextInt();
                    } while (choiceint == 1);
                    break;
 
            case 4 : 
                 // Exit the program.
                System.out.println("Thank you for using this system! Goodbye!");
                break;
            
            default:
                // Handle invalid input.
                System.out.println("Invalid choice. Please try again!");
                   } 
        } while (choice != 4);  // Keep looping until user chooses to exit.
    }
}
    
    

