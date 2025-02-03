/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;

/**
 *
 * @author lammm
 */
    import java.util.Scanner;

public class PurchasingSys {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("        ══✿══╡°˖✧✿✧˖°╞══✿══"          );
        System.out.println("        ════ ⋆iMac & Co⋆ ════"         );
        System.out.println("Select any items you're interested in");
        System.out.println("1. MacBook - RM3147.00"               );
        System.out.println("2. Iphone 16 series - RM5749.00"      );
        System.out.println("3. Airpod Max - RM2499.00"            );
        System.out.println("4. Ipad series - RM2149"              );
        System.out.println("        ══✿══╡°˖✧✿✧˖°╞══✿══"          );


        System.out.print("Enter the number of your item choice: ");
        int itemChoice = read.nextInt();

        System.out.print("Enter the quantity you want to purchase: ");
        int quantity = read.nextInt();

        double pricePerItem = 0;
        String itemName = "";

        if (itemChoice == 1) {
            itemName = "MacBook";
            pricePerItem = 3147.00;
        } else if (itemChoice == 2) {
            itemName = "Iphone 16 series";
            pricePerItem = 5749.00;
        } else if (itemChoice == 3) {
            itemName = "Airpod Max";
            pricePerItem = 2499.00;
        } else if (itemChoice == 4) {
            itemName = "Ipad series";
            pricePerItem = 2149.00;
        } else {
            System.out.println("sorry, invalid selection. Please select a valid item.");
            return;
        }

        double totalPrice = pricePerItem * quantity;

        double discount = 0;
        if (quantity >= 3) {
            discount = 0.10;
            System.out.println("You got a 10% discount!");
        } else if (quantity >= 2) {
            discount = 0.05; 
            System.out.println("You got a 5% discount!");
        }

        double discountAmount = totalPrice * discount;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("\n.·:*¨¨* Order Summary *¨¨*:·.");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: RM" + pricePerItem);
        System.out.println("Total price before discount: RM" + totalPrice);
        System.out.println("Discount: RM" + discountAmount);
        System.out.println("Total price after discount: RM" + finalPrice);

        read.close();
    }
}

    
}
