import java.util.Scanner;
public class chp3_task3 {
    public static void main(String[] args) {

    String item;
    int  quantity, code,disc_rate = 0;
    float price, total, fprice = 0;
    Scanner baca = new Scanner(System.in);

    System.out.println("----------------------------");
    System.out.println("% % % Discount Program % % %");
    System.out.println("----------------------------\n");

    System.out.println("Enter your item name: ");
    item = baca.nextLine();

    System.out.println("Enter your item price: ");
    price = baca.nextFloat();

    System.out.println("Enter your item quantity: ");
    quantity = baca.nextInt();
    total = price * quantity;

    System.out.println("----------------------------");
    System.out.println("$ $ Discount Color Code $ $");
    System.out.println("----------------------------");
    System.out.println("1. Red = 15% off");
    System.out.println("2. Orange = 25% off)");
    System.out.println("3. Yellow = 50% off)");
    System.out.println("4. Green = 90% off)");
    System.out.println("Choose your item discount color code for your item (1-4): ");
    code = baca.nextInt();

    switch (code){
        case 1 :
            disc_rate = 15;
            fprice = total*85/100; break;

        case 2 :
            disc_rate = 25;
            fprice = total*75/100; break;

        case 3 :
            disc_rate = 50;
            fprice = total*50/100; break;

        case 4 :
            disc_rate = 90;
            fprice = total*10/100; break;

        default :
            fprice = total; break;
    }

    System.out.println("\n----------------------------");
    System.out.println("|          Result          |");
    System.out.println("----------------------------");
    System.out.println("Item name: " +item);
    System.out.print("Price per item: RM");
    System.out.printf("%.2f", (float) price);
    System.out.println("\nQuantity: " +quantity);
    System.out.print("Total price: RM");
    System.out.printf("%.2f", (float) total);
    System.out.println("\nDiscount rate: " +disc_rate +"%");
    System.out.print("Price after discount: RM" );
    System.out.printf("%.2f", (float) fprice);

    }
}