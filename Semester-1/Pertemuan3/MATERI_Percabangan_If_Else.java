package Pertemuan3;

import java.util.*;

/**
 * @author naufalYafi
 * 05 October 2021
 */

public class MATERI_Percabangan_If_Else {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        int nilai = input.nextInt();
        
        if (nilai < 80){
            System.out.println("Nilai kurang dari 80");
        }
        else {
            System.out.println("Nilai lebih dari 80");
        }
        
    }

}
