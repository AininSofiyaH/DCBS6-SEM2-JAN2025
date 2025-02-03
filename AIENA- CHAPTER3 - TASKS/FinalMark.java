/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalmark;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class FinalMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int mark;
     
    Scanner read = new Scanner(System.in);

        // Reads a single line from the console and stores into name variable
        System.out.print("Enter your mark: ");
        mark = read.nextInt();
        
	    if (mark >= 60)
                System.out.print ('A');
            else if (mark >=50)
                System.out.print ('B');
            else
                System.out.print ('F');
            
            read.close();

    }
    
}
