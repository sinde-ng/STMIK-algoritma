package Pertemuan2;

import java.util.Scanner;

/**
 * 
 * @author naufalYafi
 * 29 September 2021
 */

public class TUGAS_Konversi_Kurs_Nilai_Mata_Uang {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        double rupiah,konversi,
            dolar = 13500, 
            ringgit = 3000,
            dolarSing = 10000,
            pound = 20000;
        
        System.out.println("--- Konversi Rupiah ke Dolar, Dolar Singapura, Ringgit Malaysia dan Pound ---");
        System.out.print("Rp. ");
        rupiah = userInput.nextDouble();
        
        if (rupiah < 100){
            System.out.println("Error !!!");
            System.exit(0);
        }
        
        //Konversi
            //Dolar
                konversi = rupiah/dolar;
                System.out.println("$ "+konversi);
            //Ringgit
                konversi = rupiah/ringgit;
                System.out.println("RM "+konversi);
            //DolarSingapura
                konversi = rupiah/dolarSing;
                System.out.println("S$ "+konversi);
            //Pound
                konversi = rupiah/dolarSing;
                System.out.println("£ "+konversi);            
        
    }
}
