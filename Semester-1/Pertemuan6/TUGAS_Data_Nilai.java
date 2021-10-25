package Pertemuan6;

import java.io.*;

/**
 * @author naufalYafi
 * 25 October 2021
 */

public class TUGAS_Data_Nilai {
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // DEKLARASI
            String[] nama = new String[2];
            String[] nim = new String[2];
            String[] keterangan = new String[2];
            String pertanyaan;
            int[] nilaiAlgoritma = new int[2];
            int[] nilaiBInd = new int[2];
            int[] nilaiBIngg = new int[2];
            int[] jumlahNilai = new int[2];
            int[] nilaiRata = new int[2];
            int i=0,x,b=0;
            Boolean jawaban = true;

        // INPUT
            System.out.println("===== Program Data Penilaian =====");
            System.out.print(" Banyak data : ");
                b = Integer.parseInt(input.readLine());
            System.out.println("==================================");
                
            for(i=0;i<b;i++){
                x=1+i;
            
                System.out.print(x + ". Masukkan Nama : ");
                    nama[i] = input.readLine();
                System.out.print("   Masukkan NIM : ");
                    nim[i] = input.readLine();
                    
                System.out.println("   Masukkan Nilai");
                    System.out.print("     a. Algoritma    : ");
                        nilaiAlgoritma[i] = Integer.parseInt(input.readLine());
                    System.out.print("     b. B. Indonesia : ");
                        nilaiBInd[i] = Integer.parseInt(input.readLine());
                    System.out.print("     c. B. Inggris   : ");
                        nilaiBIngg[i] = Integer.parseInt(input.readLine());
            }
            
        // PROSES
            for(i=0;i<b;i++){
                // PENJUMLAHAN
                    jumlahNilai[i] = nilaiAlgoritma[i]+nilaiBInd[i]+nilaiBIngg[i];
                // MENGHITUNG RATA - RATA
                    nilaiRata[i] = jumlahNilai[i]/3;
                // KETERANGAN
                    if(nilaiRata[i]<60){
                        keterangan[i] = "MENGULANG";
                    } else{
                        keterangan[i] = "BERHASIL";
                    }
            }
            
        // OUTPUT
            System.out.print("----------------------------------------------------------------------------------------------------------\n"
                           + "| NO |    NIM    |        NAMA        | ALGORITMA | B INDONESIA | B INGGRIS | JUMLAH | RATA | KETERANGAN |\n"
                           + "----------------------------------------------------------------------------------------------------------\n");
            
            for(i=0;i<b;i++){
                x=1+i;
                
                System.out.println("  "+x + ".       "+nim[i] + "              "+nama[i] + "               "+nilaiAlgoritma[i] + "     "+nilaiBInd[i] + "   "+nilaiBIngg[i] + "   "+jumlahNilai[i] + "   "+nilaiRata[i] + "   "+keterangan[i]);
            }
            
            System.out.println("==========================================================================================================\n");
    }
}