
public class Main {
	public static void main(String[] args) {
		
	int sumeven = 0;
	System.out.println("Nombor Genap :");
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) { 
            System.out.println(i + " ");
            sumeven += i;
        }
    }
    System.out.println("\nHasil Tambah Nombor Genap Ialah : " + sumeven);
    
    int sumodd = 0;
    System.out.println("\nNombor Ganjil :");
    for (int i =1; i <= 10; i++) {
    	if (i % 2 != 0) {
    		System.out.println(i + " ");
    		sumodd += i;
    	}
    }
    System.out.println("\nHasil Tambah Nombor Ganjil Ialah : " + sumodd);
		
		
		
	}	
		
}
