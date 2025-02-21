/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looptask2a_chap4;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Task2b_1 {
      public static void main(String[] args) {
      String prodname;
      int qa;
      double total,pri,gross,all;
      Scanner sales= new Scanner(System.in);
    System.out.println("Please enter product name:");
      prodname = sales.nextLine();
      
      
      System.out.println("Please enter quantity:");
      qa = sales.nextInt();
      
      sales.nextLine();
      System.out.println("Please enter price(RM):"); 
      pri = sales.nextDouble();
      total =pri*qa;
      gross=total*0.05;//利益計算
      all = total+gross;
       System.out.println("product name:"+prodname);
       System.out.println("total sales for previous week:RM"+total);
       System.out.println("Sales Earning:RM"+all);
      
    
      }
}
