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
        char choice;

        do {
            int evenCount = 0, oddCount = 0;

            System.out.print("Enter the number of integers: ");
            int n = input.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);

            System.out.print("Do you want to continue? (Yes/No): ");
            choice = input.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Program exited. Thank you!");
        input.close();
    }
}
    
