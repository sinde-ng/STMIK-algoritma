package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 September 2021
 */

public class TUGAS_Piramida_1 {
    
    public static void main(String[] args){
        
        int x,y; // variabel
        
        // perulangan luar
        for (x=1;  // variabel diisi angka 1
            x<=5; // batas perulangan 
            x++) // increment
        {
            System.out.println(" ");
            
            // perulangan dalam
            for (y=1; // variabel diisi angka 1 
                 y<=x; // batas perulangan
                 y++) // increment
            {
            
                System.out.print("*");
            }
            
        }
        
        System.out.print("\n");
        
    }
    
}
