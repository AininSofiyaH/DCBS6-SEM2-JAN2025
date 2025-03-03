import java.util.Scanner;

class Student {
    String name;
    int mark1, mark2, mark3;

    // Constructor to initialize student details
    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate and return average marks
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}

public class StudentAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        // Input student details
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = scanner.next();

            System.out.println("Enter marks for " + name + ":");
            System.out.print("  ➤ Enter mark 1: ");
            int mark1 = scanner.nextInt();
            System.out.print("  ➤ Enter mark 2: ");
            int mark2 = scanner.nextInt();
            System.out.print("  ➤ Enter mark 3: ");
            int mark3 = scanner.nextInt();

            students[i] = new Student(name, mark1, mark2, mark3);
        }

        // Calculate and display averages
        double highestAverage = 0;
        String topStudent = "";
        System.out.println("\n--- Student Averages ---");
        for (Student student : students) {
            double avg = student.calculateAverage();
            System.out.println(student.name + "'s average: " + String.format("%.2f", avg));

            // Find the highest average
            if (avg > highestAverage) {
                highestAverage = avg;
                topStudent = student.name;
            }
        }

        // Display the student with the highest average
        System.out.println("\n🏆 The highest average is " + String.format("%.2f", highestAverage) + " by " + topStudent);

        scanner.close();
    }
}
