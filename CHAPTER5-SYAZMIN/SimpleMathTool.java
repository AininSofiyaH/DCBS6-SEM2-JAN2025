import javax.swing.JOptionPane;

public class SimpleMathTool {

    // Retrieve user input
    public static int fetchInput(String prompt) {
        String response = JOptionPane.showInputDialog(prompt);
        return Integer.parseInt(response); // Convert response to integer
    }

    // Math operations
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static String quotient(int a, int b) {
        if (b == 0) {
            return "Oops! Can't divide by zero.";
        }
        return "Result of division: " + (a / b);
    }

    public static void main(String[] args) {
        // Get numbers from the user
        int firstNum = fetchInput("Input first number:");
        int secondNum = fetchInput("Input second number:");
        int selection = fetchInput("Pick an option:\n1. Add\n2. Subtract\n3. Multiply\n4. Remainder\n5. Divide");

        String outputMessage;
        
        switch (selection) {
            case 5:
                outputMessage = quotient(firstNum, secondNum);
                break;
            case 3:
                outputMessage = "Multiplication gives: " + product(firstNum, secondNum);
                break;
            case 1:
                outputMessage = "Sum total: " + sum(firstNum, secondNum);
                break;
            case 4:
                outputMessage = "Modulo result: " + remainder(firstNum, secondNum);
                break;
            case 2:
                outputMessage = "Difference is: " + difference(firstNum, secondNum);
                break;
            default:
                outputMessage = "Invalid selection! Try again.";
        }

        // Show result
        JOptionPane.showMessageDialog(null, outputMessage, "Outcome", JOptionPane.PLAIN_MESSAGE);

        // Terminate
        System.exit(0);
    }
}
