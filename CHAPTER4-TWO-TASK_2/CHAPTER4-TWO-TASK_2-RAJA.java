import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int lulus = 0, tidak_lulus = 0, jumlahpelajar = 0, markah;
		Scanner baca = new Scanner(System.in); 
		
		System.out.print("Sila Masukkan Jumlah Pelajar : ");
		jumlahpelajar = baca.nextInt();
		
		for (int i = 1; i <= jumlahpelajar; i++) {
            System.out.print("Masukkan Markah Pelajar " + i + " (1 = Lulus, 2 = Gagal): ");
             markah = baca.nextInt();
		    
          //Jika lulus
             if(markah == 1) {
                 lulus++;
             } 
             //Jika gagal
             else if(markah == 2) {
                 tidak_lulus++;
             } 
             //Jika input tak valid
             else {
                 System.out.println(" Salah tu! Masukkan 1 (Lulus) atau 2 (Gagal) sahaja.");
                 i--; 
             }
         }
		    
		
		   System.out.println("\nJumlah Pelajar: " + jumlahpelajar);
	        System.out.println("Lulus: " + lulus);
	        System.out.println("Tidak Lulus: " + tidak_lulus);

	        // Check kalau lebih 50% pelajar yang lulus
	        if (lulus > jumlahpelajar / 2) {
	            System.out.println(" Bonus to instructor! YEAYYY!");
	        }
	        
		baca.close();

		
	}
		
	}


