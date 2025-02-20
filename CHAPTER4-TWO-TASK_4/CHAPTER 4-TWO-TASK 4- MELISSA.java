/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenoddsequence;

/**
 *
 * @author 1
 */
import java.util.Scanner;
public class EvenOddSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numIn, num, even = 0, odd = 0;
        String choice;
        Scanner userInput = new Scanner(System.in);
        
        do{
        System.out.print ("Please enter your number sequence : ");
        numIn = userInput.nextInt();
        
        even = 0;
        odd = 0;
        
        for (int i = 0; i < numIn; i++){
            System.out.print ("Please enter your number(s) : ");
            num = userInput.nextInt();
            
            if (num %2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println ("Even number in your sequence : " +even);
        System.out.println ("Odd number in your sequence : " +odd);
        
        userInput.nextLine();
        System.out.print ("Do you want to continue using this system? (yes/no) : ");
        choice = userInput.nextLine();
        
        } while (choice.equals("yes"));

        System.out.println("Thanks for using the system!! See you later!!");
        userInput.close();
    }
        
        
    }
    

