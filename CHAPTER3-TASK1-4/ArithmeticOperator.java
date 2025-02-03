import javax.swing.JOptionPane;
public class ArithmeticOperator{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       String firstNumber;
       String secondNumber;
       String menu;
       int num1, num2, sum, operator;
       
       // Prompt user to enter the first integer
       firstNumber = JOptionPane.showInputDialog("Enter first integer");
       // Prompt user to enter the second integer
       secondNumber = JOptionPane.showInputDialog("Enter second integer");
       menu = JOptionPane.showInputDialog("Enter (Nom) Operators 1. +   2. -  3. X   4. %   5. / (Divide) ");

       // Convert input strings to integers
       num1 = Integer.parseInt(firstNumber);
       num2 = Integer.parseInt(secondNumber);
       operator = Integer.parseInt(menu);
       
        switch (operator) {
            case 1:
                // Calculate the sum
                sum = num1 + num2;
                // Display the result
                JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                sum = num1 - num2;
                // Display the result
                JOptionPane.showMessageDialog(null, "The substract is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                sum = num1 * num2;
                // Display the result
                JOptionPane.showMessageDialog(null, "The multiply is " + sum, "Results", JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                sum = num1 % num2;
                // Display the result
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
    }

    
}
