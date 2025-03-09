public class Main {
    public static void main(String[] args) {

        // Creating 3 student objects
        Student student1 = new Student("Ahmad Kaseem",85,76,67.5);
        Student student2 = new Student("Fatin Aliyah",90,86.5,87.7);
        Student student3 = new Student("Ah Chong",99,96,89);

        // Displaying student average marks and the highest average marks
        System.out.println("___CLASS-CBS042-ACADEMIC-REPORT___\n");
        System.out.println("Student Name: "+student1.name);
        System.out.println("Average Marks: "+student1.average());
        System.out.println("------------------------------------");
        System.out.println("Student Name: "+student2.name);
        System.out.println("Average Marks: "+student2.average());
        System.out.println("------------------------------------");
        System.out.println("Student Name: "+student3.name);
        System.out.println("Average Marks: "+student3.average());
        System.out.println("------------------------------------");
        double z = highest(student1.average(),student2.average(),student3.average());
        System.out.println("\nHighest Average Marks: "+z);
    }

    // Method to calculate the highest average marks
    static double highest(double x, double y, double z){
        double a = Math.max(x ,y);
        double b = Math.max(a, z);
        return b;
    }
}

public class Student {

    String name;
    double mark1;
    double mark2;
    double mark3;

    // Constructor to initialize student details
    Student(String name, double mark1, double mark2, double marks3){

        // 'this' is used as a substitute for student1/student2/student3
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = marks3;

    }
    // Method to calculate the average mark
    public double average() {
        double average;
        average = (this.mark1 + this.mark2 + this.mark3)/3;
        return average;
    }
}
