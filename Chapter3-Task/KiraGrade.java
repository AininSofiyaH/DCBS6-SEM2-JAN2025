import java.util.Scanner;

public class KiraGrade {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Masukkan nilai akhir: ");
        int mark = read.nextInt();
        String grade;

        if (mark >= 90) {
            grade = "A+";
        } else if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "A-";
        } else if (mark >= 65) {
            grade = "B+";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 55) {
            grade = "C+";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 45) {
            grade = "D";
        } else if (mark >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
        read.close();
    }
}
