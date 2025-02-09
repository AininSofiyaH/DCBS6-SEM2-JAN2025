package Chapt3Task4;
import java.util.Scanner;
  public class Task_4 {
	  public static void main(String[] args) {
		String itemname;
		double priceperitem = 0, discountrate = 0, totalprice, discountamount, priceafterdiscount, payment,balance;
		int discountcode, quantity, itemchoice = 0;
		
		Scanner read = new Scanner(System.in);
		
		 System.out.println("=============================================== ");
		 System.out.println("        🛒 WELCOME TO KING'S MART 🏪             ");
		 System.out.println("=============================================== ");
		 
	        System.out.println("\nOur Items:");
	        System.out.println("1. WAGYU A5      (1.5kg)      :RM 3000" );
	        System.out.println("2. KING CRAB     (1.6kg)      :RM 399"  );
	        System.out.println("3. BLACKFIN TUNA (22.4kg)     :RM 235"  );
	        System.out.println("4. BLACK ANGUS   (5kg)        :RM 1330");
	        System.out.print("Select an item (1-4): ");
	        itemname = read.nextLine();

	        itemchoice = read.nextInt();
	        
	        switch (itemchoice) {
            case 1:
                itemname = "WAGYU A5 (1.5kg)";
                priceperitem = 3000;
                break;
                
            case 2:
                itemname = "KING CRAB (1.6kg)";
                priceperitem = 399;
                break;
                
            case 3:
                itemname = "BLACKFIN TUNA (22.4kg)";
                priceperitem = 235;
                break;
                
            case 4:
                itemname = "BLACK ANGUS (5kg)";
                priceperitem = 1330;
                break;
	        }
	        
	        System.out.print("Sila Masukkan Kuantiti Barang Anda : ");
	        quantity = read.nextInt();
	       
	        totalprice = priceperitem * quantity;
	        System.out.println("Jumlah Harga Barang Anda : RM " + totalprice);
	        
	        
	        
	        System.out.println("\nPilihan Warna dan Diskaun");
	        System.out.println("1. Biru (10%)");
	        System.out.println("2. Merah (15%)");
	        System.out.println("3. Pink (25%)");
	        System.out.print("Select a colour (1-3): ");
	        discountcode = read.nextInt();

	        switch (discountcode) {
            case 1: discountrate = 0.1; break;   
            case 2: discountrate = 0.15; break;
            case 3: discountrate = 0.25; break;
            }
	        
	        discountamount = totalprice * discountrate;
	        priceafterdiscount = totalprice - discountamount;
	        System.out.println("Jumlah Harga Barang Anda Selepas Diskaun : RM " + priceafterdiscount);
	        
	        
	     // calculate the price and discount
	        totalprice = priceperitem * quantity;
	        discountamount = totalprice * discountrate;
	        priceafterdiscount = totalprice - discountamount;
	        
	        System.out.println("\nSila Masukkan Jumlah Pembayaran Anda");
	        payment = read.nextDouble();
	        
	        if (payment >= priceafterdiscount) {
			 balance = payment - priceafterdiscount;
	            System.out.println("\n Purchase Successful!");
				System.out.println(" Change: RM " + balance);
	        } else {
	            double shortage = priceafterdiscount - payment;
	            System.out.println("\n Insufficient Payment!");
	            System.out.println(" You need RM " + shortage + " more to complete the purchase.");
	        }
	        
	        
	        System.out.println("\n=================================================");
	        System.out.println("              Resit Pembelian                      ");
	        System.out.println("=================================================");
	        System.out.println("Nama Barang Anda : " + itemname);
	        System.out.println("Harga per Item : RM " + priceperitem);
	        System.out.println("Kuantiti Barang Anda : " + quantity);
	        System.out.println("Jumlah Harga Barang Anda : RM " + totalprice);
	        System.out.println("Kadar Diskaun : " + (discountrate * 100) + "%");
	        System.out.println("Jumlah Harga Barang Anda Selepas Diskaun : RM " + priceafterdiscount);

	        read.close(); 
	    }
	}
