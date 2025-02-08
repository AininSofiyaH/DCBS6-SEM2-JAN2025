package purchasingsystem;
import java.util.Scanner;
public class Purchasingsystem {
    public static void main(String[] args) {
    int num_item;
    Scanner purchase = new Scanner (System.in);
    
    System.out.println("---------------------------------------");
    System.out.println("|     Welcome to My CarBoot           |");
    System.out.println("---------------------------------------");
    System.out.println("|          ^List of Items^            |");
    System.out.println("|  1. Dress : RM20.00                 |");
    System.out.println("|  2. Jersey Shawl : RM10.00          |");
    System.out.println("|  3. Cotton Bawal Premium : RM15.00  |");
    
    
    System.out.println("Enter number of item : ");
    num_item = purchase.nextInt();
    purchase.close();
    
    switch (num_item){
        case 1:
            System.out.println("Selected Item : Dress | RM20.00");
            break;
        case 2:
            System.out.println("Selected Item : Jersey Shawl | RM10.00");
            break;
        case 3:
            System.out.println("Selected Item : Cotton Bawal Premium | RM15.00");  
            break;
        
    }
    
    System.out.println("Thank You for buying!");
    }
}
          
    

    

