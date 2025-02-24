/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2b4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER4TASK2b4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        char choice; // Variable to store user choice for continuation.

        do {
            int evenCount = 0, oddCount = 0; // Initialize counters for even and odd numbers.
             // Ask the user how many numbers they want to input.
            System.out.print("Enter the number of integers: ");
            int n = input.nextInt();

            System.out.println("Enter " + n + " integers:");
            // Loop through the number of inputs specified by the user.
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();  // Read the next integer.
                 // Check if the number is even or odd.
                if (num % 2 == 0) {
                    evenCount++; // Increment even count if the number is divisible by 2.
                } else {
                    oddCount++;  // Increment odd count.
                }
            }

            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
// Ask the user if they want to continue or exit.
            System.out.print("Do you want to continue? (Yes/No): ");
            choice = input.next().charAt(0); // Read the first character of the input.

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program exited. Thank you!");
        input.close(); //Close the scanner 
    }
}
    
