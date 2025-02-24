/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task4;

/**
 *
 * @author ASUS
 */
public class Chapter4Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
      int sum = 0; // Variable to store the sum of squares

        System.out.println("Calculating the sum of squares (n x n) from 1 to 10:\n");
         // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = i * i; // Calculate the square of the number
            System.out.println(i + "^2 " + i + " = " + square);
            sum += square; // Add the square to the total sum
        }
// Display the total sum
        System.out.println("\nThe total sum of squares from 1 to 10 is: " + sum);
    }
}


    
    

