import java.util.Scanner;
public class chp3_task4 {
    public static void main(String[] args) {

        String item = "";
        int menu, fchoice, dchoice, quantity;
        float price = 0, total;
        Scanner baca = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("^        Pharaoh C A F E       ^");
        System.out.println("---------------------------------");
        System.out.println("*this cafe is a property located in Egypt\n");
        System.out.println("Welcome to Pharaoh CAFE ^-^");
        System.out.println("--------------M E N U-------------");
        System.out.println("1. FOOD:");
        System.out.println("2. DRINKS:\n");
        System.out.println("Please select your choice: ");
        menu = baca.nextInt();

        if (menu == 1) {
            System.out.println(" FOOD:");
            System.out.println("    1. Lunchly..................RM 45.99");
            System.out.println("    2. Uncle Roger Fried Rice...RM 16.00");
            System.out.println("    3. Pitzah...................RM 23.57");
            System.out.println("    4. Mr. Beast Burger.........RM  5.00\n");
            System.out.println("Please select your choice: ");
            fchoice = baca.nextInt();

            switch (fchoice) {
                case 1 :
                    item = "Lunchly";
                    price = 45.99f; break;

                case 2 :
                    item = "Uncle Roger Fried Rice";
                    price = 16.00f; break;

                case 3 :
                    item = "Pitzah";
                    price = 23.57f; break;

                case 4 :
                    item = "Mr. Beast Burger";
                    price = 5.00f; break;

                default :
                    System.out.println("Thank you. Please Come Again >///<"); break;

            }
        }

        else if (menu == 2) {
            System.out.println(" DRINKS:");
            System.out.println("    1. Grimace Shake............RM  9.99");
            System.out.println("    2. PRIME....................RM 99.99");
            System.out.println("Please select your choice: ");
            dchoice = baca.nextInt();

            switch (dchoice) {
                case 1 :
                    item = "Grimace Shake";
                    price = 9.99f; break;

                case 2 :
                    item = "Mr. Beast Burger";
                    price = 99.99f; break;

                default :
                    System.out.println("Thank you. Please Come Again >///<"); break;
            }
        }
        else {
                System.out.println("Thank you. Please Come Again >///<");
            }


        System.out.println("Enter your item quantity: ");
        quantity = baca.nextInt();
        total = price * quantity;

        System.out.println("----------------------------");
        System.out.println("<       Order Details       >");
        System.out.println("----------------------------");

        System.out.println("Item name: " +item);
        System.out.print("Price per item: RM");
        System.out.printf("%.2f", price);
        System.out.println("\nQuantity: " +quantity);
        System.out.print("Total price: RM");
        System.out.printf("%.2f", total);
        System.out.println("\nTHANK YOU FOR YOUR ORDER ^.^");
        System.out.println("Please be patient.\nYour order will come soon...");
    }
}