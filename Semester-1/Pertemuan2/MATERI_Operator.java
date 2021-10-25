package Pertemuan2;

import java.util.Scanner;

/**
 * @author naufalYafi
 * 29 September 2021
 */

public class MATERI_Operator {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
    
        double angka1,angka2,hasil;
    
        //Operasi Pertambahan
            System.out.println("--- Operasi Pertambahan ---");
            
            //Masukkan angka pertama
                System.out.print("Masukkan angka pertama : ");
                angka1 = userInput.nextDouble();
            //Masukkan angka kedua
                System.out.print("Masukkan angka kedua : ");
                angka2 = userInput.nextDouble();
            //Hitung
                hasil = angka1+angka2;
                System.out.print("Hasil : "+hasil);
            
            System.out.println("\n");
    
        //Operasi Pengurangan
            System.out.println("--- Operasi Pengurangan ---");
            
            //Masukkan angka pertama
                System.out.print("Masukkan angka pertama : ");
                angka1 = userInput.nextDouble();
            //Masukkan angka kedua
                System.out.print("Masukkan angka kedua : ");
                angka2 = userInput.nextDouble();
            //Hitung
                hasil = angka1-angka2;
                System.out.print("Hasil : "+hasil);
            
            System.out.println("\n");
            
        //Operasi Perkalian
            System.out.println("--- Operasi Perkalian ---");
            
            //Masukkan angka pertama
                System.out.print("Masukkan angka pertama : ");
                angka1 = userInput.nextDouble();
            //Masukkan angka kedua
                System.out.print("Masukkan angka kedua : ");
                angka2 = userInput.nextDouble();
            //Hitung
                hasil = angka1*angka2;
                System.out.print("Hasil : "+hasil);
            
            System.out.println("\n");
            
        //Operasi Pembagian
            System.out.println("--- Operasi Pembagian ---");
            
            //Masukkan angka pertama
                System.out.print("Masukkan angka pertama : ");
                angka1 = userInput.nextDouble();
            //Masukkan angka kedua
                System.out.print("Masukkan angka kedua : ");
                angka2 = userInput.nextDouble();
            //Hitung
                hasil = angka1/angka2;
                System.out.print("Hasil : "+hasil);
            
            System.out.println("\n");
            
        //Operasi Sisa Bagi
            System.out.println("--- Operasi Sisa Bagi ---");
            
            //Masukkan angka pertama
                System.out.print("Masukkan angka pertama : ");
                angka1 = userInput.nextDouble();
            //Masukkan angka kedua
                System.out.print("Masukkan angka kedua : ");
                angka2 = userInput.nextDouble();
            //Hitung
                hasil = angka1%angka2;
                System.out.print("Hasil : "+hasil);
            
            System.out.println("\n");
            
    }
}
