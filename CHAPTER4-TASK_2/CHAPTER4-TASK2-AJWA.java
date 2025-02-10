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
        System.out.println("Calculating sum using a for loop:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The total sum from 1 to 10 is: " + sum);

        System.out.println("\nCalculating sum using a while loop:");
        sum = 0;
        int While = 1;
        while (While <= 10) {
            sum += While;
            While++;
        }
        System.out.println("The total sum from 1 to 10 is: " + sum);

        System.out.println("\nCalculating sum using a do-while loop:");
        sum = 0;
        int DoWhile = 1;
        do {
            sum += DoWhile;
            DoWhile++;
        } while (DoWhile <= 10);
        System.out.println("The total sum from 1 to 10 is: " + sum);
    }
}

   
    

