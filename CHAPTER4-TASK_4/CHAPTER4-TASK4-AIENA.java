/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4.task.pkg4;

/**
 *
 * @author Nuwaira
 */
public class Chapter4Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumPTwo = 0;
        
        for (int i = 1; i <= 10; i++) {
            int powerTwo = i * i;
            sumPTwo += powerTwo;
            System.out.println("Square of " + i + " is: " + sumPTwo);
        }
        
        System.out.println("Sum square from 1 to 10 : " + sumPTwo);
    }
}




    
    

