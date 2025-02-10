/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4_task3;

/**
 *
 * @author PC STUDENT 04
 */
public class Chapter4_task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int even = 0, odd = 0;
        for (int i = 1; i <= 10; i++){
            if ( i % 2 == 0){
                System.out.println (" Even: " +i);
                even += i;
            } else {
                System.out.println (" Odd: " +i);
                odd += i;
            }
        }
        System.out.println ("Sum of even numbers : " +even);
        System.out.println ("Sum of odd numbers : " +odd);
    }
    
}
