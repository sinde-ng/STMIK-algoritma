package Pertemuan2;

import java.util.*; //simbol bintang menandakan memanggil semua package

/**
 * @author naufalYafi
 * 29 September 2021
 */

public class TUGAS_Program_Kasir_Sederhana {
    
    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in); 

        String namaBarang;
        double totalBayar,totalHarga,conv_uangPembeli,conv_uangKembalian;
        int jumlahBarang, hargaBarang,total,uangPembeli,uangKembalian,conv_totalHarga;
    
        double diskon = 0.075;
    
            System.out.println("--- Program Kasir Sederhana ---");
    
    
        //Input 
            //Nama Barang
                System.out.print("Masukkan nama barang : ");
                namaBarang = userInput.next();
            //JumlahBarang
                System.out.print("Masukkan jumlah barang : ");
                jumlahBarang = userInput.nextInt();
            
                if (jumlahBarang < 1){
                    System.out.println("Error !!!");
                    System.exit(0);
                }
            //Harga Barang
                System.out.print("Masukkan harga barang : Rp. ");
                hargaBarang = userInput.nextInt();
            
                if (hargaBarang < 100){
                    System.out.println("Error !!!");
                    System.exit(0);
                }
            
        //Output
            //Hitung totalHarga
                totalHarga = jumlahBarang*hargaBarang;
                totalBayar = totalHarga*diskon;
                total = (int)totalBayar;
            //Kembalian
                System.out.print("Masukkan jumlah uang : Rp. ");
                uangPembeli = userInput.nextInt();
                uangKembalian = uangPembeli-total; 
            
                System.out.print("\n");
            
            //Konvert
                conv_totalHarga = (int)totalHarga;
                conv_uangPembeli = uangPembeli/1000;
                conv_uangKembalian = uangKembalian/1000;
            
            //Struk Pembelian    
                System.out.println("                           --- Struk Pembelian ---\n"
                                 + "\n"
                                 + "--------------------------------------------------------------------\n"
                                 + "|  Nama Barang  |  Jumlah Barang  |  Harga Satuan  |  Total Harga  |\n"
                                 + "--------------------------------------------------------------------\n"
                                 + "   "+namaBarang 
                                 + "            "+jumlahBarang 
                                 + "               Rp. "+hargaBarang 
                                 + "        Rp. "+conv_totalHarga + "\n"
                                 + "                                            Diskon : 7.5%\n"
                                 + "-------------------------------------------------------------------\n"
                                 + "   Jumlah :                                         Rp. "+total + "\n"
                                 + "-------------------------------------------------------------------\n");
                System.out.println(String.format("Uang Pembeli   : Rp. %.3f",conv_uangPembeli)); 
                System.out.println(String.format("Uang Kembalian : Rp. %.3f",conv_uangKembalian)); 
            
                    System.out.print("\n");
    
    }
}
