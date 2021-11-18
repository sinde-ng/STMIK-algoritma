package Pertemuan9;

import java.io.*;

/** 
 * @author naufalYafi
 * 18 November 2021
 */

public class UTS {
    public static void main(String[] args) throws IOException{
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // DEKLARASI
            // UTAMA
                int i,kodePaket,totalHarga=0,totalBayar=0,harga=0,jumlahTransaksi=0,bayar=0,discount=0;
                String nama,alamathp,pertanyaan,barang;
                Boolean jawaban = true;
            // ARRAY
                String[] namaBarang = {"Kemeja Batik Tulis","Hem Batik Tulis Sutera","Atasan Wanita Tulis","Sutera Serambit","Setelan Wanita Tulis Sutera","Sarung Tulis Prima"};
                int[] hargaBarang = {350000,750000,300000,1250000,900000,150000};
        
        // INPUT
            // HEADER
                System.out.println("---------------------------------------------------------------");//12 28 19
                System.out.println("| Kode Paket |         Nama Paket         |    Harga Paket    |");
                System.out.println("---------------------------------------------------------------");
                    for(i=0; i<=5;i++){
                        int no = i+1;
                        System.out.printf("|%-12s|%-28s|%-19s|\n","      "+no,namaBarang[i],"     "+hargaBarang[i]);
                    }
                System.out.println("---------------------------------------------------------------");
                System.out.println("\n        Data Pembeli");
            // NAMA
                System.out.print("Nama             : ");
                    nama = input.readLine();
            // ALAMAT / HP
                System.out.print("Alamat / No HP   : ");
                    alamathp = input.readLine();
            // HEADER
                System.out.println("\n          Paket yang dibeli");
            // WHILE
                while(jawaban){
                    // JUMLAH DATA
                        jumlahTransaksi++;
                    // KODE PAKET
                        System.out.print("Kode Paket   : ");
                            kodePaket = Integer.parseInt(input.readLine());
                    // SWITCH
                        switch(kodePaket){
                            case 1:
                                // DATA
                                    barang = namaBarang[0];
                                    harga = hargaBarang[0];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            case 2:
                                // DATA
                                    barang = namaBarang[1];
                                    harga = hargaBarang[1];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            case 3:
                                // DATA
                                    barang = namaBarang[2];
                                    harga = hargaBarang[2];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            case 4:
                                // DATA
                                    barang = namaBarang[3];
                                    harga = hargaBarang[3];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            case 5:
                                // DATA
                                    barang = namaBarang[4];
                                    harga = hargaBarang[4];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            case 6:
                                // DATA
                                    barang = namaBarang[5];
                                    harga = hargaBarang[5];
                                        // OUTPUT DATA
                                            System.out.println("Nama Paket   : "+barang);
                                            System.out.println("Harga Paket  : "+harga);
                                // HARGA BARANG
                                    bayar = harga;
                                // PERTANYAAN
                                    System.out.print("Data Lagi [y/t] : ");
                                        pertanyaan = input.readLine();
                                            if(pertanyaan.equalsIgnoreCase("y")){
                                                jawaban = true;
                                            } else {jawaban = false;}
                                break;
                            default:
                                System.out.println("Data tidak ditemukan !!!");
                        }
                    // TOTAL HARGA 
                        totalHarga = totalHarga+bayar;
                }
            // PERHITUNGAN
                // DISCOUNT
                    if(totalHarga<2500000){
                        discount = totalHarga*5/100;
                    } else if(totalHarga>2500000){
                        discount = totalHarga*10/100;
                    } else if(totalHarga>7500000){
                        discount = totalHarga*15/100;
                    } else {
                        discount = totalHarga*20/100;
                    }
                // TOTAL BAYAR
                    totalBayar = totalHarga-discount;
                
        // OUTPUT
            System.out.println("\nJumlah Transaksi : "+jumlahTransaksi);
            System.out.println("Total Harga      : "+totalHarga);
            System.out.println("Discount         : "+discount);
            System.out.println("Total Bayar      : "+totalBayar);
    }
}
