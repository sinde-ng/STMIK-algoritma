package Pertemuan1;

/**
 * @author naufalYafi
 * 23 September 2021
 */

public class TUGAS_Perulangan_No5 {
    
    public static void main(String[] args){
    
        int i = 10; // variabel
        int jml = 0;
        
            do{
                
                //menghitung perulangan
                jml = jml+i; // 10+9+8+7+6+5
                
                //perulangan
                System.out.println(i);
                i--; // decrement / pengurangan (10, 10-1=9, 10-2=8, 10-3=7, 10-4=6, 10-5=5)
                
            }
            
            while(i >= 5); // batas perulangan
            
        //hasil menghitung
        System.out.println("\n" + "Jumlah : "+jml + "\n");
        
    }
}
