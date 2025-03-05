/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5task1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER5TASK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getUserInput = new Scanner(System.in);
        char choice;

        do {
         
            System.out.println("Enter three integers:");
            System.out.print("Enter first number: ");
            int num1 = getUserInput.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = getUserInput.nextInt();

            System.out.print("Enter third number: ");
            int num3 = getUserInput.nextInt();

            int max = Math.max(num1, Math.max(num2, num3));
            int min = Math.min(num1, Math.min(num2, num3));

            System.out.println("\nMaximum value: " + max);
            System.out.println("Minimum value: " + min);
            
            System.out.print("\nDo you want to try again? (Y/N): ");
            choice = getUserInput.next().charAt(0);
            
        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nSystem exited. Thank you for using my system !");
        getUserInput.close();
    }
}