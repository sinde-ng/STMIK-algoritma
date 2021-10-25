package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class LATIHAN_Menampilkan_Bilangan_Ganjil {
    
    public static void main(String[] args){
        
        int x; // variabel
        
        for(x=1; // variabel diisi dengan angka 1
            x<=50; // batas perulangan
            x++) // increment / pertambahan
        {
            if(x%2==1) // % = merupakan operator sisa bagi
            {
                System.out.println(x);
            }
        }
        
    }
    
}
