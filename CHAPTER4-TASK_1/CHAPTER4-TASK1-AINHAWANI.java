package loopingtask1;
public class LoopingTask1 {
    public static void main(String[] args) {
        //for loop
        System.out.println("for loop : ");
        for (int count = 1; count<=10; count++)
    System.out.print(count + " ");
    System.out.println();

//while loop
System.out.println("while loop : ");
int count = 1;
System.out.println("Printing numbers from 1 to 10");
while(count<=10){
    System.out.print(count++ +" ");
}
System.out.println();

//do while
System.out.println("do while loop : ");
int num = 1;
System.out.println("Printing numbers from 1 to 10");
do{
    System.out.print(num++ +" ");}
while(num<=10);
    }
}