package salescomission;
import java.util.Scanner;
public class SalesComission {
    public static void main(String[] args) {
        int solditems;
        float Sales, commission, total, salary = 500; //salary base is rm500
          Scanner salesinput = new Scanner(System.in); // scanner
          
        System.out.print("Enter the number of sold items: "); 
        solditems = salesinput.nextInt(); //for user to input number of sold items
        
        System.out.print("Enter the gross sales amount for the week:RM ");
        Sales = salesinput.nextInt();
       
    commission = (float)(0.05 * Sales); //comission is 5% of gross sales
    total = salary + commission; // jumlah salary + commision

        //to display everything
    System.out.println("\nNumber of sold items: " + solditems);
    System.out.println("Salary = RM" + salary);
    System.out.println("Commission amount: 5% x " + Sales + " = RM" + commission);
    System.out.println("\nEarnings for the week: RM" + total);
    
    salesinput.close(); //tutup scanner
    }
    
}
