package Pertemuan1;

/**
 * @author naufalYafi
 * 23 September 2021
 */

public class TUGAS_Perulangan_No4 {
    
    public static void main(String[] args){
    
        int i = 1; // variabel
        int jml = 0;
        
            do{
                
                // menghitung perulangan
                jml = jml+i; //1+2+3+4+5
                
                // perulangan
                System.out.println(i);
                i++; // increment / pertambahan (1, 1+1=2, 1+2=3, 1+3=4, 1+4=5)
                
            }
            
            while(i <= 5); // batas perulangan
        
        //hasil penjumlahan
        System.out.println("\n"+ "Jumlah : "+jml + "\n");
            
    }
}
