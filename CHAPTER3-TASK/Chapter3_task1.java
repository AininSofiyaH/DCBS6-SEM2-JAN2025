/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final_mark;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Chapter3_task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int fm;
      Scanner userdata= new Scanner(System.in);
  
      
      System.out.println("Please enter your mark in  exam.(/100):"); 
      fm = userdata.nextInt();
     
      System.out.println("Grade:"); 

      if(fm>=80)
          System.out.println("A"); 
      else if(fm>=60)
          System.out.println("B");
      else if(fm>=50)
          System.out.println("C"); 
      else if(fm>=40)
          System.out.println("D"); 
       else
          System.out.println("F"); 
    }
    
}