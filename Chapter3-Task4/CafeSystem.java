package cafesystem;
import java.util.Scanner;
        
public class CafeSystem {

    public static void main(String[] args) {
        int choice;
        System.out.println("***********************************");
        System.out.println("[      Welcome to Vibe Cafe       ]");
        System.out.println("-----------------------------------");
        System.out.println("[       List of beverages         ]");
        System.out.println("[ 1. Americano : RM6              ]");
        System.out.println("[ 2. Chocolate Frappe : RM9       ]");
        System.out.println("[ 3. Mocha : RM11                 ]");
        System.out.println("[ 4. Capucinno : RM12             ]");
        System.out.println("-----------------------------------");
        
        Scanner userchoice = new Scanner(System.in);
        System.out.println("Which item do you want to buy? ");
        choice = userchoice.nextInt(); 
        
        userchoice.close();
        
        switch (choice) { 
			case 1: System.out.println("Item purchased: Americano RM6"); break; 
			case 2: System.out.println("Item purchased: Chocolate Frappe RM9"); break; 
			case 3: System.out.println("Item purchased: Mocha RM11"); break; 
                        case 4: System.out.println("Item purchased: Capucinno RM12"); break;
			default: System.out.println("ERROR");break; } 
    }
    
}
