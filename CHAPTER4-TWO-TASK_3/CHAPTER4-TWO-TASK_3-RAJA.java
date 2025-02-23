import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         double gaji_basic = 600.0;
         double kadar_komisyen = 0.05;
         double jumlahjualan, komisyen, jumlahpendapatan;
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jualan untuk minggu ini (dalam RM): ");
        jumlahjualan = baca.nextDouble();
        
        komisyen = jumlahjualan * kadar_komisyen; 
        jumlahpendapatan = gaji_basic + komisyen;
        
        System.out.printf("Jumlah pendapatan untuk minggu ini: RM%.2f%n", jumlahpendapatan);
        
        System.out.println("Program tamat.");
        baca.close();
    }
}
