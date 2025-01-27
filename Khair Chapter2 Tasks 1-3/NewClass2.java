/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a_kha
 */

import javax.swing.JOptionPane;

public class NewClass2 {
    public static void main(String[] args) {
    
    String firstNumber;
       String secondNumber;
       int current_year, birth_year, age;
       
       firstNumber = JOptionPane.showInputDialog("Enter Current Year: ");
       secondNumber = JOptionPane.showInputDialog("Enter Birth Year: ");

       current_year = Integer.parseInt(firstNumber);
       birth_year = Integer.parseInt(secondNumber);

       age = current_year - birth_year;

       JOptionPane.showMessageDialog(null, "Your age is " + age, "Results", JOptionPane.PLAIN_MESSAGE);

       System.exit(0);
    }
}
   
    


    

