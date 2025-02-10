//ilham munsif
public class LoopOddEven {
    public static void main(String[] args) {
        int even = 0, odd = 0;
        
        System.out.println("Even numbers: ");
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
                even += i;
            }
        }
        
        System.out.println("\nOdd numbers: ");
        for (int i = 1; i <= 10; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
                odd += i;
            }
        }
       
        System.out.println("\n\nSum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
}
