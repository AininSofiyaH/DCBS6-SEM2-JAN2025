/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap4_task1;

/**
 *
 * @author Damia
 */
public class Chapter4_Task2_MusfirahDamia {
     public static void main(String[] args) {
        // TODO code application logic here
        int countW =1;
        int countDW =1;
        int countFor =1;
        int sumFor = 0,sumDW=0,sumW=0;
        System.out.println("Printing Numbers from 1 to 10(while)");
                while(countW<=10){
                    sumW +=countW;
                    System.out.println(countW);
                    countW++;
                    
                }
                System.out.println("sum of 1 to 10 is"+sumW);
         System.out.println("Printing Numbers from 1 to 10(DoWhile)");
        do{
            sumDW +=countDW;
    System.out.println(countDW);
    countDW++;
    
        }
    while(countDW <= 10);
        System.out.println("sum of 1 to 10 is"+sumDW);
        System.out.println("Printing Numbers from 1 to 10(For)");
        for(countFor =1; countFor<=10;countFor++){
            sumFor += countFor;
            System.out.println(countFor);
            
        }
        System.out.println("sum of 1 to 10 is"+sumFor);
             }
    
}
