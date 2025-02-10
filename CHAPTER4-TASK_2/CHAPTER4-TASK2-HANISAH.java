package onetotensum;

public class Onetotensum {

    public static void main(String[] args) {
        //FOR LOOP//
        int sum=0;
        System.out.println("-----FOR LOOP-----");
        for (int i= 1;i<=10;i++)
            sum+=i;
        System.out.println("THE SUM OF 1 TO 10 IS : " +sum);
        
        //WHILE LOOP//
        int wsum=0;
        int w=1;
        System.out.println("-----WHILE LOOP-----");
        while (w<=10){
            wsum+=w;w++;}
            System.out.println("THE SUM OF 1 TO 10 IS : " +wsum);
            
        //DO WHILE LOOP//
        int dwsum = 0;
        int dw=1;
        System.out.println("-----DO WHILE LOOP-----");
        do{
            dwsum+= dw;
            dw++;}
        while (dw<=10);
        System.out.println("THE SUM OF 1 TO 10 IS : " +dwsum);
        
    }}
    

