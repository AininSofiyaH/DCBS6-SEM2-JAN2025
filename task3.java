import java.util.Scanner;

public class NewClass10 {
    public static void main(String[] args) {
        Scanner hanif = new Scanner(System.in);

        System.out.print("masukan tahun kelahiran anda: ");
        int tahunkelahiran = hanif.nextInt();
        
        int tahunterkini = 2025;
        int umur = tahunterkini - tahunkelahiran;
        
        System.out.println("Umur anda tahun ini ialah" + umur );
        
        hanif.close();
    }
}
