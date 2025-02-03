import java.util.Scanner;

public class DiscountProgram {

    public static double applyDiscount(double price, double discountRate) {
        return price - (price * discountRate / 100);
    }

    public static void showMenu() {
        System.out.println("\nDiscount Menu:");
        System.out.println("1. Red - 5% Discount");
        System.out.println("2. Green - 10% Discount");
        System.out.println("3. Blue - 15% Discount");
        System.out.println("4. Yellow - 20% Discount");
        System.out.println("5. Exit");
    }

    public static double getDiscountRate(int choice) {
        switch (choice) {
            case 1: return 5;
            case 2: return 10;
            case 3: return 15;
            case 4: return 20;
            case 5: return -1;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Scanner Discount = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the item name: ");
            String itemName = Discount.nextLine();
            
            double pricePerItem = 0;
            int quantity = 0;
            
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter the price per item: $");
                    pricePerItem = Double.parseDouble(Discount.nextLine());
                    
                    System.out.print("Enter the quantity: ");
                    quantity = Integer.parseInt(Discount.nextLine());
                    
                    if (pricePerItem < 0 || quantity < 0) {
                        System.out.println("Price and quantity cannot be negative. Please try again.");
                    } else {
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers for price and quantity.");
                }
            }

            double totalPrice = pricePerItem * quantity;

            showMenu();

            int discountChoice = -1;
            while (discountChoice < 1 || discountChoice > 5) {
                System.out.print("Choose a discount based on the color code (1-5): ");
                try {
                    discountChoice = Integer.parseInt(Discount.nextLine());
                    if (discountChoice < 1 || discountChoice > 5) {
                        System.out.println("Invalid. Choose (1-5)");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid. Choose (1-5).");
                }
            }

            double discountRate = getDiscountRate(discountChoice);
            
            if (discountRate == -1) {
                System.out.println("==========EXITING==========THANK YOU FOR USING==========");
                break;
            }

            double priceAfterDiscount = applyDiscount(totalPrice, discountRate);

            System.out.println("\nItem Details:");
            System.out.println("Item Name: " + itemName);
            System.out.println(String.format("Price per item: $%.2f", pricePerItem));
            System.out.println("Quantity: " + quantity);
            System.out.println(String.format("Total Price: $%.2f", totalPrice));
            System.out.println("Discount Rate: " + discountRate + "%");
            System.out.println(String.format("Price after Discount: $%.2f", priceAfterDiscount));
            
            System.out.print("\nRestart? (y/n): ");
            String response = Discount.nextLine().toLowerCase();
            if (response.equals("n")) {
                System.out.println("==========EXITING==========THANK YOU FOR USING==========");
                break;
            }
        }
    }
}
