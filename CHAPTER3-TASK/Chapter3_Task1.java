import java.util.Scanner;

public class Chapter3_Task1{
    public static void main(String[] args) {
        Scanner alt = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = alt.nextInt();
        
        if (marks >= 80) {
            System.out.println("Congrats on getting A !!!!!!");
        } else if (marks >= 70) {
            System.out.println("You got B.");
        } else if (marks >= 60) {
            System.out.println("You got C..");
        } else if (marks >= 50) {
            System.out.println("You got D...");
        } else if (marks >= 40) {
            System.out.println("Congrats on barely passed!");
        } else {
            System.out.println("You straight up failed.");
        }
               
        alt.close();
    }
}
