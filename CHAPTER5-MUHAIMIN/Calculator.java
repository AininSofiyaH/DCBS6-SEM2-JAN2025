import javax.swing.JOptionPane;

public class Calculator {
    
    // Method to get user input
    public static int getUserInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        return Integer.parseInt(input); // Convert input string to integer
    }

    // Methods for each arithmetic operation
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Error: Division by zero is not allowed.";
        }
        return "The division result is " + (num1 / num2);
    }

    public static void main(String[] args) {
        // Get numbers and operator from user
        int num1 = getUserInput("Enter first integer:");
        int num2 = getUserInput("Enter second integer:");
        int operator = getUserInput("Choose Operator:\n1. + (Add)\n2. - (Subtract)\n3. × (Multiply)\n4. % (Modulus)\n5. / (Divide)");

        String resultMessage = "";
        
        switch (operator) {
            case 1:
                resultMessage = "The sum is " + add(num1, num2);
                break;
            case 2:
                resultMessage = "The subtraction result is " + subtract(num1, num2);
                break;
            case 3:
                resultMessage = "The multiplication result is " + multiply(num1, num2);
                break;
            case 4:
                resultMessage = "The modulus result is " + modulus(num1, num2);
                break;
            case 5:
                resultMessage = divide(num1, num2);
                break;
            default:
                resultMessage = "Invalid choice! Please enter a number between 1 and 5.";
        }

        // Display result
        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.PLAIN_MESSAGE);
        
        // Exit the program
        System.exit(0);
    }
}
