package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class MATERI_For_Decrement5 {
    
    public static void main(String[] args){
        
        int i; // variabel
        
        for (
                i=10; // variabel diisi angka 1
                i>=2; // batas perulangan
                i -=2 // decrement/mengurangi dengan kelipatan 2 (10, 10-2=8, 10-4=6, 10-6=4, 10-8=2)
            ){
        
            System.out.println(i);
            
        }
        
    }
    
}
