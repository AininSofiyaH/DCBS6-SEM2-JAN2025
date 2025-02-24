/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task3;

/**
 *
 * @author ASUS
 */
public class Chapter4Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int evenSum = 0, oddSum = 0; // Variables to store the sum of even and odd numbers

        System.out.println("Even and odd numbers from 1 to 10:");
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.println(i + " is even");
                evenSum += i; // Add to even sum
            } else { // If not even, then it's odd
                System.out.println(i + " is odd");
                oddSum += i; // Add to odd sum
            }
        }
         // Display the total sum of even and odd
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

   
    

