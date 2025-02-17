import javax.swing.JOptionPane;
public class AgeCalc {
   public static void main(String[] args) {
       String firstNumber;
       String secondNumber;
       int num1, num2, difference;
       
       firstNumber = JOptionPane.showInputDialog("Enter your born year");
       secondNumber = JOptionPane.showInputDialog("Enter the current year");
       num1 = Integer.parseInt(firstNumber);
       num2 = Integer.parseInt(secondNumber);
       difference = num2 - num1;
      
       JOptionPane.showMessageDialog(null, "Your age is "+difference, "years old",     JOptionPane.PLAIN_MESSAGE);
       System.exit(0);
    }   }

