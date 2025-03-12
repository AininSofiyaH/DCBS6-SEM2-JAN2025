package studentsgrades;
import java.util.Scanner;

public class Studentsgrades {
    public static void main(String[] args) {
        Scanner userinp = new Scanner(System.in);
        int mark, gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0; 
        
        for (int i = 0; i < 10; i++) { //loop for 10 students
            System.out.print("Enter mark " + (i + 1) + ": ");
            mark = userinp.nextInt();
            
            if (mark >= 80) gradeA++; // Grade A
            else if (mark >= 60) gradeB++; // Grade B
            else if (mark >= 50) gradeC++; // Grade C
            else if (mark >= 40) gradeD++; // Grade D
            else gradeE++; // Grade E
        }
        
        // call the dislay method
        String output = display(gradeA, gradeB, gradeC, gradeD, gradeE);
        System.out.println(output);
        
        userinp.close();
    }
    
    // display method
    public static String display(int gradeA, int gradeB, int gradeC, int gradeD, int gradeE) {
        return 
               "Grade A: " + gradeA + "\n" +
               "Grade B: " + gradeB + "\n" +
               "Grade C: " + gradeC + "\n" +
               "Grade D: " + gradeD + "\n" +
               "Grade E: " + gradeE;
    }
}
