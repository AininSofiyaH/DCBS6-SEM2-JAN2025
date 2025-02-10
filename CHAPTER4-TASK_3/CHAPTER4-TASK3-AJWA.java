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
       int evenSum = 0, oddSum = 0;

        System.out.println("Even and odd numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
                evenSum += i;
            } else {
                System.out.println(i + " is odd");
                oddSum += i;
            }
        }
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

   
    

