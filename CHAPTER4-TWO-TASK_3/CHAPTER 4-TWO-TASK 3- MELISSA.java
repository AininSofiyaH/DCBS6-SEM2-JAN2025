/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salescommission;

/**
 *
 * @author PC STUDENT 04
 */
import java.util.Scanner;
public class SalesCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String salesName;
        double soldItems, basicSlry,commission,totalSlry, commissionRate;
        Scanner salary = new Scanner (System.in);
        
        //Get input from user
        System.out.print ("Please enter your name : ");
        salesName = salary.nextLine();
        
        System.out.print ("Please enter your sold item for the week : RM ");
        soldItems = salary.nextDouble();
        
        basicSlry = 600.00;
        commissionRate = 0.05;
        
        commission = soldItems * commissionRate;
        totalSlry = basicSlry + commission;
        
        System.out.println ("Salesman name : " +salesName);
        System.out.println ("Sales Comission : RM "+ String.format ("%.2f", commission));
        System.out.println ("Total salary for the week : RM "+ String.format ("%.2f", totalSlry));
        salary.close();
        
    }
    
}
