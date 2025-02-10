package evenodd;

public class Evenodd {
    
    public static void main(String[] args) {
        //FOR LOOP//
        int sum_even=0;
        int sum_odd=0;
        System.out.println("-----SUM OF EVEN AND ODD NUMBER-----");
        for (int l= 1;l<=10;l++)
            if (l % 2 == 0){
        System.out.println(l + " : even");
            sum_even += l;}
            else{
                System.out.println(l + "  odd");
            sum_odd += l;}
    
    
    System.out.println("SUM OF EVEN NUMBER : " +sum_even);
    System.out.println("SUM OF EVEN NUMBER : " +sum_odd);
}}
