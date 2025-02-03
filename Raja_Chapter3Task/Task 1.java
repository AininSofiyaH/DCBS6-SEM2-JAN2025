import java.util.Scanner;
public class Demo {
	
	public static void main(String[] args) {
		int markah;
        Scanner read = new Scanner(System.in); 
		
		System.out.print("Sila Masukkan Markah Anda : ");
		markah = read.nextInt();
		
		if(markah >= 80) {
		    System.out.print("A");
		
		} else if(markah >= 60) {
		    System.out.print("B");
		
		} else if(markah >= 50) {
		    System.out.print("C");
		
		} else if(markah >= 40) {
			System.out.print("D");
			
		} else {
			System.out.print("F");
		
		}
	
		System.exit(0);

		

	}

}