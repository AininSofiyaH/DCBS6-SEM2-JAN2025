package ch4twobtask5;
import java.util.Scanner;
public class Ch4twobtask5 {
    public static void main(String[] args) {
        int option;
        Scanner mix=new Scanner (System.in);
        
        do{
            System.out.println("Hello!Welcome to the Mulit-Program System.");
        System.out.println("1.Password");
        System.out.println("2.Sales Comission");
        System.out.println("3.Even Odd Numbers");
        System.out.println("4.Exit");
        System.out.println("Select a program to run and enjoy!: ");
        option = mix.nextInt();
        
        switch (option){
            case 1 :
                String password = "wiege"; //password setting//
                String entpassword;
                int attempt_count=3;
                int option1;
                    do{
                     while (attempt_count>0){
                         String nextLine = mix.nextLine();
                	System.out.println("Please enter the password: " );
                        entpassword = mix.nextLine();
                        
                    if (entpassword.equals(password)){
                        System.out.println("Access allowed!");
                        
                    }else{
                        attempt_count--;
                        System.out.println("INCORRECT PASSWORD!Attempts left : " +attempt_count);}}
                   
                        System.out.println("Too many failed attempts.Access denied.");
                     
                        System.out.println("Do you wish to continue using this system? 1=yes, 0=no : ");
                        option1 = mix.nextInt();                                        
                } while (option1 == 1);
                break;
            
            case 2 :
                int itemsold;
                float comission,earnings,sales,salary=600;
                char option2;
        
                do{
                    System.out.print("Please enter the number of sold items: ");
                    itemsold=mix.nextInt();
        
                    System.out.print("Please enter the gross sales amount for the week: RM");
                    sales=mix.nextFloat();
                    mix.nextLine();
        
                    comission = 0.05f * sales;//comission is 5% fo the gross sales
                    earnings = salary + comission;
        
                System.out.println("Number of sold items: "+itemsold);
                System.out.println("Salesman's earning for the week: RM" +earnings);
                System.out.println("Do you wish to continue using this system?(y/n): ");
                option2 = mix.next().charAt(0);
                }while(option2 == 'y'|| option2 == 'Y');
                 break;
        
            case 3 :
                int num, value, even,odd;
                String option3;
        
                do{
                    even=0;
                    odd=0;
    
                    System.out.println("How many integers would you like to enter?");
                    num = mix.nextInt();
            
                    System.out.println("Enter the integers: ");
                    for (int count=0;count<num;count++){
                        value = mix.nextInt();
                        if (value%2==0){
                            even++;
                        }else{
                            odd++;
                        }
                    }
                    mix.nextLine();
                    
                    System.out.println("Number of even numbers: " +even);
                    System.out.println("Number of odd number: " +odd);
                    System.out.println("Do you wish to continue?(yes/no): ");
                    option3 = mix.nextLine();
                }while(option3.equals("yes")|| option3.equals("Yes"));
                break;
                
                case 4 :
                            System.out.println("Thank you for using this program!Program exited.");
                            break;
                            
                default:
                    System.out.println("Invalid option. Please select from the number above only.");
            }
        }while(option != 4);
        mix.close();
    }
}
    
       
