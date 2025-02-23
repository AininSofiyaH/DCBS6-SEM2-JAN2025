/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5_2looping;

/**
 *
 * @author 1
 */
import java.util.Scanner;

public class Task5_2Looping {

    public static void main(String[] args) {
        String name;
        int choice;
        Scanner intUser = new Scanner(System.in);
        
        System.out.println("********** WELCOME TO ARTSYBIRB SYSTEM!!! **********");
        System.out.print("Please enter your name: ");
        name = intUser.nextLine();

        do {
            System.out.println("1. Guess The Password System ");
            System.out.println("2. Student's Test Result and Bonus Eligibility System ");
            System.out.println("3. Odd and Even Integers Sequence System ");
            System.out.println("4. Exit ");
            System.out.print("Please enter your desired system (1/2/3/4): ");
            choice = intUser.nextInt();

            intUser.nextLine(); 

            switch (choice) {
                case 1:
                    // Password guessing system
                    String inputPass;
                    String password = "ArtsyBirb";
                    int maxAttempt = 2;
                    int attempt;
                    int attemptLeft;
                    int select = 0;
                    boolean authenticated = false;
                    
                    do{
                        attempt = 0;
                    System.out.println("===== | Welcome to Guess the password system! You will only have 2 attempts. | =====");
                    
                    
                        while (attempt < maxAttempt) {
                            System.out.print("Please enter your password: ");
                            inputPass = intUser.nextLine();

                            if (inputPass.equals(password)) {
                                System.out.println("Your password is correct. Congratulations!!!");
                                authenticated = true;
                                break;
                            } else {
                                attempt++;
                                attemptLeft = maxAttempt - attempt;
                                System.out.println("Incorrect password. You have " + attemptLeft + " attempt(s) left.");
                            }
                        }

                        if (!authenticated) {
                            System.out.println("Your attempts have maxed out. Please try again.");
                        }

                        // Ask user if they want to continue after the attempts
                        System.out.print("? Do you wish to continue using this system? 1 for yes, 0 for no: ");
                        select = intUser.nextInt(); // User input for continuation
                        intUser.nextLine(); // Clear the buffer

                    } while (select == 1); // Loop will continue if select is 1

                    break;

                case 2:
                    int stuNum, result;
                    int passTest = 0;
                    int failedTest = 0;
                    int userTestC;
                    
                    do{
                    System.out.println("===== | Welcome to tudent's Test Result and Bonus Eligibility System | =====");
                    //Asking test results from the user
                    System.out.print ("Please enter the number of your student : ");
                    stuNum = intUser.nextInt();
        
                    //Getting test result from the student
                    for (int i = 1; i <= stuNum; i++){
                        System.out.print ("Please enter result for student " + i + " ('1' for pass, '0' for failed.) : ");
                        result = intUser.nextInt();
                    //Counting passed and failed students
         
                    if (result == 1){
                          passTest++;
                          } else if (result == 0){
                          failedTest++;
                          } else {
                    System.out.println ("!!! Invalid input. Please enter 1 for passed or 0 for failed only. !!! ");
                    i--;
         }
        }
                System.out.println ("Number of students who passed the test : " +passTest);
                System.out.println ("Number of students who failed the test : " +failedTest);
         
                    if (passTest > stuNum/2){
                        System.out.println ("Bonus to instructor");
                     } else {
                        System.out.println ("No bonus to instructor");}
                    
                     System.out.print("? Do you wish to continue using this system? 1 for yes, 0 for no: ");
                        userTestC = intUser.nextInt(); // User input for continuation
                        intUser.nextLine(); // Clear the buffer

                    } while (userTestC == 1); 

                    break;

                case 3:
                    int numIn, num, even = 0, odd = 0;
                    int evenOddC;
                    
                    do{
                    System.out.println ("===== | Welcome to Odd and Even Integers Sequence System | =====");
                    System.out.print ("Please enter your number sequence : ");
                    numIn = intUser.nextInt();
        
                    even = 0;
                    odd = 0;
        
                    for (int i = 0; i < numIn; i++){
                    System.out.print ("Please enter your number(s) : ");
                    num = intUser.nextInt();
            
                    if (num %2 == 0){
                        even++;
                    } else {
                        odd++;
                        }
                    }
                    System.out.println ("Even number in your sequence : " +even);
                    System.out.println ("Odd number in your sequence : " +odd);
                    
                    System.out.print("? Do you wish to continue using this system? 1 for yes, 0 for no: ");
                        evenOddC = intUser.nextInt(); // User input for continuation
                        intUser.nextLine(); // Clear the buffer

                    } while (evenOddC == 1); 
                    
                    break;

                case 4:
                    System.out.println("--- Exiting the system...---");
                    System.out.println("         GoodBye!!!         ");// Proper exit message
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
                    break;
            }

        } while (choice != 4); // Main loop continues until user selects '4' to exit

        intUser.close();  // Close the scanner to avoid resource leak
    }
}

