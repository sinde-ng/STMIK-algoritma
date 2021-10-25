package Pertemuan3;

import java.util.*;

/**
 * @author naufalYaf
 * 05 October 2021
 */

public class LATIHAN_Menentukan_Medali {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        String nama;
        int poin;
        
        System.out.print("Nama : ");
        nama = input.next();
        System.out.print("Poin (1-3) : ");
        poin = input.nextInt();
        
        if (poin >=3)
            System.out.println("Ket : Medali EMAS");
        else if (poin >=2)
            System.out.println("Ket : Medali PERAK");
        else if (poin ==1)
            System.out.println("Ket : Medali PERUNGGU");
        else 
            System.out.println("Ket : tidak mendapat medali");
    }
    
}
