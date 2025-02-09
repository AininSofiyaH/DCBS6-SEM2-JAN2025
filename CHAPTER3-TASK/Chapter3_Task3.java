import java.util.Scanner;

public class Chapter3_Task3 {
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);
        
        System.out.println("Choose a color for discount:\n1.Red (10%)\n2.Blue (20%)\n3.Black (30%)");
        int col = zam.nextInt();
        zam.nextLine();
        
        double dr = 0;
        switch(col){
            case 1: dr = 0.10;break;
            case 2: dr = 0.20;break;
            case 3: dr = 0.30;break;
            default: System.out.print("No discount sadly.");
        }
        
        System.out.print("Item name: ");
        String itname = zam.nextLine();
        
        System.out.print("Price per item: ");
        double price = zam.nextDouble();
        
        System.out.print("Quantity: ");
        int quan = zam.nextInt();
        
        double totp = price * quan;
        double discprice = totp * dr;
        double pad = totp - discprice;
        double dr2 = dr * 100;
                
        System.out.println("\nItem: " + itname);
        System.out.println("Price per item: RM " +price);
        System.out.println("Quantity: " +quan);
        System.out.println("Total:RM " + totp);
        System.out.println("Discount rate: " +dr2 + "%");
        System.out.println("Price after discount: RM" +pad);
        
        zam.close();
    }
}
