import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        String firstGUI, secondGUI, thirdGUI;
        int num1, num2, num3;

        // Getting 3 number as inputs
        firstGUI = JOptionPane.showInputDialog("Enter the first integer");
        num1 = Integer.parseInt(firstGUI);
        secondGUI = JOptionPane.showInputDialog("Enter the second integer");
        num2 = Integer.parseInt(secondGUI);
        thirdGUI = JOptionPane.showInputDialog("Enter the third integer");
        num3 = Integer.parseInt(thirdGUI);

        // Calculating the minimum and maximum number using Math method
        int min1 = Math.min(num1, num2);
        int min2 = Math.min(min1, num3);
        int max1 = Math.max(num1, num2);
        int max2 = Math.max(max1, num3);

        // Displaying the results
        JOptionPane.showMessageDialog(null, "Minimum integer = "+min2 , "Result", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Maximum integer = "+max2 , "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}