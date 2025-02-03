import java.util.Scanner;

public class MenuKFK {
    public static void main(String[] args) {
        
        System.out.println("==============================================");
        System.out.println("|      Welcome to Kelantan Fried Kittens     |");
        System.out.println("==============================================");
        System.out.println("                   Menu\n");
        System.out.println("o Munchkin Tenders                : RM 16.50");
        System.out.println("o Tabby Celup Tepung              : RM 15.50");
        System.out.println("o Calico Crispy                   : RM 19.00");
        System.out.println("o British Shorthair w/o Hair      : RM 21.50\n");
        System.out.println("==============================================\n");
        System.out.println("                 Ala Carte\n");
        System.out.println("o Cheese Dip                      : RM 2.50");
        System.out.println("o BBQ Dip                         : RM 2.00\n");
        System.out.println("==============================================");

        Scanner Menu = new Scanner(System.in);
        
        System.out.print("Please choose your main dish (1-4): ");
        int mainDishChoice = Menu.nextInt();
        double totalAmount = 0;

        if (mainDishChoice == 1) {
            totalAmount = 16.50;
        } else if (mainDishChoice == 2) {
            totalAmount = 15.50;
        } else if (mainDishChoice == 3) {
            totalAmount = 19.00;
        } else if (mainDishChoice == 4) {
            totalAmount = 21.50;
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("\nWould you like to add an ala carte item?\n(1. Cheese Dip - RM 2.50, 2. BBQ Dip - RM 2.00, 3. None): ");
        int alaCarteChoice = Menu.nextInt();

        if (alaCarteChoice == 1) {
            totalAmount += 2.50;
        } else if (alaCarteChoice == 2) {
            totalAmount += 2.00;
        }

        System.out.printf("\nTotal Amount: RM %.2f\n", totalAmount);
        Menu.close();
    }
}
