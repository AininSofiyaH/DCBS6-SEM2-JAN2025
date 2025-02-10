public class Demo4 {
    public static void main(String[] args) {
        int sum = 0; 

        System.out.println("Power of two (n²) for integers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            int square = i * i; 
            System.out.println("The square of " + i + " is " + square);
            sum += square;  
        }

        System.out.println("\nSum of squares (n²) from 1 to 10: " + sum);
    }
}
