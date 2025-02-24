/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenodd;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String choice;

        do {
            int evenCount = 0;
            int oddCount = 0;

            System.out.println("enter a sequence of integers (enter 0 to end the sequence):");

            while (true) {
                int number = read.nextInt();

                if (number == 0) {
                    break;
                }

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Display the results
            System.out.println("Number of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another sequence? (yes/no): ");
            choice = read.next().toLowerCase(); //converts user's input to lowercase.

        } while (choice.equals("yes")); //to compare value of strings

        System.out.println("Program exited.");
        read.close();

    }
    
}
