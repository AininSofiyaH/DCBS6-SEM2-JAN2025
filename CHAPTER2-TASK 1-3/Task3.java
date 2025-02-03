import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        
        String name;
        int nama, tahunborn, tahunnow, umur;
        Scanner calculator = new Scanner(System.in);
        
        System.out.println("Namo demo: ");
        name = calculator.nextLine();
        
        System.out.println("Tahun lahir demo: ");
        tahunborn = calculator.nextInt();
        
        System.out.println("Tahun brapo do loni: ");
        tahunnow = calculator.nextInt();
        
        umur = tahunnow - tahunborn;
        
        System.out.println("=============================");
        System.out.println("Nama: "+name+ "                  |");
        System.out.println("Demo umor "+umur+ " doh            |");
                    
        
        
        
        
       
    }
    
}
