/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author lammm
 */
public class Chapter4Task4 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Number ^2");
        for (int i = 1; i <= 10; i++) {
            int square = i * i; 
            System.out.println(i + "^2  =  " + square);
            sum += square;
        }

        System.out.println("\nsum of squares: " + sum);
    }
}

    

