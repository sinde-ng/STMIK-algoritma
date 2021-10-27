package Pertemuan6;

import java.io.*;

/**
 * @author naufalYafi
 * 25 October 2021
 */

public class TUGAS {

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // DEKLARASI
            // utama
                int i=0,b=0,x;
                Boolean banyakData=true;
            // tier
                int tertinggi=0,terendah=0,
                    tAlgo=0,rAlgo=0,
                    tIndo=0,rIndo=0,
                    tIngg=0,rIngg=0;
        
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
                            int[] nilaiRata = new int[b];
                        System.out.println("==================================");
                        
            for(i=0;i<b;i++){    
                x=i+1;
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
            }
        
        // PROSES
            for(i=0;i<b;i++){
                // PERHITUNGAN
                    // JUMLAH
                        jumlahNilai[i] = nilaiAlgoritma[i] + nilaiBInd[i] + nilaiBIngg[i];
                    // RATA RATA
                        nilaiRata[i] = jumlahNilai[i] / 3;
                        
                // PENGGOLONGAN
                    // KETERANGAN
                        if(nilaiRata[i]<60){
                            ket[i] = "Mengulang";
                        } else {ket[i] = "Berhasil";}
                    // TETINGGI dan TERENDAH
                        // NILAI ALGORITMA
                            tAlgo = nilaiAlgoritma[0];
                            rAlgo = nilaiAlgoritma[0];
                                for(i=0;i<b;i++){
                                    if(nilaiAlgoritma[i]>tAlgo){
                                        tAlgo = nilaiAlgoritma[i];
                                    } else if(nilaiAlgoritma[i]<rAlgo){
                                        rAlgo = nilaiAlgoritma[i];
                                    }
                                }
                        // NILAI B INDO
                            tIndo = nilaiBInd[0];
                            rIndo = nilaiBInd[0];
                                for(i=0;i<b;i++){
                                    if(nilaiBInd[i]>tIndo){
                                        tIndo = nilaiBInd[i];
                                    } else if(nilaiBInd[i]<rIndo){
                                        rIndo = nilaiBInd[i];
                                    }   
                                }
                        // NILAI B INGG
                            tIngg = nilaiBIngg[0];
                            rIngg = nilaiBIngg[0];
                                for(i=0;i<b;i++){
                                    if(nilaiBIngg[i]>tIngg){
                                        tIngg = nilaiBIngg[i];
                                    } else if(nilaiBIngg[i]<tIngg){
                                        rIngg = nilaiBIngg[i];
                                    }
                                }
            }
            
        // OUTPUT
            
            System.out.print("\n"
                           + "----------------------------------------------------------------------------------------------------------\n"
                           + "| NO |    NIM    |        NAMA        | ALGORITMA | B INDONESIA | B INGGRIS | JUMLAH | RATA | KETERANGAN |\n"
                           + "----------------------------------------------------------------------------------------------------------\n");
            
            for(i=0;i<b;i++){
                x=1+i;
                
                System.out.println("  "+x + ".      "+nim[i] + "            "+nama[i] + "               "+nilaiAlgoritma[i] + "          "+nilaiBInd[i] + "        "+nilaiBIngg[i] + "        "+jumlahNilai[i] + "       "+nilaiRata[i] + "   "+ket[i]);
            }
            
            System.out.println("==========================================================================================================");
            System.out.println("                 Nilai Tertinggi                |                        Nilai Terendah");
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println(" Nilai Algoritma        : "+tAlgo + "                     Nilai Algoritma        : "+rAlgo);
            System.out.println(" Nilai Bahasa Indonesia : "+tIndo + "                     Nilai Bahasa Indonesia : "+rIndo);
            System.out.println(" Nilai Bahasa Inggris   : "+tIngg + "                     NilaiBahasa Inggris    : "+rIngg);
            System.out.println("==========================================================================================================\n");
    }
}
