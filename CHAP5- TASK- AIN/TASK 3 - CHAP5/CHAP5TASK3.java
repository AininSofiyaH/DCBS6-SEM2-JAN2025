package chap5.task3;
import java.util.Scanner;
public class CHAP5TASK3 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        int mark, gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0; 
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            mark = grade.nextInt();
            
            if (mark >= 75) gradeA++; // Grade A
            else if (mark >= 65) gradeB++; // Grade B
            else if (mark >= 55) gradeC++; // Grade C
            else if (mark >= 44) gradeD++; // Grade D
            else gradeE++; // Grade E
        }
        
        // call the display method
        String output = display(gradeA, gradeB, gradeC, gradeD, gradeE);
        System.out.println(output);
        
        grade.close();
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
   
    

