import java.util.Scanner;
    public class finalmark {
        public static void main(String[] args){
        Scanner test = new Scanner(System.in);
        
        System.out.print("Enter your mark: ");
        int mark = test.nextInt();
        
        String grade;
        if (mark >= 90) {
            grade = "A+";
        } else if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else if (mark >= 40) {
            grade = "E";
        }else {
            grade = "F";
        }
        
        System.out.println("Your grade is: " +grade);
        
        test.close();
    }
}
