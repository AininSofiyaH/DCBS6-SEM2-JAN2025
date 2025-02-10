public class Chapter4Task3 {
    public static void main(String[] args) {
        int Even = 0; 
        int Odd = 0;  

        System.out.println("Even numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
                Even += i; 
            }
        }

        
        System.out.println("\nOdd numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
                Odd += i; 
            }
        }

        
        System.out.println("\nSum of even numbers: " + Even);
        System.out.println("Sum of odd numbers: " + Odd);
    }
}