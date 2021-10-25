package Pertemuan5;

import java.util.*;

/**
 * @author naufalYafi
 * 21 October 2021
 */

public class TUGAS_Transaksi_Toko_Mebel {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // DEKLARASI
            int jumlahHarga=0,jumlahBarang=0,harga=0,kodePaket,diskon,totalHarga,HARGA=0;
            String nama,alamat,noHP,pertanyaan;
            Boolean jawaban = true;
            
        // DATA
            String[] namaBarang = {
                "Meja Kursi Tamu",
                "Meja Kursi Teras",
                "Meja Kursi Taman",
                "Tempat Tidur",
                "Almari Pakaian",
                "Meja dan Kursi Kerja",
            };
            
            int[] hargaBarang = {
                10500000,
                 4500000,
                 2500000,
                 5000000,
                 4000000,
                 3500000
            };
            
            System.out.println("Kode Paket   Nama Paket             Harga Paket");
            
            for (int i=0;i<=5;i++){
                int x=i+1;
                System.out.println("    "+x + ".       "+namaBarang[i] + "     =      Rp."+hargaBarang[i]);
            }
            System.out.print("\n");
            
        // INPUT
            System.out.println("           Data Pemesanan");
            System.out.print("Masukkan Nama Anda : ");
                nama = input.nextLine();
            System.out.print("Masukkan Alamat Anda : ");
                alamat = input.nextLine();
            System.out.print("Masukkan No.Handphone Anda : ");
                noHP = input.nextLine();
            System.out.print("\n");
            
        while(jawaban=true){
            jumlahBarang++;
                
                System.out.println("           Data Pemesanan");
                System.out.print("Kode Paket : ");
                    kodePaket = input.nextInt();
                        switch(kodePaket){
                            case 1:
                                int y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 10500000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            case 2:
                                y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 4500000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            case 3:
                                y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 2500000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            case 4:
                                y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 5000000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            case 5:
                                y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 4000000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            case 6:
                                y = kodePaket-1;
                                System.out.print("Nama Paket : "+namaBarang[y] +"\n");
                                HARGA = 3500000;
                                harga = hargaBarang[y];
                                System.out.print("Harga Paket : "+harga +"\n");
                                break;
                            default:
                                System.out.println("Data tidak ditemukan !!!");
                        }
                    jumlahHarga = jumlahHarga+HARGA;
            
            System.out.print("Apakah anda ingin memesan lagi (y/n) ");
                    pertanyaan = input.next();
                    if (pertanyaan.equalsIgnoreCase("y")){
                        jawaban = true;
                } else {
                    System.out.print("\n");
                    // PERHITUNGAN
                        // PENENTUAN DISKON
                            if(jumlahHarga<5000000){
                                diskon = jumlahHarga*5/100;
                            } else if(jumlahHarga>5000000){
                                diskon = jumlahHarga*10/100;
                            } else if(jumlahHarga>15000000){
                                diskon = jumlahHarga*15/100;
                            } else {
                                diskon = jumlahHarga*20/100;
                            }
                    // PEMOTONGAN DISKON
                            totalHarga = jumlahHarga-diskon;
        
                    // HASIL
                        System.out.print("Jumlah Transaksi : "+jumlahBarang +"\n"
                                       + "Total Harga      : Rp."+jumlahHarga +"\n"
                                       + "Discount         : Rp. "+diskon +"\n"
                                               
                                       + "Total Bayar      : Rp."+totalHarga +"\n");
                        System.exit(0);
                }
        }
    }
}