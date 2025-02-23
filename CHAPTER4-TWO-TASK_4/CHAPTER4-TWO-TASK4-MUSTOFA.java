import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        boolean keepGoing = true;
        Scanner pembaca = new Scanner(System.in);  // Scanner declared here

        while (keepGoing) {

            System.out.println("-------------------------------------------------");
            System.out.println("    ODD and EVEN numbers in a NUMBER SEQUENCE    ");
            System.out.println("-------------------------------------------------");
            System.out.println("\nChoose a number sequence pattern");
            System.out.println("1. Arithmetic\n2. Geometry");
            int choose = pembaca.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter the first number: ");
                    int a = pembaca.nextInt();
                    System.out.println("Enter the number of interval: ");
                    int d = pembaca.nextInt();
                    System.out.println("Enter the number of sequences: ");
                    int n = pembaca.nextInt();
                    pembaca.nextLine();

                    System.out.println("\nArithmetic Sequence:");
                    for(int i = 1; i <= n ; i ++) {
                        System.out.print(a+",");
                        if (a % 2 == 0) {
                            even ++;
                        }
                        else
                            odd ++;
                        a += d;

                    } System.out.println("\nOdd number found in the number sequence: "+odd);
                    System.out.println("Even number found in the number sequence: "+even);
                    break;
                case 2:
                    System.out.println("Enter the first number: ");
                    int b = pembaca.nextInt();
                    System.out.println("Enter the number of interval: ");
                    int r = pembaca.nextInt();
                    System.out.println("Enter the number of sequences: ");
                    int m = pembaca.nextInt();
                    pembaca.nextLine();

                    System.out.println("\nArithmetic Sequence:");
                    for(int i = 1; i <= m ; i ++) {
                        System.out.print(b+",");
                        if (b % 2 == 0) {
                            even ++;
                        }
                        else
                            odd ++;
                        b *= r;

                    } System.out.println("\nOdd number found in the number sequence: "+odd);
                    System.out.println("Even number found in the number sequence: "+even);
                    break;
            }

            keepGoing = YES(pembaca);  //Assign YES() return value to keepGoing
            odd = 0;
            even = 0;
        }

        pembaca.close(); // Close Scanner after loop ends
        System.out.println("Goodbye!");
    }

    public static boolean YES(Scanner pembaca) {
        System.out.println("\nDo you wanna continue? (y/n)");
        String answer = pembaca.nextLine();  // Read user input

        return answer.toLowerCase().startsWith("y");  // Return true if starts with "y", otherwise false
    }

}

