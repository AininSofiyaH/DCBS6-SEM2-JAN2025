package chap5.task5;
import java.util.Scanner;
        
    //student class for save and calculate average marks
    class Student {
        public double mark1, mark2, mark3; //3 marks for every student
        
        //constructor for accept the 3 marks
        public Student(double m1,double m2,double m3) {
            this.mark1 = m1;
            this.mark2 = m2;
            this.mark3 = m3;
        }
        //method to calculate average
    public static double calculateAverage(double m1, double m2, double m3){
        return (m1 + m2 + m3)/ 3; }
        
    }
public class CHAP5TASK5 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        double m1_S1, m2_S1, m3_S1, m1_S2, m2_S2, m3_S2, m1_S3, m2_S3, m3_S3;
        double avg1, avg2, avg3;
        
        System.out.println("Enter 3 marks for Student1: "); //ask user to enter 3 marks for student1
        m1_S1 = task.nextDouble(); //read the first mark 
        m2_S1 = task.nextDouble(); //sec mark
        m3_S1 = task.nextDouble(); //third mark
        Student student1 = new Student(m1_S1,m2_S1,m3_S1); //create new object for 3 marks of student1
        avg1 = student1.calculateAverage(m1_S1,m2_S1,m3_S1); //get average mark for student1
        System.out.println("Average Mark Student1: " +avg1);
        
        System.out.println("Enter 3 marks for Student2: "); //ask user to enter 3 marks for student2
        m1_S2 = task.nextDouble(); //read the first mark 
        m2_S2 = task.nextDouble(); //sec mark
        m3_S2 = task.nextDouble(); //third mark
        Student student2 = new Student(m1_S2,m2_S2,m3_S2); //create new object for 3 marks of student2
        avg2 = student2.calculateAverage(m1_S2,m2_S2,m3_S2); //get average mark for student2
        System.out.println("Average Mark Student2: " +avg2);
        
        System.out.println("Enter 3 marks for Student3: "); //ask user to enter 3 marks for student3
        m1_S3 = task.nextDouble(); //read the first mark 
        m2_S3 = task.nextDouble(); //sec mark
        m3_S3 = task.nextDouble(); //third mark
        Student student3 = new Student(m1_S3,m2_S3,m3_S3); //create new object for 3 marks of student3
        avg3 = student3.calculateAverage(m1_S3,m2_S3,m3_S3); //get average mark for student3
        System.out.println("Average Mark Student3: " +avg3);
        
        //calculate and display the highest average
        System.out.println("Highest Average: " +getHighestAverage(avg1, avg2, avg3));
        task.close();
    }
    
     //method to get highest average
    public static double getHighestAverage(double avg1, double avg2, double avg3){
       return Math.max (avg1, Math.max(avg2, avg3));
    }
   
    

}
    

