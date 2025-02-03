import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);
        String ItemName;
        double price, rate = 0, afterprice = 0, total; 
        int quantity, Colour;

        System.out.println("1. Red:        70%");
        System.out.println("2. Blue:       50%");
        System.out.println("3. Yellow:     30%");
        System.out.println("4. Green:      15%");
        System.out.println("|Please choose a colour|");
Colour = shop.nextInt();
shop.nextLine();//neutralize from reading int

 switch (Colour) {
            case 1:
                rate= 0.70;
                break;
            case 2:
                rate = 0.50;
                break;
            case 3:
                rate = 0.30;
                break;
            case 4:
                rate = 0.15;
                break;
            default:
                System.out.println("ERROR!!!");
        }
        System.out.print("Enter Item Name:");
            ItemName = shop.nextLine();
        System.out.print("Enter price: ");
            price = shop.nextDouble();
        System.out.print("Enter quantity: ");
            quantity = shop.nextInt();
    
    total = price * quantity;
    afterprice = total - (total * rate);
    
        System.out.println("\n\nName: " + ItemName);
        System.out.println("Price ea/: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("Discount Rate: " + (rate * 100) + "%");
        System.out.println("Price after Discount: " + afterprice);
        
        shop.close();
    }
}

