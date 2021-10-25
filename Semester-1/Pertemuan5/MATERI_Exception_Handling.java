package Pertemuan5;

import java.io.*;

/** 
 * @author naufalYafi
 * 20 October 2021
 */

public class MATERI_Exception_Handling {

    public static void main(String[] args) throws IOException{
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Exception Handling merupakan fasilitas di java yang memberikan flexibilitas kepada developer untuk menangkap bug atau kesalahan yang terjadi ketika program berjalan.
        int UTS,UAS;
        double nilaiAkhir;
        String nama,NIM;
        
        System.out.print("Masukkan Nama : ");
        nama = input.readLine();
        
        System.out.print("Masukkan NIM : ");
        NIM = input.readLine();
        
        System.out.print("Masukkan Nilai UTS : ");
        UTS = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan Nilai UAS : ");
        UAS = Integer.parseInt(input.readLine());
        
        nilaiAkhir = UTS*0.4 + UAS*0.6;
        
        // Output
            System.out.print("\n"
                           + "==============================" +"\n"
                           + "   Nama         : "+nama +"\n"
                           + "   NIM          : "+NIM +"\n"
                           + "   Nilai UTS    : "+UTS +"\n"
                           + "   Nilai UAS    : "+UAS +"\n"
                           + "   Nilai Akhir  : "+nilaiAkhir +"\n"
                           + "==============================" +"\n");
    }
}
