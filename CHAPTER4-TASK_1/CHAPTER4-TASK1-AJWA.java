/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task1;

/**
 *
 * @author ASUS
 */
public class Chapter4Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("while loop:");
        int count = 1;
        while (count <= 10) {
            System.out.print(count  + " ");
            count++;
        }
        System.out.println();

        System.out.println("do-while loop:");
        int doWhile = 1;
        do {
            System.out.print(doWhile + " ");
            doWhile++;
        } while (doWhile <= 10);
        System.out.println();
    }
}

    
    

