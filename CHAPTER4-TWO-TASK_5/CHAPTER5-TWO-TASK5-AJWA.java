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
       Scanner userinp = new Scanner(System.in);
        int choice;
        System.out.println("Wilkommen!");
        
        do {
            System.out.println("Choose a program to run:");
            System.out.println("1. Password System");
            System.out.println("2. Student Results");
            System.out.println("3. Even Odd Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = userinp.nextInt();
            userinp.nextLine();
            
        switch (choice) {
            case 1:
                int option;
                String password;
                    do {
                        System.out.print("Enter password: ");
                        password = userinp.nextLine();
                        if (password.equals("880818")) {
                            System.out.println("Access granted!");
                        } else {
                            System.out.println("Incorrect password.");
                        }
                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        option = userinp.nextInt();
                        userinp.nextLine();
                    } while (option == 1);
                    break;
                       
            case 2:
               int choicetest, numstu, pass = 0, fail = 0;
                    do {
                        System.out.print("How many students took the test? ");
                        numstu = userinp.nextInt();

                        pass = 0;
                        fail = 0;

                        for (int i = 1; i <= numstu; i++) {
                            System.out.print("Enter score for Student " + i + " (0-100): ");
                            int score = userinp.nextInt();

                            if (score >= 50) {
                                pass++;
                            } else {
                                fail++;
                            }
                        }

                        System.out.println("Passed: " + pass);
                        if (pass > numstu / 2) {
                            System.out.println("Bonus to instructor :)");
                        }
                        System.out.println();
                        
                        System.out.println("Failed: " + fail);
                        System.out.println("More effort needed :(");

                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        choicetest = userinp.nextInt();
                    } while (choicetest == 1);
                    break;
                    
            case 3: 
            int num, number, choiceint, even = 0, odd = 0;
                do {
                        System.out.print("How many numbers you want to enter? ");
                        num = userinp.nextInt();

                        even = 0;
                        odd = 0;

                        for (int i = 1; i <= num; i++) {
                            System.out.print("Enter number " + i + ": ");
                            number = userinp.nextInt();

                            if (number % 2 == 0) {
                                even++;
                            } else {
                                odd++;
                            }
                        }

                        System.out.println("Total Even Numbers: " + even);
                        System.out.println("Total Odd Numbers: " + odd);

                        System.out.print("Enter 1 to try again, 0 to exit: ");
                        choiceint = userinp.nextInt();
                    } while (choiceint == 1);
                    break;
 
            case 4 : 
                System.out.println("Thank you for using this system! Goodbye!");
                break;
            
            default:
                System.out.println("Invalid choice. Please try again!");
                   } 
        } while (choice != 4); 
    }
}
    
    

