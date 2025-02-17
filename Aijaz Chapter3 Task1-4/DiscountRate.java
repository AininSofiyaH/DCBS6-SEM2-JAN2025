import java.util.Scanner;

public class DiscountRate{
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
       
        System.out.print("Enter the item: ");
        String itemName = read.nextLine();
        
        System.out.print("Enter the price of the item: RM");
        double pricePerItem = read.nextDouble();
        
        System.out.print("Enter the quantity: ");
        int quantity = read.nextInt();
        
        
        System.out.println("\nSelect discount rate from the following colour code:");
        System.out.println("1. Red- 25%");
        System.out.println("2. Yellow - 50%");
        System.out.println("3. Green - 75%");
        System.out.print("Enter the number that corresponds to your colour code: ");
        
        int colorChoice = read.nextInt();
        
        
        double discountRate = 0;
        
        
        switch (colorChoice) {
            case 1:
                discountRate = 0.25;
                break;
            case 2:
                discountRate = 0.50; 
                break;
            case 3:
                discountRate = 0.75; 
                break;
        }
        
       
        double totalPrice = pricePerItem * quantity;
        
        
        double discountAmount = totalPrice * discountRate;
        
        
        double priceAfterDiscount = totalPrice - discountAmount;
        
        
       System.out.println("\n--- Receipt ---");
        System.out.println("Item: " + itemName);
        System.out.println("Price per Item: RM" + pricePerItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + totalPrice);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price After Discount: RM" + priceAfterDiscount);
        
        
        read.close();
    }
}