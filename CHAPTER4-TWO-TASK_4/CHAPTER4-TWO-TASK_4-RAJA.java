package countEvenOdd;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		    int num, jumlahnombor;
		    char pilihan;
	        Scanner baca = new Scanner(System.in);
	        
	        
	        do {
	            int evenCount = 0, oddCount = 0;
	            
	            System.out.print("Masukkan bilangan nombor dalam jujukan: ");
	            jumlahnombor = baca.nextInt();
	            
	            System.out.println("Masukkan " + jumlahnombor + " nombor integer:");
	            for (int i = 0; i < jumlahnombor; i++) {
	                 num = baca.nextInt();
	                if (num % 2 == 0) {
	                    evenCount++;
	                } else {
	                    oddCount++;
	                }
	            }
	            
	            System.out.println("Bilangan nombor genap: " + evenCount);
	            System.out.println("Bilangan nombor ganjil: " + oddCount);
	            
	            System.out.print("Adakah anda ingin mencuba lagi? (y/n): ");
	            baca.nextLine(); // makan line baru
	            pilihan = baca.nextLine().charAt(0);
	        } while (pilihan == 'y' || pilihan == 'Y'); // boleh guna huruf kecil atau besar 
	        
	        System.out.println("Program tamat.");
	        baca.close();
	    }
	}


