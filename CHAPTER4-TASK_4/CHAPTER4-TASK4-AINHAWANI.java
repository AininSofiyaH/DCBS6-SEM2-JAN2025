
package loopingtask4;


public class LoopingTask4 {

    
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<=10; i++){
            int power = i*i;
            System.out.println("Power of " + i + "=" +power);
            sum += power;
        }
        System.out.println("Sum of powers from 1 to 10 : " +sum);
    }
    
}
