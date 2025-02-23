package countEvenOdd;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	    int num, jumlahnombor;
        Scanner baca = new Scanner(System.in);
        
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
        
        System.out.println("Program tamat.");
        baca.close();
    }
}
