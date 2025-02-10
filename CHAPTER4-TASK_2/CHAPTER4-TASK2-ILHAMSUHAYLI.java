/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author lammm
 */
public class Chapter4Task2 {
    public static void main (String[] args) {
        
         
        int sumfor = 0;
        for (int f = 1; f <= 10; f++) {
            sumfor += f;
        }
        System.out.println("For Loop: " + sumfor);

        int sum = 0, w = 1;
        while (w <= 10) {
            sum += w;
            w++;
        }
        System.out.println("While Loop: " + sum);

        int sumdo = 0, d = 1;
        do {
            sumdo += d;
            d++;
        } while (d <= 10);
        System.out.println("Do-while Loop: " + sumdo);
    }
}

        
    

