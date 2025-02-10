/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4.task3;

/**
 *
 * @author Nuwaira
 */
public class Chapter4Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int sumEven = 0;
        int sumOdd = 0;
        
        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumEven += i;
            }
        }
        System.out.println("\nSum of even numbers: " + sumEven);
        
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumOdd += i;
            }
        }
        System.out.println("\nSum of odd numbers: " + sumOdd);
    }
}

         
    











    
    

