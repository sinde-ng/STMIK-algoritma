package Pertemuan5;

import java.io.*;

/**
 * @author naufalYafi
 * 20 October 2021
 */

public class LATIHAN_Data_Pelanggan_Toko_Buku {

    public static void main(String[] args) throws IOException {
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // INPUT = nama depan dan belakang, alamat, tempat dan tanggal lahir, usia
            String namaDepan,namaBelakang,alamat,tempatLahir,tanggalLahir,usia;
            
            System.out.print("==============================" +"\n"
                           + "         DATA PELANGGAN" +"\n"
                           + "           Toko Buku" +"\n"
                           + "   '\\\"'Cahaya Padang'\\\"'" +"\n"
                           + "  Jln. Kebon Jahe no.23, Sidoarjo" +"\n"
                           + "==============================" +"\n");
            
            System.out.print("Masukkan Nama Depan : ");
                namaDepan = input.readLine();
            
            System.out.print("Masukkan Nama Belakang : ");
                namaBelakang = input.readLine();
            
            System.out.print("Masukkan Alamat : ");
                alamat = input.readLine();
            
            System.out.print("Masukkan Tempat Lahir : ");
                tempatLahir = input.readLine();
            
            System.out.print("Masukkan Tanggal Lahir : ");
                tanggalLahir = input.readLine();
            
            System.out.print("Masukkan Usia : ");
                usia = input.readLine();
            
        // OUTPUT = nama lengkap, alamat, tempat dan tanggal lahir, usia
            System.out.print("==============================" +"\n"
                           + "         DATA PELANGGAN" +"\n"
                           + "           Toko Buku" +"\n"
                           + "   '\\\"'Cahaya Padang'\\\"'" +"\n"
                           + "  Jln. Kebon Jahe no.23, Sidoarjo" +"\n"
                           + "==============================" +"\n"
                           + " Nama Lengkap           : "+namaDepan +" "+namaBelakang +"\n"
                           + " Alamat                 : "+alamat +"\n"
                           + " Tempat / Tanggal Lahir : "+tempatLahir +" , "+tanggalLahir +"\n"
                           + " Usia                   : "+usia +"\n");
    }
}
