import java.util.Scanner;

public class Main {
    static Scanner task5 = new Scanner(System.in);

    public static void main(String[] args) {
        int menuChoice;
        
        do {
            System.out.println("\n===============================");
            System.out.println("  Calc (short for calculator)  ");
            System.out.println("===============================");
            System.out.println("1.  Calculate Sales Commission");
            System.out.println("2.  Count Even & Odd Numbers");
            System.out.println("3.  Analyze Student Results");
            System.out.println("4.  Exit ");
            System.out.println("===============================");
            System.out.print("Select a function (1-4): ");
            menuChoice = task5.nextInt();

            switch (menuChoice) {
                case 1:
                    calculateCommission();
                    break;
                case 2:
                    countEvenOdd();
                    break;
                case 3:
                    analyzeStudentResults();
                    break;
                case 4:
                    System.out.println("Program terminated.");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-4.");
            }
        } while (menuChoice != 4);
        
        task5.close();
    }

    
    // Option 1: Function to calculate sales commission
    public static void calculateCommission() {
        int choice;
        double totalSales, basicSalary, commission, totalIncome;
        
        basicSalary = 600.0;
        
        do {
            System.out.print("Enter total sales for this week (in RM): ");
            totalSales = task5.nextDouble();
            
            commission = totalSales * 0.05;
            totalIncome = basicSalary + commission;

            System.out.printf("Total income for this week: RM%.2f%n", totalIncome);
            
            System.out.print("Press 1 to continue or 0 to return to the main menu: ");
            choice = task5.nextInt();
            
        } while (choice == 1);
    }


    
    // Option 2: Function to count even & odd numbers
    public static void countEvenOdd() {
        int num, totalNumbers;
        char choice;  

        do {
            int evenCount = 0, oddCount = 0;

            System.out.print("Enter the number of integers in the sequence: ");
            totalNumbers = task5.nextInt();
            
            System.out.println("Enter " + totalNumbers + " integer numbers:");
            for (int i = 0; i < totalNumbers; i++) {
                num = task5.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);

            System.out.print("Do you want to try again? (y/n): ");
            task5.nextLine(); // Consume newline after nextInt()
            choice = task5.nextLine().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }

    
    // Option 3: Function to analyze student results
    public static void analyzeStudentResults() {
        int passed = 0, failed = 0, totalStudents, grade;
        String choice;

        do {
            System.out.print("Enter the number of students: ");
            totalStudents = task5.nextInt();

            for (int i = 1; i <= totalStudents; i++) {
                System.out.print("Enter the result for student " + i + " (1 = Pass, 2 = Fail): ");
                grade = task5.nextInt();

                if (grade == 1) {
                    passed++;
                } else if (grade == 2) {
                    failed++;
                } else {
                    System.out.println("Error! Enter 1 (Pass) or 2 (Fail) only.");
                    i--; // Repeat the input for this student
                }
            }

            System.out.println("\nTotal Students: " + totalStudents);
            System.out.println("Passed: " + passed);
            System.out.println("Failed: " + failed);

            if (passed > totalStudents / 2) {
                System.out.println("Bonus to the instructor. Very Epic.");
            }

            do {
                System.out.print("Do you want to try again? (yes/no): ");
                task5.nextLine(); // Consume newline
                choice = task5.nextLine();

                if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")) {
                    System.out.println("Please enter 'yes' or 'no' only!");
                }

            } while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));

        } while (choice.equalsIgnoreCase("yes"));
    }
}
