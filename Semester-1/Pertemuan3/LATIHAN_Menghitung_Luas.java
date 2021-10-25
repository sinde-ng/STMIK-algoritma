package Pertemuan3;

import java.util.*;

/**
 * @author naufalYafi
 * 06 September 2021
 */

public class LATIHAN_Menghitung_Luas {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int pilih,panjang,lebar,alas,tinggi,jariJari;
        double hasil;
        
        System.out.println("===========================");
        System.out.println("  Program Menghitung Luas");
        System.out.println("===========================");
        System.out.print("1. Luas Persegi Panjang\n"
                       + "2. Luas Segitiga \n"
                       + "3. Luas Lingkaran \n");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("--- Luas Persegi Panjang ---");
                System.out.print("Masukkan Panjang : ");
                panjang = input.nextInt();
                System.out.print("Masukkan Lebar : ");
                lebar = input.nextInt();
                hasil = panjang*lebar;
                System.out.println("Hasil : "+hasil);
                break;
            case 2:
                System.out.println("--- Luas Segetiga ---");
                System.out.print("Masukkan Alas : ");
                alas = input.nextInt();
                System.out.print("Masukkan Tinggi : ");
                tinggi = input.nextInt();
                hasil = (alas*tinggi)/2;
                System.out.println("Hasil : "+hasil);
                break;
            case 3:
                System.out.println("--- Luas Lingkaran ---");
                System.out.print("Masukkan Jari - Jari : ");
                jariJari = input.nextInt();
                hasil = jariJari*jariJari*22/7;
                System.out.println("Hasil : "+hasil);
                break;
            default:
        }
        
    }
}
