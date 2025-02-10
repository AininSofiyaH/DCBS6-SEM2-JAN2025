/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author lammm
 */
public class Chapter4Task3 {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        System.out.println("even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); 
                evenSum += i; 
            }
        }

        System.out.println("\nsum of even numbers: " + evenSum);

        System.out.println("\nodd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " "); 
                oddSum += i;
            }
        }
        System.out.println("\nsum of odd numbers: " + oddSum);
    }
}


