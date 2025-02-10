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
      int sum = 0;

        System.out.println("Calculating the sum of squares (n x n) from 1 to 10:\n");

        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.println(i + "^2 " + i + " = " + square);
            sum += square;
        }

        System.out.println("\nThe total sum of squares from 1 to 10 is: " + sum);
    }
}


    
    

