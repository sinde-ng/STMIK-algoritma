package Pertemuan4;

/**
 * @author naufalYafi
 * 07 October 2021
 */

public class TUGAS_Piramida_2 {
    
    public static void main(String[] args){
        
        int x,y;
        
        // perulangan luar
        for(x=5; // variaabel diisi angka 5
            x>=1; // batas perulangan
            x--) // decrement
        {
            System.out.println(" ");
            System.out.print(x );
            
            // perulangan dalam
            for (y=1; // variabel diisi angka 1
                y<=x; // batas perulangan
                y++) // increment
            {
                System.out.print(" *");
            }
            
        }
        
        System.out.print("\n");
        
    }
    
}
