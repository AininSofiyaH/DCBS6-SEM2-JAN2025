package discprog;
import java.util.Scanner;
public class Discprog {

    public static void main(String[] args) {
        String Item_name;
        float price, discountrate=0,rate=0, price_after_discount, total_price;
        int quantity, discount;
        
        Scanner read = new Scanner (System.in);
        
        System.out.print("Please input the item name: ");
        Item_name = read.nextLine();
        
        System.out.print("Please input the price: ");
        price = read.nextFloat();
        
        System.out.print("Quantity: ");
        quantity = read.nextInt();
        
        System.out.println("<<<<<<<<COLOUR CODE OF DISCOUNT>>>>>>>>     ");
        System.out.println("             1.Pink : 25%");
        System.out.println("             2.Royal Blue : 50%");
        System.out.println("             3.Lavender : 75%");
        System.out.print("Please choose one of the above: ");
        discount = read.nextInt();
        read.close();
        
        switch (discount){
            case 1: discountrate=(float) 0.25;break;
            case 2: discountrate=(float) 0.5;break;
            case 3: discountrate=(float) 0.75;break;
            default: System.out.println("Invalid number.");break;
        }
        rate = 1 -discountrate;
        total_price = price * quantity;
        price_after_discount = total_price * rate;
        
        System.out.println(" Item name: " +Item_name);
        System.out.println("Price per item: RM " +price);
        System.out.println("Quantity: " +quantity);
        System.out.println("Total price: RM " +total_price);
        System.out.println("Discount rate: RM " +discountrate);
        System.out.println("Price after discount: RM " +price_after_discount);
       
        
    }
    
}
