public class Demo4 {
    public static void main(String[] args) {
        int evenSum = 0;  
        int oddSum = 0;   
        
        System.out.println("Even numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {  
                System.out.println(i);
                evenSum += i;  
            }
        }
        
        System.out.println("\nOdd numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
                oddSum += i;  
            }
        }
        
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
