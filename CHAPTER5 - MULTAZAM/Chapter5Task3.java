import java.util.Scanner;

public class Chapter5Task3 {
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);
        int[] marks = new int[10];
        int A = 0, B = 0, C = 0, D = 0, E = 0;

        
        System.out.println("Enter 10 marks:");
        for (int i = 0; i < 10; i++) {
            marks[i] = zam.nextInt();
            char grade = Grade(marks[i]);

        
            switch (grade) {
                case 'A': A++;
                break;
                case 'B': B++;
                break;
                case 'C': C++;
                break;
                case 'D': D++;
                break;
                case 'E': E++;
                break;
            }
        }
        zam.close();

        
        System.out.println(" 10:");
        System.out.println("Grade A: " + A);
        System.out.println("Grade B: " + B);
        System.out.println("Grade C: " + C);
        System.out.println("Grade D: " + D);
        System.out.println("Grade E: " + E);
    }

    
    public static char Grade(int mark) {
        if (mark >= 70) return 'A';
        else if (mark >= 60) return 'B';
        else if (mark >= 50) return 'C';
        else if (mark >= 40) return 'D';
        else return 'E';
    }
}