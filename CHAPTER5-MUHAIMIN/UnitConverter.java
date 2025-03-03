import java.util.Scanner;

public class UnitConverter {

    // Method for distance conversion
    public static void convertDistance(Scanner meen) {
        System.out.println("\nDistance Conversion Options:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.print("Choose an option: ");
        int choice = meen.nextInt();

        System.out.print("Enter value to convert: ");
        double value = meen.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = value * 0.621371; // 1 km = 0.621371 miles
            System.out.println(value + " kilometers = " + result + " miles");
        } else if (choice == 2) {
            result = value * 1.60934; // 1 mile = 1.60934 km
            System.out.println(value + " miles = " + result + " kilometers");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method for memory conversion
    public static void convertMemory(Scanner meen) {
        System.out.println("\nMemory Conversion Options:");
        System.out.println("1. Megabytes to Gigabytes");
        System.out.println("2. Gigabytes to Megabytes");
        System.out.print("Choose an option: ");
        int choice = meen.nextInt();

        System.out.print("Enter value to convert: ");
        double value = meen.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = value / 1024; // 1 MB = 1/1024 GB
            System.out.println(value + " MB = " + result + " GB");
        } else if (choice == 2) {
            result = value * 1024; // 1 GB = 1024 MB
            System.out.println(value + " GB = " + result + " MB");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method for weight conversion
    public static void convertWeight(Scanner meen) {
        System.out.println("\nWeight Conversion Options:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");
        int choice = meen.nextInt();

        System.out.print("Enter value to convert: ");
        double value = meen.nextDouble();
        double result = 0;

        if (choice == 1) {
            result = value * 2.20462; // 1 kg = 2.20462 lbs
            System.out.println(value + " kg = " + result + " lbs");
        } else if (choice == 2) {
            result = value / 2.20462; // 1 lb = 0.453592 kg
            System.out.println(value + " lbs = " + result + " kg");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner meen = new Scanner(System.in);
        int choice;

        // Menu Loop
        do {
            System.out.println("\nUnit Conversion Menu:");
            System.out.println("1. Distance Conversion");
            System.out.println("2. Memory Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = meen.nextInt();

            switch (choice) {
                case 1:
                    convertDistance(meen);
                    break;
                case 2:
                    convertMemory(meen);
                    break;
                case 3:
                    convertWeight(meen);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        meen.close();
    }
}
