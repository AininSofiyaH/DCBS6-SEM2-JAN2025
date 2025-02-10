
public class Main {
	public static void main(String[] args) {
		 System.out.println("----------------------");
        System.out.println("Nombor\tKuasa Dua (n²)");
        System.out.println("----------------------");
        int tambah = 0; 
        for (int n = 1; n <= 10; n++) {
            int square = n * n; 
            System.out.println(n + "\t" + square);
            tambah += square; 
        }

        System.out.println("\nHasil Tambah Kuasa Dua Semua Nombor: " + tambah);
    }
}