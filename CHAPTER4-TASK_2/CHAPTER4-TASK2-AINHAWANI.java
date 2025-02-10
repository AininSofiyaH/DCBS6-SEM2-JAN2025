package loopingtask2;
public class LoopingTask2 {
    public static void main(String[] args) {
        int sum = 0;
        //for loop
        System.out.println("For Loop ");
        for (int count = 1; count<=10; count++)
    sum += count;
        System.out.println("Sum : " +sum);
        
        //while
         sum = 0;
         int num = 1;
         System.out.println("While Loop");
         while(num<=10){
             sum += num;
             num++;}
             System.out.println("Sum : " +sum);
             
        //do while
        sum = 0;
        int a = 1;
        System.out.println("Do-While Loop");
        do{
            sum += a;
            a++;}
        while(a<=10);
        System.out.println("Sum : " +sum);
        }
         }
        
        
    
    

