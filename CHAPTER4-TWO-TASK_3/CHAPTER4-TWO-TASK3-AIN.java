package salescommission;
import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
      Scanner sales = new Scanner(System.in);
      int soldItems;
      double baseSalary = 600.0, totalSales;
      double commissionRate = 0.05;
      double commission; //kira commision based on sales
      double totalEarnings;
      
      //minta user masukkan total jualan minggu lepas
      System.out.print("Enter the last week's sales (RM): ");
      totalSales = sales.nextDouble(); //simpan input as double
      commission=totalSales*commissionRate;
      totalEarnings = baseSalary + commission;
      
      //hasil kira
        System.out.println("Base Salary: RM " + baseSalary);
        System.out.println("Commission: RM " + commission);
        System.out.println("Total salary of last week: RM " + totalEarnings);

      
      
    }
    
}
