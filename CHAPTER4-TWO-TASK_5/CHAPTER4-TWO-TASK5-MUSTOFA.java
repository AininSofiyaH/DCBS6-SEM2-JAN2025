import java.util.Scanner;

public class Salesman_commission_looping {
    public static void main(String[] args) {
        Scanner pembaca = new Scanner(System.in);
        boolean keep_going = true;

        System.out.println("+++ SALES COMMISSION CALCULATOR +++\n");

        while (keep_going) {
            int week, i = 0;
            double earning, total, commission;

            // Ask for the number of weeks
            System.out.println("Enter the number of weeks you want to calculate: ");
            week = pembaca.nextInt(); // User input for how many weeks to calculate earnings

            while (i < week) { // Loop according to week number
                i++;

                // Display week number with correct suffix
                if (i == 1) {
                    System.out.println("\nHow much did you earn in the " + i + "st week?");
                } else if (i == 2) {
                    System.out.println("\nHow much did you earn in the " + i + "nd week?");
                } else if (i == 3) {
                    System.out.println("\nHow much did you earn in the " + i + "rd week?");
                } else {
                    System.out.println("\nHow much did you earn in the " + i + "th week?");
                }

                earning = pembaca.nextDouble();

                commission = earning * 5 / 100;
                total = commission + 600;

                System.out.println("\nResults:");
                System.out.println("Your commission: RM" + commission);
                System.out.println("Your total earnings: RM" + total);
            }

            //Clear newline character from input buffer
            pembaca.nextLine();

            // Ask if the user wants to continue
            System.out.println("\nDo you want to continue using this calculator? (y/n or 1/0)");
            String answer = pembaca.nextLine().trim(); // Read user input

            //condition to handle both "y" and "1"
            keep_going = answer.toLowerCase().startsWith("y") || answer.equals("1");
        }

        System.out.println("Goodbye!");
        pembaca.close(); // Close Scanner to prevent memory leaks
    }
}
