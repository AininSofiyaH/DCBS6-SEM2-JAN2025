package testresults;
import java.util.Scanner;
public class Testresults {
    public static void main(String[] args) {
        int result, numstu, pass = 0, fail = 0;
     { Scanner inp = new Scanner(System.in);

  System.out.print("Enter the number of students: ");
    numstu = inp.nextInt(); //scanner utk tahu bilangan student
    
    for (int a = 0; a < numstu; a++){ //selagi tak capai bil. student, dia akan bertambah
        System.out.print("Enter result for student " + (a + 1) + " (1 for pass, 2 for fail): ");
        result = inp.nextInt();
        
        if (result == 1) { 
            pass++;}
            
        else {
            fail++;
        }
       
    }
    
    System.out.println("Number of students passed: " + pass);
    System.out.println("Number of students failed: " + fail);
        
    if (pass > numstu / 2) { //kalau yang pass lebih 50%
        System.out.println("##Bonus to instructor##");
    }
     inp.close();
    
}
}}
