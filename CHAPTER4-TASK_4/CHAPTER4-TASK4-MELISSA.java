/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4_task4;

/**
 *
 * @author PC STUDENT 04
 */
public class Chapter4_task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
       for (int i = 1; i<= 10; i++){
       int power = i * i;
       System.out.println ("Power of " + i + " = " + power);
       sum += power;
       }
     System.out.println ("Sum of powers for 1 to 10 is " +sum);
    }
    
}
