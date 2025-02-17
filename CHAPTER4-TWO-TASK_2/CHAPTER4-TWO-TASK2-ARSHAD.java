import java.util.Scanner;

public class task2 {//name of the file author "arshad"
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//change scanner name to read
        
        int pass = 0;//initialize the pass and fail variable and set it to 0
        int fail = 0;
        
        System.out.print("Enter number of students: ");//ask for user input
        int totalStudents = read.nextInt();//insert the input inside the variable "totalstudents"
        
        for (int i = 0; i < totalStudents; i++) {//initilize the loop i equal to 0,if i less than "totakstudents" then increment i 
            System.out.print("Enter marks for student " + (i+1) + ": ");//loop until i is equal to number off studets
            int marks = read.nextInt();
            
            if (marks >= 50) {
                pass++;//if marks more than 50 then increment pass by 1
            } else {
                fail++;//if marks less than 50 for that student incremetn fail by 1
            }
        }
        
        System.out.println("Passed: " + pass);//print the number of students who passed
        System.out.println("Failed: " + fail);//print number who failed
        
        double passPercentage = (double) pass / totalStudents * 100;
        if (passPercentage > 50) {//calculate if half of the class is pass
            System.out.println("Bonus to instructor!");
        }
        
        read.close();
    }
}
