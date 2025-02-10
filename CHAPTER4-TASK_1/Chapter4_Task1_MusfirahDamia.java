/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap4_task1;

/**
 *
 * @author Damia
 */
public class Chapter4_Task1_MusfirahDamia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int countW =1;
        int countDW =1;
        int countFor =1;
        System.out.println("Printing Numbers from 1 to 10(while)");
                while(countW<=10){
                    System.out.println(countW++);
                }
         System.out.println("Printing Numbers from 1 to 10(DoWhile)");
        do{
    System.out.println(countDW++);}
    while(countDW <= 10);
        System.out.println("Printing Numbers from 1 to 10(For)");
        for(countFor =1; countFor<=10;countFor++){
            System.out.println(countFor);
        }
             }
    }
    

