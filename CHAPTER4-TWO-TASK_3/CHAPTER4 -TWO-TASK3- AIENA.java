/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salescommi;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class SalesCommi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //double used for decimal values
        double baseSalary = 600.0; //to define base salary
        double commissionRate = 0.05;

        // Create a Scanner object for input
        Scanner sales = new Scanner(System.in);

        // gross sales for the week
        System.out.print("Enter the total sales for the week (RM): ");
        double grossSales = sales.nextDouble();

        double commission = grossSales * commissionRate; //to calculate commision
        double totalEarnings = baseSalary + commission; //calculate the total earnings 

        // Output: Display the earnings
        System.out.printf("Salesman's earnings for the week: RM%.2f\n", totalEarnings);

        // close scanner
        sales.close();
    

    }
    
}
