/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap3_task4;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Chap3_Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int qa,menu,food,pay,pri;
         double total;
         
        System.out.println("**************************");
        System.out.println(" Welcom to the Pasta-Pro! ");
        System.out.println("**************************");
        System.out.println("***********MENU***********");
        System.out.println("|   1.Aglio olio RM10    |");
        System.out.println("|   2.Arfredo Pasta RM13 |");
        System.out.println("|   3.Carbonara RM12     |");
      Scanner userdata= new Scanner(System.in);
  
      System.out.println("Please enter choose food from menu(1-3):");
      food = userdata.nextInt();
      
      if(food==1){
          pri=10;
          }
      else if(food==2)
      {pri=13;
          }
      else {
          pri=12;}
      
      System.out.println("Please enter quantity:");
      qa = userdata.nextInt();
      //userdata.nextLine();
    
      System.out.println("Payment method");
      System.out.println("1.Cash\n2.QR\n3.Credit/debit card");
      System.out.println("Please select payment method from menu(1-3):");
      pay = userdata.nextInt();
System.out.println("Order\nFood:");
if(food==1){
          System.out.println("Aglio olio");
          }
      else if(food==2)
      {System.out.println("Arfredo Pasta");
          }
      else {
          System.out.println("Carbonara");}
System.out.println("Quantity:"+qa);
total=qa*pri;
System.out.println(String.format("Total:%.2f", total));
System.out.println("Payment method:");
 if(pay==1){
         System.out.println("Cash");
          }
      else if(pay==2)
      {System.out.println("QR");
          }
      else {
          System.out.println("Credit/Debit Card");}
 System.out.println("Thank you for order!");
    }
    
}
