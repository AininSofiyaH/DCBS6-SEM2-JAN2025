import java.util.Scanner;

public class NewClass9 {
    public static void main(String[] args) {
        Scanner kaiden = new Scanner(System.in);

        System.out.print("masukan nama anda: ");
        String nama = kaiden.nextLine();
        
        System.out.print("masukan umur anda: ");
        int umur = kaiden.nextInt();
        kaiden.nextLine();  
        
        System.out.print("masukan hobi anda: ");
        String hobi = kaiden.nextLine();
        
        System.out.print("masukan makanan kegemaran anda: ");
        String makanankegemaran = kaiden.nextLine();
        
        System.out.println("\ninformasi pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Hobi: " + hobi);
        System.out.println("makanan kegemaran: " + makanankegemaran);
        
        kaiden.close();
    }
}
