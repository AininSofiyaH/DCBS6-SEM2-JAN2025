/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discprogram2;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class DiscProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Select a discount rate based on color code:");
        System.out.println("1. Red - 5% discount");
        System.out.println("2. Blue - 10% discount");
        System.out.println("3. Purple - 30% discount");
        System.out.println("4. Pink - 50% discount");
        System.out.print("Pick 1-4 : ");
        
        int discountChoice = read.nextInt(); 
        
        read.nextLine();  
        System.out.print("Enter the item name: ");
        String itemName = read.nextLine();
        
        System.out.print("Enter the price per item: ");
        double pricePerItem = read.nextDouble();
        
        System.out.print("Enter the quantity: ");
        int quantity = read.nextInt();
        
        double totalPrice = pricePerItem * quantity;
        
        double discountRate = 0;
        
        switch (discountChoice) {
            case 1:
                discountRate = 0.05; 
                break;
            case 2:
                discountRate = 0.10;
                break;
            case 3:
                discountRate = 0.30; 
                break;
            case 4:
                discountRate = 0.50; 
                break;
            default:
                System.out.println("No discount");
                break;
        }

        double finalPrice = totalPrice - (totalPrice * discountRate);

        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: RM" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price before discount: RM" + totalPrice);
        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Price after discount: RM" + finalPrice);

        read.close();


    }
    
}
