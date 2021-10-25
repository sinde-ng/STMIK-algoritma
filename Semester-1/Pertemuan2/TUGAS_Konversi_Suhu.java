package Pertemuan2;

import java.util.Scanner;

/**
 * @author naufalYafi
 * 29 September 2021
 */
public class TUGAS_Konversi_Suhu {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        double celcius,reamur,fahrenhet,kelvin;
        
        System.out.println("--- Konversi Suhu dari Celcius ke Reamur, Fahrenhet dan Kelvin ---");
            
        //Masukkan angka untuk tipe suhu celcius
            System.out.print("Celcius : ");
            celcius = userInput.nextDouble();
        
        //Konversi
            //Reamur
                reamur = celcius*4/5;
                
            //Fahrenhet
                fahrenhet = celcius*9/5;
                
            //Kelvin
                kelvin = celcius+273;
                
        //Hasil
            System.out.println("Reamur : "+reamur);
            System.out.println("Fahrenhet : "+fahrenhet);
            System.out.println("Kelvin : "+kelvin);

    }
}
