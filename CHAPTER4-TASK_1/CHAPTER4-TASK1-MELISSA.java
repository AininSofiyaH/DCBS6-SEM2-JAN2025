/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4_task1;

/**
 *
 * @author PC STUDENT 04
 */
public class Chapter4_task1 {

    /**
     * @param args the command line arguments
     */
    //FOR LOOP
    public static void main(String[] args) {
        System.out.println ("-------------FOR LOOP---------------");
        System.out.println ("Printing Numbers from 1 to 10");
        for (int count = 1; count <=10; count++){
            System.out.println (count );}
        System.out.println ("------------------------------------");
        
   //WHILE LOOP
        System.out.println ("-------------WHILE LOOP-------------");
        System.out.println ("Printing Numbers from 1 to 10");
        int count = 1;
        while (count <= 10){
        System.out.println (count++);}
        System.out.println ("-----------------------------------");
        
    //DO WHILE LOOP
        System.out.println ("-----------DO WHILE LOOP-----------");
        System.out.println ("Printing Numbers from 1 to 10");
        int counting = 1;
        do{
        System.out.println (counting++);}
        while (counting <=10);
        System.out.println ("----------------------------------");
    }
}
 
