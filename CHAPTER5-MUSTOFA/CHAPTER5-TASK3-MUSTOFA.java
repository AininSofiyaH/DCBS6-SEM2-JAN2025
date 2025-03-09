import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;

        Scanner baca = new Scanner(System.in);
        System.out.println("Enter the marks for 10 student each");

        // Getting marks for 10 students
        for (int i = 1; i <= 10; i ++ ) {
            System.out.println("Enter the PAPER 1 marks for student " +i+" :");
            int mark1 = baca.nextInt();
            System.out.println("Enter the PAPER 2 marks for student " +i+" :");
            int mark2 = baca.nextInt();
            double sum = getmark(mark1, mark2);
            System.out.println("Total marks :" +sum+"\n");

            // Grading the marks
            if (sum >= 90) {
                A ++;
            }
            else if (sum >=80) {
                B ++;
            }
            else if (sum >=70) {
                C ++;
            }
            else if (sum >=40) {
                D ++;
            }
            else
                E++;
        }

        // Displaying the results
        System.out.println("RESULT: ");
        System.out.println("Grade A: "+A);
        System.out.println("Grade B: "+B);
        System.out.println("Grade C: "+C);
        System.out.println("Grade D: "+D);
        System.out.println("Grade E: "+E);

    }

    // Method to calculate the total marks of each student
    public static double getmark(int x, int y) {
    int z = x + y;
        return z *0.5;
    }
}