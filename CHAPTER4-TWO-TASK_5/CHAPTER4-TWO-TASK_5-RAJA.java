import java.util.Scanner;

public class Main {
    static Scanner baca = new Scanner(System.in); // Scanner diletakkan di atas

    public static void main(String[] args) {
        int pilihanmenu;
        
        do {
        	 System.out.println("\n===============================");
             System.out.println("        Kira-Kira Express       ");
             System.out.println("===============================");
             System.out.println("1️.  Kira Komisen Jualan");
             System.out.println("2️.  Kira Bilangan Genap & Ganjil");
             System.out.println("3️.  Analisis Keputusan Pelajar");
             System.out.println("4️.  Keluar ");
             System.out.println("===============================");
             System.out.print("Pilih fungsi (1-4): ");
             pilihanmenu = baca.nextInt();

            switch (pilihanmenu) {
                case 1:
                    kiraKomisen();
                    break;
                case 2:
                    kiraGenapGanjil();
                    break;
                case 3:
                    kiraLulusGagal();
                    break;
                case 4:
                    System.out.println("Program tamat.");
                    break;
                default:
                    System.out.println("Pilihan tidak sah! Sila masukkan nombor antara 1-4.");
            }
        } while (pilihanmenu != 4);
        
        baca.close();
    }

    
    // Pilihan 1 : Fungsi kira komisen jualan
    public static void kiraKomisen() {
            int pilihan; 
            double jumlahJualan, gaji_basic, komisyen, jumlahPendapatan;
            
            gaji_basic = 600.0;
            
            do {
                System.out.print("Masukkan jumlah jualan untuk minggu ini (dalam RM): ");
                jumlahJualan = baca.nextDouble();
                
                komisyen = jumlahJualan * 0.05;
                jumlahPendapatan = gaji_basic + komisyen;

                System.out.printf("Jumlah pendapatan untuk minggu ini: RM%.2f%n", jumlahPendapatan);
                
                System.out.print("Tekan 1 untuk teruskan atau 0 untuk kembali ke menu utama: ");
                pilihan = baca.nextInt();
                
            } while (pilihan == 1);
        }


    
    // Pilihan 2 : Fungsi kira genap & ganjil
    public static void kiraGenapGanjil() {
    	 int num, jumlahnombor;
         char pilihan;  

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
             baca.nextLine(); // Makan newline selepas nextInt()
             pilihan = baca.nextLine().charAt(0);

         } while (pilihan == 'y' || pilihan == 'Y');
         
    }

    
    // Pilihan 3: Fungsi Kira Lulus & Gagal
    public static void kiraLulusGagal() {
        int lulus = 0, tidak_lulus = 0, jumlahpelajar, markah;
        String pilihan;

        do {
            System.out.print("Sila masukkan jumlah pelajar: ");
            jumlahpelajar = baca.nextInt();

            for (int i = 1; i <= jumlahpelajar; i++) {
                System.out.print("Masukkan markah pelajar " + i + " (1 = Lulus, 2 = Gagal): ");
                markah = baca.nextInt();

                if (markah == 1) {
                    lulus++;
                } else if (markah == 2) {
                    tidak_lulus++;
                } else {
                    System.out.println(" Salah! Masukkan 1 (Lulus) atau 2 (Gagal) sahaja.");
                    i--;
                }
            }

            System.out.println("\nJumlah Pelajar: " + jumlahpelajar);
            System.out.println("Lulus: " + lulus);
            System.out.println("Tidak Lulus: " + tidak_lulus);

            if (lulus > jumlahpelajar / 2) {
                System.out.println("Bonus to instructor! YEAYYYY!");
            }

            do {
                System.out.print("Adakah anda ingin mencuba lagi? (ya/tidak): ");
                baca.nextLine(); // Makan newline
                pilihan = baca.nextLine();

                if (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak")) {
                    System.out.println("Sila masukkan 'ya' atau 'tidak' sahaja!");
                }

            } while (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak"));

        } while (pilihan.equalsIgnoreCase("ya"));
    }
}
