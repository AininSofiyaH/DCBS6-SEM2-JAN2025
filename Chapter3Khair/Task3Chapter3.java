/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classspg;

import java.util.Scanner;


/**
 *
 * @author a_kha
 */
public class Task3Chapter3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean addAnother = false;
        
        do {
            System.out.println("⁙Discount Color Codes⁙:");
            System.out.println("⟬Red⟭ - 10% Off");
            System.out.println("⟬Blue⟭ - 20% Off");
            System.out.println("⟬Green⟭ - 35% Off");
            System.out.println("⟬Yellow⟭ - 50% Off");
            System.out.println("⟬Purple⟭ - 75% Off");
            System.out.println("⁂Black⁂ - 100% Off");
            
            System.out.println("⌈Available Items⌉:");
            System.out.println("|1. Shoes - RM 70|");
            System.out.println("|2. Shirt - RM 50|");
            System.out.println("|3. Pants - RM 45|");
            System.out.println("|4. Watch - RM 80|");
            System.out.println("|5. Jacket - RM 50|");
            System.out.println("|6. Socks - RM 20|");
            System.out.println("⌊7. Hat - RM 35⌋");
            
            System.out.print("Enter the item number: ");
            int itemChoice = read.nextInt();
            
            String itemName = "";
            double pricePerItem = 0.0;
            
            switch (itemChoice) {
                case 1:
                    itemName = "Shoes";
                    pricePerItem = 70;
                    break;
                case 2:
                    itemName = "Shirt";
                    pricePerItem = 50;
                    break;
                case 3:
                    itemName = "Pants";
                    pricePerItem = 45;
                    break;
                case 4:
                    itemName = "Watch";
                    pricePerItem = 80;
                    break;
                case 5:
                    itemName = "Jacket";
                    pricePerItem = 50;
                    break;
                case 6:
                    itemName = "Socks";
                    pricePerItem = 20;
                    break;
                case 7:
                    itemName = "Hat";
                    pricePerItem = 35;
                    break;
                default:
                    System.out.println("Invalid selection. No item chosen.");
                    continue;
            }
            
            System.out.print("Enter quantity: ");
            int quantity = read.nextInt();
            
            read.nextLine(); 
            
            System.out.print("Enter discount color (Red/Blue/Green/Yellow/Purple/Black)\n *Use Numbers to determine the colors!: ");
            String color = read.nextLine();
            
            double discountRate = 0.0;
            switch (color) {
                case "1":
                    discountRate = 0.10;
                    break;
                case "2":
                    discountRate = 0.20;
                    break;
                case "3":
                    discountRate = 0.35;
                    break;
                case "4":
                    discountRate = 0.50;
                    break;
                case "5":
                    discountRate = 0.75;
                    break;
                case "6":
                    discountRate = 1.00;
                    break;
                default:
                    System.out.println("Invalid/No color code. No discount applied.");
            }
            
            double totalPrice = pricePerItem * quantity;
            double discountAmount = totalPrice * discountRate;
            double finalPrice = totalPrice - discountAmount;
            
            System.out.println("\n [=|Your Purchase|=]:");
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Item: RM" + pricePerItem);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price: RM" + totalPrice);
            System.out.println("Discount Rate: " + (discountRate * 100) + "%");
            System.out.println("Price after Discount: RM" + finalPrice);
            
            System.out.print("Do you want to add another item? (yes/no): ");
            String response = read.nextLine().trim().toLowerCase();
            addAnother = response.equals("yes");
        } while (addAnother);
        
        read.close();
    }
}


