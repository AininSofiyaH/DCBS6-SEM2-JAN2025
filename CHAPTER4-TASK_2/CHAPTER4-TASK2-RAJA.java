
public class Main {
	public static void main(String[] args) {
	
	System.out.println("*****************");
	System.out.println(" Task for While ");
	System.out.println("*****************");
	int sumwhile = 0;
	int i = 1;
	while (i <= 10){
		sumwhile += i;
		i++;	
	}
	System.out.println("The sum using while is : " +sumwhile);	
	
	
	
	System.out.println("\n*****************");
	System.out.println(" Task for Do While ");
	System.out.println("*****************");
	int sumdowhile = 0;
	 int r = 1;
     do {
         sumdowhile += r;
         r++;
     } while (r <= 10);
     System.out.println("The sum using Do While is : " + sumdowhile);
	
		
		
    System.out.println("\n*****************");
 	System.out.println("  Task for For");
 	System.out.println("*****************");	
 	int sumfor = 0;	
 	for (int u = 1; u <= 10; u++) {
        sumfor += u;
    }
    System.out.println("The sum using For is : " + sumfor);
		
		
	}
}
