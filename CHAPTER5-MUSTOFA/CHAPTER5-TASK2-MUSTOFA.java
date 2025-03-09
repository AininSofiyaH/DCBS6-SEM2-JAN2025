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

        // Calling the minimum and maximum methods
        int min = Min(num1, num2, num3);
        int max = Max(num1, num2, num3);

        // Displaying the results
        JOptionPane.showMessageDialog(null, "Minimum integer = "+min , "Result", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Maximum integer = "+max , "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }

    // Method to calculate the minimum number
    public static int Min(int x, int y, int z) {
        int a = Math.min(x, y);
        int b = Math.min(a ,z);
        return b;
    }

    // Method to calculate the maximum number
    public static int Max(int x, int y, int z) {
        int a = Math.max(x, y);
        int b = Math.max(a ,z);
        return b;
    }
}
