package Pertemuan3;

import java.util.*;

/**
 * @author naufalYaf
 * 06 September 2021
 */

public class LATIHAN_Mengelompokkan_Jurusan {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        String nama,nim,jenisJurusan;
        int jurusan;
        
        System.out.print("Masukkan Nama : ");
        nama = input.next();
        System.out.print("Masukkan NIM : ");
        nim = input.next();
        System.out.print("--- Pilihan Jurusan ---\n"
                       + "1. Sistem Informasi \n"
                       + "2. Teknik Industri \n"
                       + "3. Teknik Informatika \n");
        System.out.print("Jurusan : ");
        jurusan = input.nextInt();
        
        switch(jurusan){
            
            case 1:
                jenisJurusan = "Sistem Informasi";
                System.out.print("Nama    : "+nama +"\n"
                               + "NIM     : "+nim +"\n"
                               + "Jurusan : "+jenisJurusan +"\n");
                break;
            case 2:
                jenisJurusan = "Teknik Industri";
                System.out.print("Nama    : "+nama +"\n"
                               + "NIM     : "+nim +"\n"
                               + "Jurusan : "+jenisJurusan +"\n");
                break;
            case 3:
                jenisJurusan = "Teknik Informatika";
                System.out.print("Nama    : "+nama +"\n"
                               + "NIM     : "+nim +"\n"
                               + "Jurusan : "+jenisJurusan +"\n");
                break;
            default:
                System.out.println("Data tidak ditemukan !!!");
            
        }
        
    }
}
