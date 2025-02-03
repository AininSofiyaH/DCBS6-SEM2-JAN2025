/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Chapter3Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner read = new Scanner(System.in);

        // Display the menu
        System.out.println("----------------------------------");
        System.out.println("|      Welcome to Ajwa Stall     |");
        System.out.println("----------------------------------");
        System.out.println("|       List of Beverages        |");
        System.out.println("| 1. Iced Tea       : RM 6.00    |");
        System.out.println("| 2. Green Tea      : RM 6.00    |");
        System.out.println("| 3. Caffe Latte    : RM 8.00    |");
        System.out.println("----------------------------------");

        // Get user order
        System.out.print("Enter the number of your choice: ");
        int choice = read.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = read.nextInt();

        String beverage = "";
        double price = 0;

        // Selection process
        switch (choice) {
            case 1:
                beverage = "Iced Tea";
                price = 6.00;
                break;
            case 2:
                beverage = "Green Tea";
                price = 6.00;
                break;
            case 3:
                beverage = "Caffe Latte";
                price = 8.00;
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                return;
        }

        // Calculate total
        double totalPrice = price * quantity;

        // Display receipt
        System.out.println("\n----------- Receipt -----------");
        System.out.println("Beverage      : " + beverage);
        System.out.println("Price per unit: RM " + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("------------------------------");
        System.out.println("Total Price   : RM " + totalPrice);
        System.out.println("------------------------------");
        System.out.println("Thank you for your purchase!");

        read.close();
    }
}
    
    

