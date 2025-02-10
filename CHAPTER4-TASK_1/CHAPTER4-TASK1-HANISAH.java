package chap4task1;

public class Chap4task1 {

    public static void main(String[] args) {
        //FOR LOOP//
        System.out.println("-----FOR LOOP-----");
        System.out.println("Displaying Numbers from 1 to 10:");
        for (int count = 1;count<=10;count++){
            System.out.println(count);}
            
        //WHILE LOOP//
        int count = 1;
        System.out.println("-----WHILE LOOP-----");
        System.out.println("Displaying Numbers from 1 to 10:");
        while (count <=10){
            System.out.println(count++);
        }
        
        //DO WHILE LOOP//
        int number = 1;
        System.out.println("-----DO WHILE LOOP-----");
        System.out.println("Displaying Numbers from 1 to 10:");
        do{
            System.out.println(number++);}
        while (number<=10);
        
        
        
    }}


