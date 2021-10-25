package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class TUGAS_Piramida_3 {
    
    public static void main(String[] args){
        
        int x,y; // variabel
        
        //perulangan luar
        for (x=1; // variabel diisi dengan angka 1 
             x<=7; // batas perulangan
             x++) // increment
        {
            
            System.out.println(" ");
            System.out.print(x);
            
            //perulangan dalam
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
