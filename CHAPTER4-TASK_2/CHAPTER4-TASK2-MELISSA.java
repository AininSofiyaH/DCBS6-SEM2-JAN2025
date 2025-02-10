/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4_task2;

/**
 *
 * @author PC STUDENT 04
 */
public class Chapter4_task2 {

    /**
     * @param args the command line arguments
     */
    //FOR LOOP
    public static void main(String[] args) {
        int sum = 0;
        System.out.println ("-------------FOR LOOP---------------");
        for (int count = 1; count <=10; count++){
            sum += count;}
        System.out.println ("The sum of 1 to 10 is " +sum);
        System.out.println ("------------------------------------");
        
   //WHILE LOOP
        sum = 0;
        System.out.println ("-------------WHILE LOOP-------------");
        int count1 = 1;
        while (count1 <= 10){
        sum += count1;
        count1++;}
        System.out.println ("The sum of 1 to 10 is " +sum);
        System.out.println ("-----------------------------------");
        
        
    //DO WHILE LOOP 
        sum = 0;
        System.out.println ("-----------DO WHILE LOOP-----------");
        int counting = 1;
        do{
        sum += counting;
        counting++;}
        while (counting <=10);
        System.out.println ("The sum of 1 to 10 is " +sum);
        System.out.println ("----------------------------------");
    }
    
}
