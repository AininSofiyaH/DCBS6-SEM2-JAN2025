/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task5;

/**
 *
 * @author ASUS
 */
public class Chapter4Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Displaying a message before printing the sequence
       System.out.println("Displaying the sequence: 99 88 77 66 55 44 33 22 11\n");
      // Loop to generate and print the sequence  
        for (int i = 99; i >= 11; i -= 11) {
            System.out.print(i + " "); // Print the current value of i
        }
       // Move to the next line 
        System.out.println();
    }
}

 
