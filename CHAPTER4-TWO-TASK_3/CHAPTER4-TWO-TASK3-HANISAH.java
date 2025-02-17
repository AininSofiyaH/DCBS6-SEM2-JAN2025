package salescomission;
import java.util.Scanner;
public class Salescomission {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        int itemsold;
        float comission,earnings,sales,salary=600;
        
        System.out.print("Please enter the number of sold items: ");
        itemsold=read.nextInt();
        
        System.out.print("Please enter the gross sales amount for the week: RM");
        sales=read.nextFloat();
        
        comission = 0.05f * sales;//comission is 5% fo the gross sales
        earnings = salary + comission;
        
        System.out.println("Number of sold items: "+itemsold);
        System.out.println("Salesman's earning for the week: RM" +earnings);
        System.out.println("");
        
        read.close();
    }
    
}
