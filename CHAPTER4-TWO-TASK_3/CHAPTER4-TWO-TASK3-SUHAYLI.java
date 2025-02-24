/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lammm
 */
import java.util.Scanner;

public class SaleLetter {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        final double BASE_SALARY = 2600.00; //salary
        final double COMMISSION_RATE = 0.05; //commission rate is 5%

        System.out.print("Enter the total sales for the week: RM");
        double grossSales = read.nextDouble(); //read user's input for gross sale

        double commission = grossSales * COMMISSION_RATE; 
        double totalEarnings = BASE_SALARY + commission; 

        //earning's breakdown
        System.out.println("Weekly earnings breakdown:");
        System.out.println("Base salary: RM" + BASE_SALARY);
        System.out.println("Commission (5% of RM" + grossSales + "): RM" + commission);
        System.out.println("Total earnings for the week: RM" + totalEarnings);

        read.close();
    }
}
    

