import java.util.Scanner;
//MUHAIMIN BIN MAHADI  DCBS6
class PurchasingSystem {
	public static void main(String[] args) {
		Scanner meen = new Scanner(System.in);

                System.out.println("=============================================");
                System.out.println("=  Welcome to The Simple Purchasing System  ="); //Intro
		System.out.println("=============================================");
                System.out.print("Enter Your Name: ");  //Letak Nama Pembeli
		String customerName = meen.nextLine();

		System.out.print("Enter Item Name: ");
		String itemName = meen.nextLine();

		System.out.print("Enter Price per Item: ");
		double pricePerItem = meen.nextDouble();

		System.out.print("Enter Quantity: ");
		int quantity = meen.nextInt();

		double totalPrice = pricePerItem * quantity;

		System.out.println("\nChoose Discount Rate from the Color Code:");
		System.out.println("1. Red - 30% Discount");
		System.out.println("2. Blue - 20% Discount");
		System.out.println("3. Purple - 10% Discount");
		System.out.println("4. No Discount - 0% Discount");
		System.out.print("Enter your choice (1-4): ");
		int choice = meen.nextInt();
                
		double discountRate = 0.00;
		String colorCode = "No Discount";

		switch (choice) {
			case 1:
				discountRate = 0.30;
				colorCode = "Red";
				break;
			case 2:
				discountRate = 0.20;
				colorCode = "Blue";
				break;
			case 3:
				discountRate = 0.10;
				colorCode = "Purple";
				break;
			case 4:
				colorCode = "No Discount";
				break;
			default:
				System.out.println("Invalid choice . No discount applied.");
		}

		double discountAmount = totalPrice * discountRate;
		double priceAfterDiscount = totalPrice - discountAmount;
                
                System.out.println("\n------------- Receipt -------------");
                System.out.printf("%-20s : %s\n", "Customer Name", customerName);  //Papar nama pembeli
		System.out.printf("%-20s : %s\n", "Item Name", itemName);
		System.out.printf("%-20s : $%.2f\n", "Price per Item", pricePerItem);
		System.out.printf("%-20s : %d\n", "Quantity", quantity);
		System.out.printf("%-20s : $%.2f\n", "Total Price", totalPrice);
		System.out.printf("%-20s : %s (%.0f%%)\n", "Discount Rate", colorCode, discountRate * 100);
		System.out.printf("%-20s : $%.2f\n", "Price After Discount", priceAfterDiscount);
                System.out.println("\n------------ Thank You ------------");
		meen.close();
	}
}
