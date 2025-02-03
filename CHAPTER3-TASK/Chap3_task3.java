/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap3_task3;

import java.util.Scanner;

/**
 *
 * @author Damia
 */
public class Chap3_task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String name;
         int qa,menu,disc = 0;
         double disaf=0,pri;
      Scanner userdata= new Scanner(System.in);
  
      System.out.println("Please enter item name:");
      name = userdata.nextLine();
      
      
      System.out.println("Please enter quantity:");
      qa = userdata.nextInt();
      
      userdata.nextLine();
      System.out.println("Please enter price(RM):"); 
      pri = userdata.nextDouble();
      //userdata.nextLine();
        double total = pri*qa;
      System.out.println("Color Code(discount rate)Menu");
      System.out.println("1.Red(25%)\n2.Yellow(50%)\n3.blue(60%)\n4.Purple(75%)\n5.Green(90%)");
      System.out.println("Please select color code(discount rate) from menu(1-5):");
      menu = userdata.nextInt();
      userdata.nextLine();

      //userdata.close();
      
      if(menu==1){
          disc=25;
          disaf=total*0.25;
          }
      else if(menu==2)
      {disc=50;
          disaf=total*0.50;}
      else if(menu==3){
          disc=60;
          disaf=total*0.6;}
      else if(menu==4){
          disc=75;
          disaf=total*0.75; }
      else{
          disc=90;
          disaf=total*0.9; }
        

      
      System.out.println("Item Name:"+name) ;
      System.out.println("price:RM"+pri);
      System.out.println("Quantity :"+qa);
      System.out.println("total price:RM"+total);
      System.out.println("discount rate:"+disc+"%");
      System.out.println("price after discount:RM"+(total-disaf));
    }   
}
     

