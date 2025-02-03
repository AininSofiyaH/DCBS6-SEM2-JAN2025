import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner shopee = new Scanner(System.in);
        int quantity, product;
        double cost = 0;

        System.out.println("|--------Machines--------|");
        System.out.println("1. Laptop - RM5000.00");
        System.out.println("2. Phone - RM3700.69");
        System.out.println("3. Tablet - RM1300.00");
        System.out.println("|-----Select product-----|");
        product = shopee.nextInt();
                
        switch (product) {
            case 1:
                System.out.print("Enter quantity: ");
                quantity = shopee.nextInt();
                cost = quantity * 5000.00;
                System.out.println("Total cost: RM" + cost);
                break;
            case 2:
                System.out.print("Enter quantity: ");
                quantity = shopee.nextInt();
                cost = quantity * 3700.69;
                System.out.println("Total cost: RM" + cost);
                break;
            case 3:
                System.out.print("Enter quantity: ");
                quantity = shopee.nextInt();
                cost = quantity * 1300.00;
                System.out.println("Total cost: RM" + cost);
                break;
        }
        
        System.out.println("\nThank you for purschasing :>");
        System.out.println("Your order will  be shipped within 2 to 5 business days.");
        shopee.close();
    }
}
