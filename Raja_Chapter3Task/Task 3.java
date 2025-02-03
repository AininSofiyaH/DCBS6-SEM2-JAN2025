package Chapt3Task3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
					

		        String itemname;
		        double priceperitem, discountrate = 0, priceafterdiscount, totalprice, discountamount;
		        int quantity, colorcode;

		        Scanner read = new Scanner(System.in);

		        System.out.print("Sila Masukkan Nama Barang Anda : ");
		        itemname = read.nextLine();

		        System.out.print("Sila Masukkan Harga Barang Anda : RM ");
		        priceperitem = read.nextDouble();

		        System.out.print("Sila Masukkan Kuantiti Barang Anda : ");
		        quantity = read.nextInt();

		        // Display discount options
		        System.out.println("\nPilihan Warna dan Diskaun");
		        System.out.println("1. Biru (50%)");
		        System.out.println("2. Merah (75%)");
		        System.out.println("3. Pink (45%)");

		        System.out.print("Sila Masukkan Warna Kadar Diskaun Anda (1-3) : ");
		        colorcode = read.nextInt();

		       
		        switch (colorcode) {
		            case 1:
		                discountrate = 0.5;
		                break;
		            case 2:
		                discountrate = 0.75;
		                break;
		            case 3:
		                discountrate = 0.45;
		                break;
		            
		        }

		        // calculate the price and discount
		        totalprice = priceperitem * quantity;
		        discountamount = totalprice * discountrate;
		        priceafterdiscount = totalprice - discountamount;

		        
		        System.out.println("\nResit Pembelian:");
		        System.out.println("Nama Barang Anda : " + itemname);
		        System.out.println("Harga per Item : RM " + priceperitem);
		        System.out.println("Kuantiti Barang Anda : " + quantity);
		        System.out.println("Jumlah Harga Barang Anda : RM " + totalprice);
		        System.out.println("Kadar Diskaun : " + (discountrate * 100) + "%");
		        System.out.println("Jumlah Harga Barang Anda Selepas Diskaun : RM " + priceafterdiscount);

		        read.close(); 
		    }
		}
