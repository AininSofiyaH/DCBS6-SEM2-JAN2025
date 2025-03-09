import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String menu = " ";
        int opt;
        System.out.println("##########################################");
        System.out.println("# Welcome to unit conversion application #");
        System.out.println("##########################################");

        // Keep displaying menu when user input is blank or enter
        while (menu.isBlank()) {
            System.out.println("\nMenu");
            System.out.println("1. Temperature");
            System.out.println("2. Distance and Length");
            System.out.println("3. Memory");
            System.out.println("4. Weight");
            System.out.println("5. Quit");

        menu = baca.next();

        // Calling method based on user's input
        switch (menu) {
            case "1": System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                opt = baca.nextInt();
                if (opt == 1) {
                    System.out.println("Enter the value in celsius:");
                    double x = baca.nextDouble();
                    double y = CtoF(x);
                    System.out.println(y +"F");
                }
                else {
                    System.out.println("Enter the value in fahrenheit:");
                    double x = baca.nextDouble();
                    double y = FtoC(x);
                    System.out.println(y +"C");
                }
                // Displaying the menu again on every option
                menu = "";
                break;

            case "2": System.out.println("1. Centimeter to Inch");
                System.out.println("2. Inch to Centimeter");
                opt = baca.nextInt();
                if (opt == 1) {
                    System.out.println("Enter the value in centimeter:");
                    double x = baca.nextDouble();
                    double y = CmtoInch(x);
                    System.out.println(y +"in");
                }
                else {
                    System.out.println("Enter the value in inch:");
                    double x = baca.nextDouble();
                    double y = InchtoCm(x);
                    System.out.println(y +"cm");
                }
                menu = "";
                break;

            case "3": System.out.println("1. Bit to Byte");
                System.out.println("2. Byte to Bit");
                opt = baca.nextInt();
                if (opt == 1) {
                    System.out.println("Enter the value in bit:");
                    double x = baca.nextDouble();
                    double y = BittoByte(x);
                    System.out.println(y +"B");
                }
                else {
                    System.out.println("Enter the value in byte:");
                    double x= baca.nextDouble();
                    double y = BytetoBit(x);
                    System.out.println(y +"bit");
                }
                menu = "";
                break;

            case "4": System.out.println("1. Kilogram to Pound");
                System.out.println("2. Pound to Kilogram");
                opt = baca.nextInt();
                if (opt == 1) {
                    System.out.println("Enter the value in kilogram:");
                    double x = baca.nextDouble();
                    double y = KgtoP(x);
                    System.out.println(y +"lb");
                }
                else {
                    System.out.println("Enter the value in pound");
                    double x = baca.nextDouble();
                    double y = PtoKg(x);
                    System.out.println(y +"kg");
                }
                menu = "";
                break;

            // Stopping the loop by making the menu is not blank
           case "5":
                System.out.println("Quitting...");
                menu = "lol";
                break;

           default:
                break;
           }
        }
    }

    // Methods for every unit conversion
    public static double FtoC(double x) {
        return (x-32)*5/9;
    }

    public static double CtoF(double x) {
        return (x*9/5)+32;
    }

    public static double CmtoInch(double x) {
        return x/2.54;
    }

    public static double InchtoCm(double x) {
        return x*2.54;
    }

    public static double BittoByte(double x) {
        return x/8;
    }

    public static double BytetoBit(double x) {
        return x*8;
    }

    public static double KgtoP(double x) {
        return x*2.20462;
    }

    public static double PtoKg(double x) {
        return x/2.20462;
    }
}