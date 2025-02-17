package numstudent;
import java.util.Scanner;
public class NumStudent {
    public static void main(String[] args) {
        Scanner results = new Scanner(System.in); //nak ambil input dari user
        int numStudents;
        int passCount=0; //kira bilangan student yang lulus
        
        //bilangan pelajar
        System.out.print("Enter the number of Students : ");
        numStudents = results.nextInt();
        
        //loop untuk masukkan markah setiap students
        for(int i=0; i<numStudents; i++){
            System.out.print("Enter mark for Student" +(i+1) + ": ");
            if (results.nextInt()>= 50) passCount++; // markah >= 50, students lulus
            }
        //print bilangan students yang fail and lulus
        System.out.println("Pass : " +passCount+ " Fail : " +(numStudents-passCount));
        
        //check kalau >=50% student lulus
        if (passCount > numStudents / 2) 
            System.out.println("Bonus to Instructor"); //kalau lebih 50% pass
        else
            System.out.println("No bonus to Instructor"); //kalau kurang 50% yang pass
        
        results.close();
    }
    
}
