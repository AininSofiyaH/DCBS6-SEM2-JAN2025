/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2b3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER4TASK2b3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseSalary = 600.0;
        double commissionRate = 0.05; 
        
        System.out.print("Enter the total sales for the week (RM): ");
        double totalSales = scanner.nextDouble();
        
        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission + totalSales;

        System.out.println("Salesman Weekly Earnings ");
        System.out.println("Fixed Salary: RM" + baseSalary);
        System.out.println("Commission (5% of RM" + totalSales + "): RM" + commission);
        System.out.println("Total Earnings: RM" + totalEarnings);

        scanner.close();
    }
}
    
