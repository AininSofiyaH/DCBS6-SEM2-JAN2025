/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2;

/**
 *
 * @author ASUS
 */
public class Chapter4Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using a for loop to calculate the sum of numbers from 1 to 10
        System.out.println("Calculating sum using a for loop:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
            sum += i; // Add the current value of i to sum
        }
        System.out.println("The total sum from 1 to 10 is: " + sum);
        // Using a while loop to calculate the sum of numbers from 1 to 10
        System.out.println("\nCalculating sum using a while loop:");
        sum = 0; // Reset sum to 0
        int While = 1;
        while (While <= 10) {
            sum += While;
            While++;  // Increment counter by 1
        }
        System.out.println("The total sum from 1 to 10 is: " + sum);
        // Using a do-while loop to calculate the sum of numbers from 1 to 10
        System.out.println("\nCalculating sum using a do-while loop:");
        sum = 0;
        int DoWhile = 1;
        do {
            sum += DoWhile;
            DoWhile++;
        } while (DoWhile <= 10); // Repeat the loop until counter exceeds 10
        System.out.println("The total sum from 1 to 10 is: " + sum);
    }
}

   
    

