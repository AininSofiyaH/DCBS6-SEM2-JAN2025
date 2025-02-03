import java.util.Scanner;

 class IfDemo { 
	public static void main(String[] args) {
	    Scanner arsad = new Scanner(System.in);
            System.out.print("enter your mark: ");
            int mark = arsad.nextInt();
            
	String grade;
        if (mark >= 90) {
            grade = "A+";
        } else if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B"; }  else
        {
            grade = "F (Fail)";
        }

        System.out.println("Your grade is: " + grade);
        
        arsad.close();
	}
}	 
