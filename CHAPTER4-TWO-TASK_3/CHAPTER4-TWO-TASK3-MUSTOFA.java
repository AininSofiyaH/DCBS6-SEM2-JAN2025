import java.util.Scanner;
public class Salesman_commission {
    public static void main(String[] args) {

        int week = 0, i = 0;
        double earning = 0, total = 0, commission = 0;
        Scanner pembaca = new Scanner(System.in);

        System.out.println("+++ SALES COMMISSION CALCULATOR +++\n");
        System.out.println("Enter the number of weeks you wanted to calculate: ");
        week = pembaca.nextInt(); // user input how many weeks to calculate their earnings

        while (i < week) { //loop according to week number
            i ++;

            if (i == 1) { //using st suffix for number 1
            System.out.println("\nHow many earning you got in the "+i+"st week?");
            }
            else if (i == 2) {//using nd suffix for number 2
                System.out.println("\nHow many earning you got in the "+i+"nd week?");
            }
            else if (i == 3) {//using rd suffix for number 3
                System.out.println("\nHow many earning you got in the "+i+"rd week?");
            }
            else //using th suffix for next number
                System.out.println("\nHow many earning you got in the "+i+"th week?");
            earning = pembaca.nextDouble();

        commission = earning * 5/100;
        total = commission + 600;

        System.out.println("\nResults:");
        System.out.println("Your commission : RM" + commission);
        System.out.println("Your total earnings: RM" +total);}
    }
}