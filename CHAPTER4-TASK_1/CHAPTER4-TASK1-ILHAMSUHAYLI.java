/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author lammm
 */
public class Chapter4Task1 {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        for (int f = 1; f <= 10; f++) {
            System.out.print(f + " ");
        }
        
        System.out.println("\n"); 

        System.out.println("While Loop:");
        int w = 1;
        while (w <= 10) {
            System.out.print(w + " ");
            w++;
        }
        
        System.out.println("\n"); 

        System.out.println("Do-while Loop:");
        int d = 1;
        do {
            System.out.print(d + " ");
            d++;
        } while (d <= 10);
        
        System.out.println(); 
    }
}

    
