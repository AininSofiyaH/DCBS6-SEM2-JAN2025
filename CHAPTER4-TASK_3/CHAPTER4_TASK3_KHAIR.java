/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classspg;

/**
 *
 * @author a_kha
 */
public class CHAPTER4_TASK3_KHAIR {
    
       public static void main(String[] args) {
        int sumEven = 0, sumOdd = 0;
        
        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nSum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}

    

