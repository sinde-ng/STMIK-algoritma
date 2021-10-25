package Pertemuan4;

import java.util.*;

/** 
 * @author naufalYafi
 * 07 September 2021
 */

public class TUGAS_No3_Perulangan_Program_Nilai {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
            boolean jawaban;
            int data;
            String pertanyaan;
            
        while(jawaban=true){
            System.out.flush();  
            
            System.out.print("Nilai : ");
                data = input.nextInt();
                
            System.out.print("Apakah anda ingin keluar? (y/t) : ");
                pertanyaan = input.next();
                
                if(pertanyaan.equalsIgnoreCase("y"))
                {
                    jawaban=false;
                    System.exit(0);
                } 
            }            
    }   
}
