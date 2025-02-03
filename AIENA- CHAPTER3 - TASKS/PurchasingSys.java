/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purchasingsys;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class PurchasingSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Display available items
        System.out.println("========>^._.^<========HELLO========>^._.^<========");
        System.out.println("Inventories");
        System.out.println("1. Book - RM25");    
        System.out.println("2. Washi tape - RM10");        
        System.out.println("3. Wrapper - RM5");        

        
        // Get user selection
        System.out.print("Enter item number to purchase: ");
        int itemNumber = read.nextInt();
        
        // Process selection
        String itemName = "";
        double price = 0;
        
        if (itemNumber == 1) {
            itemName = "Book";
            price = 25;
        } else if (itemNumber == 2) {
            itemName = "Washi Tape";
            price = 10;
        } else if (itemNumber == 3) {
            itemName = "Wrapper";
            price = 5;
        } else {
            System.out.println("Invalid");
            read.close();
            return;
        }
        
        // Get quantity
        System.out.print("Enter the quantity: ");
        int quantity = read.nextInt();
        
        if (quantity <= 0) {
            System.out.println("Invalid");
            read.close();
            return;
        }
        
        // Calculate total
        double totalPrice = price * quantity;
        
        // Display order summary
        System.out.println("==========Purchase Summary==========");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        
        // Apply discount if applicable
        if (totalPrice > 80) {
            double discount = totalPrice * 0.1;
            totalPrice -= discount;
            System.out.println("You received a 10% discount!");
            System.out.println("Discounted Price: RM" + totalPrice);
        }
        
        System.out.println("Thankyou for your patronage!!");
        System.out.println("");

        read.close();
    }
}
