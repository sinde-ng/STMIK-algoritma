package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class TUGAS_No1_Bilangan_Ganjil {
    
    public static void main(String[] args){
    
        int i; // variabel
        
        for(i=39; // variabel diisi dengan angka 1
            i>=9; // batas perulangan
            i--) // decrement 
        {
            if (i%2==1) // operasi modulus
            {
                System.out.println(i);
            }
        }
    
    }
    
}
