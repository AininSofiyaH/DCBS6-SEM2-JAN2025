/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task5loop2b_cha4;

import java.util.Scanner;

/**
 *
 * @author Damia
 */
public class Tas5_kai {
     public static void main(String[] args) {
    Scanner userdata = new Scanner(System.in);
        String cont;
        do {
        int menu=0;
        System.out.println("Menu\n1.student exam identifer\n2.password system\n3.Sales Calculation\n4.Exit"); 
        System.out.println("Please choise menu"); 
        menu = userdata.nextInt();
        switch(menu){
        case 1:
         String list;
       System.out.println("Please enter List(name:p or f ;):");//ここでリストを受ける
        Scanner listscan = new Scanner(System.in);
        list = listscan.nextLine();
        int checkall=list.length();
        float  countpass=0;
        float stunum=0;       
        for(int i=0;i<checkall;i++){
            if(list.charAt(i)!=';')
                continue;
            stunum++;}
        for(int b=0;b<checkall;b++){
            if(list.charAt(b)!='p')
                continue;
            countpass++;}
        float calc;
        calc = countpass/stunum;
        
        System.out.println("Student number:"+(int)stunum);
        System.out.println("Passed Student number:"+(int)countpass);      
        if(calc>=0.5)
        System.out.println("Bonus to instructor");
        break;
        case 2:
        String passw = "Pass", conpass;
        int count = 5;
        Scanner password = new Scanner(System.in);
        
        do {
            System.out.println("Please Enter password:"); //ループ開始トリガー
            conpass = password.nextLine();
            
            if (conpass.equals(passw)) {
                System.out.println("Welcome to the student portal website!");
                break;
            } else {
                count--;
                System.out.println("Error password");
                System.out.println("You can try enter another password " + count + " left");
                
            }
            
            if (count == 0) {
                System.out.println("System exited");
                break; // システムを終了するためのブレーク
            }
            } while (count >= 0);
        break;
        case 3:
        String prodname;
      int qa;
      double total,pri,gross,all;
      Scanner sales= new Scanner(System.in);
    System.out.println("Please enter product name:");
      prodname = sales.nextLine();
      
      
      System.out.println("Please enter quantity:");
      qa = sales.nextInt();
      
      sales.nextLine();
      System.out.println("Please enter price(RM):"); 
      pri = sales.nextDouble();
      total =pri*qa;
      gross=total*0.05;//利益計算
      all = total+gross;
       System.out.println("product name:"+prodname);
       System.out.println("total sales for previous week:RM"+total);
       System.out.println("Sales Earning:RM"+all);
        break;
        case 4:
            System.out.println("Thank you for using program!");
            cont="y";
            continue;
        default:
            System.out.println("Invalid choice");
            break;
    }
        userdata.nextLine();
        System.out.println("Do you want to exit ? (y/n): ");
        cont = userdata.nextLine();
        System.out.println("Thank you for using program!");
    } while (!"y".equals(cont));
    }
}
    

