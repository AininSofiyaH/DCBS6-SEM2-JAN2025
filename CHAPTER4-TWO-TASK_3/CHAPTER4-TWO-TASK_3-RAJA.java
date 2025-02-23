import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         double gaji_basic = 600.0;
         double kadar_komisyen = 0.05;
         double jumlahjualan, komisyen, jumlahpendapatan;
         char pilihan;
        Scanner baca = new Scanner(System.in);
        
        do {
            System.out.print("Masukkan jumlah jualan untuk minggu ini (dalam RM): ");
            jumlahjualan = baca.nextDouble();
            
            komisyen = jumlahjualan * kadar_komisyen; 
            jumlahpendapatan = gaji_basic + komisyen;
            
            System.out.printf("Jumlah pendapatan untuk minggu ini: RM%.2f%n", jumlahpendapatan);
            
            System.out.print("Adakah anda ingin memasukkan jumlah jualan lain? (y/n): ");
            baca.nextLine(); // Ambil baris kosong untuk mengelakkan masalah
            pilihan = baca.nextLine().charAt(0);
        } while (pilihan == 'y' || pilihan == 'Y'); // boleh guna huruf kecil atau besar

        System.out.println("Program tamat.");
        baca.close();
    }
}
