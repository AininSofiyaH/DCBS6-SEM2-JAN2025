package loopingtask3;
public class LoopingTask3 {
    public static void main(String[] args) {
        int sumEven=0, sumOdd=0;
        
        for (int num=1; num<=10; num++){
            if (num % 2==0){
                System.out.println("genap : " +num);
                sumEven += num;
        }else{ 
                System.out.println("ganjil : " +num);
                sumOdd += num;
            }
        }
        System.out.println("jumlah nombor genap : " +sumEven);
        System.out.println("jumlah nombor ganjil : " +sumOdd);
        
    }
    
}
