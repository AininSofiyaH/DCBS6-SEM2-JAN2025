/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a_kha
 */

import javax.swing.JOptionPane;

public class NewClass1 {
public static void main(String[] args) {
  
    String firstNumber;
       String secondNumber;
       String menu;
       int num1, num2, sum, operator;
       
       
firstNumber = JOptionPane.showInputDialog("Enter first integer");
secondNumber = JOptionPane.showInputDialog("Enter second integer");
 menu = JOptionPane.showInputDialog("Enter (Nom) Operators 1. +   2. -  3. X   4. %   5. / (Divide) ");
 
 num1 = Integer.parseInt(firstNumber);
       num2 = Integer.parseInt(secondNumber);
       operator = Integer.parseInt(menu);
       
    switch (operator) {
            case 1:
                
                sum = num1 + num2;
                
                JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                sum = num1 - num2;
                
                JOptionPane.showMessageDialog(null, "The substract is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
    case 3:
                sum = num1 * num2;
               
                JOptionPane.showMessageDialog(null, "The multiply is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                sum = num1 % num2;
                
                JOptionPane.showMessageDialog(null, "The modulus is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
            case 5:
                sum = num1 / num2;
                // Display the result
                JOptionPane.showMessageDialog(null, "The divide is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                break;
        }

       

       // Exit the program
       System.exit(0);
    
}}
