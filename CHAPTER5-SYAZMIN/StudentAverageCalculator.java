import java.util.Scanner;

class Student {
    String studentName;
    int subject1, subject2, subject3;

    // Constructor to initialize student details
    public Student(String studentName, int subject1, int subject2, int subject3) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Method to compute average marks
    public double getAverage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

public class StudentAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] studentList = new Student[3];

        // Collect student details
        for (int count = 0; count < 3; count++) {
            System.out.print("\nEnter the name of Student " + (count + 1) + ": ");
            String studentName = input.next();

            System.out.println("Provide marks for " + studentName + ":");
            System.out.print("   Subject 1: ");
            int subject1 = input.nextInt();
            System.out.print("   Subject 2: ");
            int subject2 = input.nextInt();
            System.out.print("   Subject 3: ");
            int subject3 = input.nextInt();

            studentList[count] = new Student(studentName, subject1, subject2, subject3);
        }

        // Compute and display averages
        double topAverage = 0;
        String topStudent = "";
        System.out.println("\n--- Student Score Averages ---");
        for (Student student : studentList) {
            double avg = student.getAverage();
            System.out.println(student.studentName + "'s average: " + String.format("%.2f", avg));

            // Identify the highest average
            if (avg > topAverage) {
                topAverage = avg;
                topStudent = student.studentName;
            }
        }

        // Display the student with the highest average
        System.out.println("\n Best Performer: " + topStudent + " with an average of " + String.format("%.2f", topAverage));

        input.close();
    }
}
