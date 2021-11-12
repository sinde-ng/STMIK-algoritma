package Pertemuan8;

import java.io.*;

import java.text.*;

/** 
 * @author naufalYafi
 * 10 November 2021
 */

public class Respon {
    
    public static void main(String[] args) throws IOException {
        // DEKLARASI
            // UTAMA
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            
                String tanya,nama,barang;
                int kode,harga,jmlBarang,discount,jmlData=0,total=0,jumlahHarga=0,uang,kembalian,bayar=0;
                Boolean jawaban = true;
            
            // ARRAY
                String[] namaBarang = {"Kiwi","Mangga Taiwan","Jeruk","Lemon","Manggis","Kelengkeng","Anggur"};
                int[] hargaBarang = {55000,70000,80000,40000,30000,50000,23000};
            
            // FORMAT RUPIAH
                DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
                DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            
                    formatRp.setCurrencySymbol("Rp");
                    formatRp.setMonetaryDecimalSeparator(',');
                    formatRp.setGroupingSeparator('.');
        
                kursIndonesia.setDecimalFormatSymbols(formatRp);
                
        // INPUT
            // HEADER 
                System.out.println("----------------------------------------------------");
                System.out.println("| Kode Barang |     Nama Barang     |     Harga    |");
                System.out.println("----------------------------------------------------");
                    for (int i=0;i<7;i++){
                        int no = i+1;
                        System.out.printf("|%-13s|%-21s|%-14s|\n","     "+no,"    "+namaBarang[i],"  "+kursIndonesia.format(hargaBarang[i]));
                    }
                System.out.println("----------------------------------------------------\n");
                
                System.out.print("Nama        : ");
                        nama = input.readLine();
            
            while(jawaban){
                
                // MENGETAHUI JUMLAH JENIS BARANG YANG DIPILIH
                    jmlData++;
                
                // INPUT
                    System.out.print("Kode Barang : ");
                        kode = Integer.parseInt(input.readLine());
                
                switch(kode){
                    case 1 :
                        // DATA BARANG
                            barang = namaBarang[0];
                            harga = hargaBarang[0];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                discount = jumlahHarga*5/100;
                                bayar = jumlahHarga-discount;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 2 :
                        // DATA BARANG
                            barang = namaBarang[1];
                            harga = hargaBarang[1];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                discount = jumlahHarga*7/100;
                                bayar = jumlahHarga-discount;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 3 :
                        // DATA BARANG
                            barang = namaBarang[2];
                            harga = hargaBarang[2];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                discount = jumlahHarga*12/100;
                                bayar = jumlahHarga-discount;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 4 :
                        // DATA BARANG
                            barang = namaBarang[3];
                            harga = hargaBarang[3];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                discount = jumlahHarga*15/100;
                                bayar = jumlahHarga-discount;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 5 :
                        // DATA BARANG
                            barang = namaBarang[4];
                            harga = hargaBarang[4];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                bayar = jumlahHarga;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 6 :
                        // DATA BARANG
                            barang = namaBarang[5];
                            harga = hargaBarang[5];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                bayar = jumlahHarga;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    case 7 :
                        // DATA BARANG
                            barang = namaBarang[6];
                            harga = hargaBarang[6];
                                // OUTPUT DATA BARANG 
                                    System.out.println("     Nama Barang  : "+barang);
                                    System.out.println("     Harga Barang : "+kursIndonesia.format(harga));
                        // INPUT JUMLAH BARANG
                            System.out.print("Jumlah Barang : ");
                                jmlBarang = Integer.parseInt(input.readLine());
                        // PERHITUNGAN
                                jumlahHarga = harga*jmlBarang;
                                bayar = jumlahHarga;
                        // TANYA PERULANGAN
                            System.out.print("Data Lagi [y/t] : ");
                                tanya = input.readLine();
                                    if(tanya.equalsIgnoreCase("y")){
                                        System.out.print("\n");
                                        jawaban = true;
                                    } else {jawaban = false;}
                                    
                        break;
                    default:
                        System.out.println("Data tidak ditemukan !!!");
                }
                
                // MENGHITUNG KESELURUHAN HARGA BARANG
                    total = total + bayar;
            }
            
            // OUTPUT TERAKHIR
                System.out.println("\nNama Pembeli : "+nama);
                System.out.println("====================================================");
                    System.out.println("Item        : "+jmlData);
                    System.out.println("Total Harga : "+kursIndonesia.format(total));
                System.out.println("====================================================");
                    System.out.print("                        Bayar       : Rp");
                        uang = Integer.parseInt(input.readLine());
                        kembalian = uang-total;
                    System.out.println("                        Kembalian   : "+kursIndonesia.format(kembalian));
                System.out.println("----------------------------------------------------\n");
    }
}
