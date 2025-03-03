import java.util.Scanner;

public class Chapter5Task4 {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static void Menu() {
        System.out.println("Unit Conversion Program!!!!:");
        System.out.println("1. Temperature: Celsius to Fahrenheit");
        System.out.println("2. Temperature: Fahrenheit to Celsius");
        System.out.println("3. Distance: Meters to Kilometers");
        System.out.println("4. Distance: Kilometers to Meters");
        System.out.println("5. Length: Inches to Centimeters");
        System.out.println("6. Length: Centimeters to Inches");
    }

    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);
        int choice;
        double input, result;

        while (true) {
            Menu();
            System.out.print("Choose ur unit (1-6): ");
            choice = zam.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    input = zam.nextDouble();
                    result = celsiusToFahrenheit(input);
                    System.out.printf("%.2f°C is equal to %.2f°F%n%n", input, result);
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    input = zam.nextDouble();
                    result = fahrenheitToCelsius(input);
                    System.out.printf("%.2f°F is equal to %.2f°C%n%n", input, result);
                    break;

                case 3:
                    System.out.print("Enter distance in meters: ");
                    input = zam.nextDouble();
                    result = metersToKilometers(input);
                    System.out.printf("%.2f meters is equal to %.2f kilometers%n%n", input, result);
                    break;

                case 4:
                    System.out.print("Enter distance in kilometers: ");
                    input = zam.nextDouble();
                    result = kilometersToMeters(input);
                    System.out.printf("%.2f kilometers is equal to %.2f meters%n%n", input, result);
                    break;

                case 5:
                    System.out.print("Enter length in inches: ");
                    input = zam.nextDouble();
                    result = inchesToCentimeters(input);
                    System.out.printf("%.2f inches is equal to %.2f centimeters%n%n", input, result);
                    break;

                case 6:
                    System.out.print("Enter length in centimeters: ");
                    input = zam.nextDouble();
                    result = centimetersToInches(input);
                    System.out.printf("%.2f centimeters is equal to %.2f inches%n%n", input, result);
                    break;

                default:
                    System.out.println("Invalid choice. Choose again (1-6)\n");
            }
        }
    }
}