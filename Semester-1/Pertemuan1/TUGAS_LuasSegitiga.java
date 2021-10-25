package Pertemuan1;

/**
 * @author naufalYafi
 * 23 September 2021
 */

public class TUGAS_LuasSegitiga {
    
    public static void main(String[] args){
    
        int a = 10;
        int t = 15;
        
        //memuat dua tipe data
        double luas = 0.5*a*t;
        
        //konvert dari float(bil.desimal) ke integer (bil.bulat)
        int hasil = (int)luas; 
        
        System.out.print("Alas : "+a + "\n" + "Tinggi : "+t + "\n" + "\n");
        System.out.println("Jadi, luas segitiganya adalah "+hasil + "\n");
        
    }
}
