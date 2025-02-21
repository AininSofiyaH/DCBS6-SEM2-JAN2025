/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looptask2a_chap4;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Instructor {
   public static void main(String[] args) {
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
            
      
       
   }
    
}
