public class Task4 {
    public static void main(String [] args) {
        int sum = 0;
        
        for (int i = 1; i<=10;i++) {
            int poweroftwo = i*i;
            
            sum += poweroftwo;
            System.out.println("Power of " + i + " is " + poweroftwo);
        }
        
        System.out.println("The sum of power of two from 1 to 10 is :" +sum);
    }
}