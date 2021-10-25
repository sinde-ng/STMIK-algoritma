package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class LATIHAN_Mencetak_Bilangan_Do_While {
    
    public static void main(String[] args){
        
        int bilangan=5,jumlah = 0;
        
        do {
            jumlah = jumlah+bilangan;
            
            System.out.println(bilangan);
            bilangan = bilangan+5;
        }
        while(bilangan<=50);
        
        System.out.println("Jumlah : "+jumlah);
        
    }
    
}

// Anggota Bilangan
/*
    5
    10
    15
    20
    25
    30
    35
    40
    45
    50
*/

// Jumlah Bilangan = 275
