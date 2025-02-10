public class Chapter4Task2 {
    public static void main(String[] args) {
        int Forsum = 0;
        for (int i=1 ; i <= 10; i++){
            Forsum += i;
        }
        System.out.println("The sum of 10 using ForLoop is :" + Forsum);
        
        
        int Whilesum = 0;
        int w = 1;
        while (w <=10) {
            Whilesum += w;
            w++;
        }
        System.out.println("The sum of 10 using WhileLoop is :" +Whilesum);
        
        int DoWhilesum = 0;
        int d = 1;
        do {
            DoWhilesum += d;
            d++;
        } while (d <= 10);
        System.out.println("The sum of 10 using DoWhileLoop is :" +DoWhilesum);
        }
    }
