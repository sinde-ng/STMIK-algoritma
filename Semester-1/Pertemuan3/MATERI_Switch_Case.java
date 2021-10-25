package Pertemuan3;

import java.util.*;

/**
 * @author naufalYaf
 * 05 October 2021
 */

public class MATERI_Switch_Case {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nilai (1-3) : ");
        int nilai = input.nextInt();
        
        switch(nilai){
            
            case 1: System.out.println("=1");
            case 2: System.out.println("=3");
            case 3: System.out.println("=2");
            default: System.out.println("Error");
        }
        
    }
}
