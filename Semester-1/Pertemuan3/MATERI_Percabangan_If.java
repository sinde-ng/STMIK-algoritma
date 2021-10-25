package Pertemuan3;

import java.util.*;

/** 
 * @author naufalYafi
 * 05 October 2021
 */

public class MATERI_Percabangan_If {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int nilai1, nilai2;
        
        System.out.print("Nilai 1 : ");
        nilai1 = input.nextInt();
        
        System.out.print("Nilai 2 : ");
        nilai2 = input.nextInt();
        
        if (nilai1 == nilai2)
            System.out.println("==");
        if (nilai1 <= nilai2)
            System.out.println("<=");
        if (nilai1 >= nilai2)
            System.out.println(">=");
        if (nilai1 != nilai2)
            System.out.println("!=");
        
    }
}
