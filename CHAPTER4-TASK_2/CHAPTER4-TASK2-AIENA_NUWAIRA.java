/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4.task2;

/**
 *
 * @author Nuwaira
 */
public class Chapter4Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // For loop
        System.out.println("Using for loop:");
        int sumFor = 0;
        for (int i = 0; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum for for loop: " + sumFor);
        System.out.println();

        // While loop
        System.out.println("Using while loop:");
        int a = 0, sumWhile = 0;
        while (a <= 10) {
            sumWhile += a;
            a++;
        }
        System.out.println("Sum for while loop: " + sumWhile);
        System.out.println();

        // Do-while loop
        System.out.println("Using do-while loop:");
        int b = 0, sumDW = 0;
        do {
            sumDW += b;
            b++;
        } while (b <= 10);
        System.out.println("Sum for do-while loop: " + sumDW);
    }
}



