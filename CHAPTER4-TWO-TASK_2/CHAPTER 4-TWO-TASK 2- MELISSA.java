/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testresult;

/**
 *
 * @author PC STUDENT 04
 */
import java.util.Scanner;
public class TestResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variable
        int stuNum, result;
        int passTest = 0;
        int failedTest = 0;
        Scanner inputTestR = new Scanner (System.in);
        
        //Asking test results from the user
        System.out.print ("Please enter the number of your student : ");
        stuNum = inputTestR.nextInt();
        
        //Getting test result from the student
        for (int i = 1; i <= stuNum; i++){
            System.out.print ("Please enter result for student " + i + " ('1' for pass, '0' for failed.) : ");
            result = inputTestR.nextInt();
         //Counting passed and failed students
         
         if (result == 1){
            passTest++;
         } else if (result == 0){
            failedTest++;
         } else {
            System.out.println ("Invalid input. Please enter 1 for passed or 0 for failed only. ");
            i--;
         }
        }
        
        System.out.println ("Number of students who passed the test : " +passTest);
        System.out.println ("Number of students who failed the test : " +failedTest);
         
        if (passTest > stuNum/2){
            System.out.println ("Bonus to instructor");
        } else {
            System.out.println ("No bonus to instructor");}
        inputTestR.close();
    }
    
}
