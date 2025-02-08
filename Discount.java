package discount;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        String itemname;
        int quantity, discount;
        float price, totalprice, priceafterdis, discountrate=0, rate=0;
        Scanner userinput = new Scanner(System.in);
        
        System.out.println("Enter the item name : ");
        itemname = userinput.nextLine();
        
        System.out.println("Enter price per item : ");
        price = userinput.nextFloat();
        
        System.out.println("Enter the quantity of item : ");
        quantity = userinput.nextInt();
        
        System.out.println("Discount color code menu\n 1.Purple(40%)\n 2.Black(30%)\n 3.White(70%)\n Choose : ");
        discount = userinput.nextInt();
        userinput.close();
        
        switch (discount){
            case 1: discountrate = (float) 0.4; break;
            case 2: discountrate = (float) 0.3; break;
            case 3: discountrate = (float) 0.7; break;
            default: System.out.println("ERROR"); break;}
        
        rate = 1 - discountrate;
        totalprice = price*quantity;
        priceafterdis = totalprice*rate;
        
        System.out.println("Item name : " +itemname);
        System.out.println("Price per item: " +price);
        System.out.println("Quantity : " +quantity);
        System.out.println("Total price : " +totalprice);
        System.out.println("Discount rate : " +discountrate);
        System.out.println("Price after discount : " +priceafterdis);
        
    }
    
}
