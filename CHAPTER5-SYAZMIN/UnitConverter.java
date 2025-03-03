import java.util.Scanner;

public class UnitConverter {

    // Method to handle distance conversions
    public static void processDistance(Scanner conv) {
        System.out.println("\nSelect a Distance Conversion:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Enter your choice: ");
        int selection = conv.nextInt();

        System.out.print("Enter the value to be converted: ");
        double inputValue = conv.nextDouble();
        double convertedValue = 0;

        if (selection == 1) {
            convertedValue = inputValue * 0.621371; // Conversion factor for km to miles
            System.out.println(inputValue + " km is equal to " + convertedValue + " miles.");
        } else if (selection == 2) {
            convertedValue = inputValue * 1.60934; // Conversion factor for miles to km
            System.out.println(inputValue + " miles is equal to " + convertedValue + " km.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Method to handle memory conversions
    public static void processMemory(Scanner conv) {
        System.out.println("\nChoose a Memory Conversion:");
        System.out.println("1. MB to GB");
        System.out.println("2. GB to MB");
        System.out.print("Enter your selection: ");
        int selection = conv.nextInt();

        System.out.print("Enter the value to convert: ");
        double inputValue = conv.nextDouble();
        double convertedValue = 0;

        if (selection == 1) {
            convertedValue = inputValue / 1024; // 1 MB = 1/1024 GB
            System.out.println(inputValue + " MB equals " + convertedValue + " GB.");
        } else if (selection == 2) {
            convertedValue = inputValue * 1024; // 1 GB = 1024 MB
            System.out.println(inputValue + " GB equals " + convertedValue + " MB.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Method to handle weight conversions
    public static void processWeight(Scanner conv) {
        System.out.println("\nSelect a Weight Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Enter your choice: ");
        int selection = conv.nextInt();

        System.out.print("Enter the value to convert: ");
        double inputValue = conv.nextDouble();
        double convertedValue = 0;

        if (selection == 1) {
            convertedValue = inputValue * 2.20462; // 1 kg = 2.20462 lbs
            System.out.println(inputValue + " kg is equivalent to " + convertedValue + " lbs.");
        } else if (selection == 2) {
            convertedValue = inputValue / 2.20462; // 1 lb = 0.453592 kg
            System.out.println(inputValue + " lbs is equivalent to " + convertedValue + " kg.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    public static void main(String[] args) {
        Scanner conv = new Scanner(System.in);
        int userChoice;

        // Main menu loop
        do {
            System.out.println("\n=== Unit Conversion Menu ===");
            System.out.println("1. Convert Distance");
            System.out.println("2. Convert Memory");
            System.out.println("3. Convert Weight");
            System.out.println("4. Exit Program");
            System.out.print("Select an option: ");
            userChoice = conv.nextInt();

            switch (userChoice) {
                case 1:
                    processDistance(conv);
                    break;
                case 2:
                    processMemory(conv);
                    break;
                case 3:
                    processWeight(conv);
                    break;
                case 4:
                    System.out.println("Terminating program...");
                    break;
                default:
                    System.out.println("Invalid input. Please select a valid option.");
            }
        } while (userChoice != 4);

        conv.close();
    }
}
