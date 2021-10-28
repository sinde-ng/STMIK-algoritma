package Pertemuan6;

import java.io.*;

/**
 * @author naufalYafi
 * 25 October 2021
 */

public class TUGAS_Data_Nilai {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // DEKLARASI UTAMA
            int i=0,b=0,x;
            Boolean banyakData=true;
        
        // INPUT
            System.out.println("=== Program Data Penilaian ===");
                while(banyakData){
                    System.out.print(" Banyak Data : ");
                        b = Integer.parseInt(input.readLine());
                            if(b<1){
                                System.out.println("=============================ERROR");
                                banyakData=true;
                            }else{banyakData=false;}
                }
                
                    // DEKLARASI ARRAY
                        String[] nama = new String[b];
                        String[] nim = new String[b];
                        String[] ket = new String[b];
                            int[] nilaiAlgoritma = new int[b];
                            int[] nilaiBInd = new int[b];
                            int[] nilaiBIngg = new int[b];
                            int[] jumlahNilai = new int[b];
                            double[] nilaiRata = new double[b];
                        System.out.println("==================================");
                        
            for(i=0;i<b;i++){
                x=i+1;
                // INPUT
                    // DATA DIRI
                        System.out.print(x + ". Masukkan Nama : ");
                            nama[i] = input.readLine();
                        System.out.print("   Masukkan NIM  : ");
                            nim[i] = input.readLine();
                    // NILAI
                        System.out.println("   Masukkan Nilai");
                            System.out.print("     a. Algoritma    : ");
                                nilaiAlgoritma[i] = Integer.parseInt(input.readLine());
                            System.out.print("     b. B. Indonesia : ");
                                nilaiBInd[i] = Integer.parseInt(input.readLine());
                            System.out.print("     c. B. Inggris   : ");
                                nilaiBIngg[i] = Integer.parseInt(input.readLine());
                // PROSES
                    // PERHITUNGAN
                        // JUMLAH
                            jumlahNilai[i] = nilaiAlgoritma[i] + nilaiBInd[i] + nilaiBIngg[i];
                        // RATA RATA
                            nilaiRata[i] = jumlahNilai[i] / 3 ;
                            
                    // PENGGOLONGAN
                        // KETERANGAN
                            if(nilaiRata[i]<60){
                                ket[i] = "Mengulang";
                            } else{ket[i] = "Berhasil";}
            }
            
        // OUTPUT
            
            System.out.print("\n"
                           + "----------------------------------------------------------------------------------------------------------\n"
                           + "| NO |    NIM    |        NAMA        | ALGORITMA | B INDONESIA | B INGGRIS | JUMLAH | RATA | KETERANGAN |\n"
                           + "----------------------------------------------------------------------------------------------------------\n");
            
            for(i=0;i<b;i++){
                x=1+i;
                
                System.out.println("  "+x + ".      "+nim[i] + "            "+nama[i] + "               "+nilaiAlgoritma[i] + "          "+nilaiBInd[i] + "           "+nilaiBIngg[i] + "          "+jumlahNilai[i] + "     "+nilaiRata[i] + "   "+ket[i]);
            }
            System.out.println("==========================================================================================================\n");
    }
}
