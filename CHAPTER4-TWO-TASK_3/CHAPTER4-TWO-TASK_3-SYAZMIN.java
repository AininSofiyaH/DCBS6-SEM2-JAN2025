import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double basicSalary = 600.0;
        double commissionRate = 0.05;
        double totalSales, commission, totalIncome;
        char choice;
        Scanner task3 = new Scanner(System.in);

        do {
            System.out.print("Enter total sales for this week (in RM): ");
            totalSales = task3.nextDouble();

            commission = totalSales * commissionRate;
            totalIncome = basicSalary + commission;

            System.out.printf("Total income for this week: RM%.2f%n", totalIncome);

            System.out.print("Do you want to enter another sales amount? (y/n): ");
            task3.nextLine(); // Consume the newline character
            choice = task3.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // Accepts both lowercase and uppercase 'y'

        System.out.println("Program terminated.");
        task3.close();
    }
}

