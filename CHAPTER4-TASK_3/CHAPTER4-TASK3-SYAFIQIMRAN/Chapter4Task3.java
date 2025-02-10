public class Chapter4Task3 {
    public static void main(String[] args) {
        int Evensum = 0,Oddsum = 0;
        
        System.out.println("Even number from 1 to 10: ");
        for (int i = 1; i<=10; i++) {
            if (i % 2 == 0){
                Evensum += i;
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nSum of even number is : "+Evensum);
        
        System.out.println("\nOdd numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0){
                Oddsum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nSum of odd numbers is : "+Oddsum);
    }
}
