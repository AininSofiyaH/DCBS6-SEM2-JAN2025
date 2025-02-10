
class Task4 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Squares of numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            int square = i * i; // Calculate n^2
            System.out.println(i + "^2 = " + square);
            sum += square; // Add to sum
        }

        System.out.println("\nSum of squares from 1 to 10 = " + sum);
    }
}
