package Pertemuan2;

import java.util.*;

/**
 * @author naufalYafi
 * 29 September 2021
 */

public class MATERI_OperatorMATH_Float {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        double angka1,angka2,hasil;
        
        angka1 = input.nextDouble();
        System.out.print("Angka 1 : ");
        angka2 = input.nextDouble();
        System.out.print("Angka 2 : ");
        
        hasil = angka1/angka2;
        System.out.println("Hasil : "+hasil);
    
    }

}
