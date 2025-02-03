/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chap3_task2;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Chap3_task2 {

    /**
     * @param args the command line arguments
     */
   
     public static void main(String[] args) {
        float a,b,add,sub,div,mul,rem;
        int menu;
        Scanner userdata= new Scanner(System.in);
        System.out.println("Please enter number for a:");
         a = userdata.nextFloat();
         System.out.println("Please enter number for b:");
         b = userdata.nextFloat();
         System.out.println("Menu\n1.addition(+)\n2.substraction(-)\n3.division(/)\n4.multiplication(*)\n5.Remainder(%)");
         System.out.println("Please select arithmetic operator from menu(1-5):");
         menu = userdata.nextInt();
         add= a+b;
         sub=a-b;
         mul=a*b;
         div=a/b;
         rem=a%b;
        switch (menu){
            case 1:System.out.println(a+"+"+b+"="+add);break;
            case 2:System.out.println(a+"-"+b+"="+sub);break;
            case 3:System.out.println(a+"/"+b+"="+div);break;
            case 4:System.out.println(a+"*"+b+"="+mul);break;
            case 5:System.out.println(a+"%"+b+"="+rem);break;
           
            default:System.out.println("invalid choose.");break;
           
        }
    }
}
