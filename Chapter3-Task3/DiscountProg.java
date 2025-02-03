package discountprog;
import java.util.Scanner;
public class DiscountProg {

    public static void main(String[] args) {
    String itemname;
    int quantity, discount;
    float price, totalprice, priceafterdis, discountrate = 0, rate = 0;
        Scanner userinput = new Scanner(System.in); 
        
        System.out.println("Enter Item Name: ");
        itemname = userinput.nextLine(); 
        
        System.out.println("Enter Price: ");
        price = userinput.nextFloat();
        
        System.out.println("Enter Quantity: ");
        quantity = userinput.nextInt();
        
        System.out.println("Discount colour code menu\n 1.Red(10%)\n 2.Blue(20%)\n 3.Pink(30%)\n Choose 1:");
        discount = userinput.nextInt();
        userinput.close();
        
        switch (discount) { 
			case 1: discountrate = (float) 0.1; break; 
			case 2: discountrate = (float) 0.2; break; 
			case 3: discountrate = (float) 0.3; break; 
			default: System.out.println("ERROR");break; } 
        
       rate = 1 - discountrate;
       totalprice = price*quantity;
       priceafterdis = totalprice*rate;
       
       System.out.println("Item name: " + itemname);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
       System.out.println("Total price: " + totalprice);
       System.out.println("Discount rate: " + discountrate);
       System.out.println("Price after discount: " + priceafterdis);
       
    }
    
}
