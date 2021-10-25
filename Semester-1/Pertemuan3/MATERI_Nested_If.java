package Pertemuan3;

import java.util.*;

/**
 * @author naufalYafi
 * 05 October 2021
 */

public class MATERI_Nested_If {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int nilai = input.nextInt();
        
        if (nilai >=90){
            System.out.println("A");
        }
        else
            if (nilai >= 80){
                System.out.println("B");
            }
            else
                if (nilai >= 70){
                    System.out.println("C");
                }
                else
                    if (nilai >= 60){
                    System.out.println("D");
                }
                    else{
                        System.out.println("E");
                    }
    
    }
}
