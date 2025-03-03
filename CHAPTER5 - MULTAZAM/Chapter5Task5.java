import java.util.Scanner;

class Student {
    private String name;
    private double[] marks;

    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum = sum + mark;
        }
        return sum / marks.length;
    }

    public String getName() {
        return name;
    }
}

public class Chapter5Task5 {
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);

        Student[] students = new Student[3];
        String[] names = {"Hafiz", "Hamzah", "Alex"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 marks for " + names[i] + ":");
            double[] marks = new double[3];

            for (int j = 0; j < 3; j++) {
                System.out.print("Marks " + (j + 1) + ": ");
                marks[j] = zam.nextDouble();
            }

            System.out.println(); 
            students[i] = new Student(names[i], marks);
        }

        zam.close();

        double highestAvg = 0;
        String best = "";

        for (Student s : students) {
            double avg = s.calculateAverage();
            System.out.printf("%s's Average: %.2f\n", s.getName(), avg);

            if (avg > highestAvg) {
                highestAvg = avg;
                best = s.getName();
            }
        }

        System.out.println();
        System.out.printf("Highest Average: %.2f (%s)\n\n", highestAvg, best);
    }
}