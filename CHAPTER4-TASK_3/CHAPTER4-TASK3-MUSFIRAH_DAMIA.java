/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chap4_task1;

/**
 *
 * @author Damia
 */
public class Chapter4_Task3_MusfirahDamia {
    public static void main(String[] args) {
    int countFor;
    int evensum=0,oddsum=0;
    for(countFor =1; countFor<=10;countFor++){
            
            if(countFor % 2 ==0){
                System.out.println(countFor+"even");
                evensum += countFor; 
            }else{
                System.out.println(countFor+"odd");
                oddsum += countFor;
            }
                
                
        }
    System.out.println("sum of even number from 1 to 10 is"+evensum);
            System.out.println("sum of odd number from 1 to 10 is"+oddsum);
    
    
    
    
    
    }
    
}
