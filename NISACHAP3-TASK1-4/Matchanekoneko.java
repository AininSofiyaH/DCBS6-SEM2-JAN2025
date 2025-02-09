package matchanekoneko;
import java.util.Scanner;
public class Matchanekoneko {

    public static void main(String[] args) {
        int beverage;
        float add_on, total_price;
        int option, quantity, price=0;
        Scanner read = new Scanner (System.in);
        
        System.out.println("|    ♡~^~^~^~♡~^~^~^~♡~^~^~^~♡~^~^~^~♡~^~^~^~♡~^~^~♡     |");
        System.out.println("|           Welcome to Neko Neko Matcha!                 |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|               List of Beverages                        |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("|           1. Strawberry Matcha Latte:  RM15            |");
        System.out.println("|           2. Coconut Matcha Latte:     RM13            |");
        System.out.println("|           3. Butterfly Pea Matcha Latte: RM17          |");
        System.out.println("|--------------------------------------------------------|");
        
        System.out.print("Please choose one of the above: ");
        beverage = read.nextInt();
        
        switch (beverage) {
            case 1: 
                price = 15;
                System.out.println("Price = RM15");break;
            case 2: 
                price = 13;
                System.out.println("Price = RM13");break;
            case 3: 
                price = 17;
                System.out.println("Price = RM17");break;
            default: 
                System.out.println("Invalid number.");break;
        }
            
        System.out.print("Quantity: ");
        quantity = read.nextInt();
        read.close();
        
        total_price= price * quantity;
        System.out.println("Total price= RM"+total_price);
       
        
    }
            
        }
        
    

