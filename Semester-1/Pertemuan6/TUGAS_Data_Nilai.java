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
            int i=0,x,b=0;
            Boolean mengulang=true,panjangNama=true,panjangNim=true,algo=true,indo=true,ingg=true;

        // INPUT
            System.out.println("===== Program Data Penilaian =====");
                while(mengulang){
                    System.out.print(" Banyak data : ");
                        b = Integer.parseInt(input.readLine());
                            if(b<1){
                                System.out.println("=============================ERROR");
                                mengulang=true;
                            } else{
                                mengulang=false;
                            }
                }
                    
                    // DEKLARASI
                        String[] nama = new String[b];
                        String[] nim = new String[b];
                        String[] keterangan = new String[b];
                        int[] nilaiAlgoritma = new int[b];
                        int[] nilaiBInd = new int[b];
                        int[] nilaiBIngg = new int[b];
                        int[] jumlahNilai = new int[b];
                        int[] nilaiRata = new int[b];
                        
            System.out.println("==================================");
                
            
            for(i=0;i<b;i++){
                x=1+i;
            
                System.out.print(x + ". Masukkan Nama : ");
                    while(panjangNama){
                        nama[i] = input.readLine();
                            if(nama[i].length()>5){
                                System.out.println("--- !!! Karakter tidak boleh lebih dari 5");
                                System.out.print("   Masukkan Nama : ");
                                panjangNama=true;
                            } else{panjangNama=false;}
                    }
                    
                while(panjangNim){
                    System.out.print("   Masukkan NIM  : ");
                        nim[i] = input.readLine();
                            if(nim[i].length()>5){
                                System.out.println("--- !!! Karakter tidak boleh lebih dari 5");
                                panjangNama=true;
                            } else{panjangNim=false;}
                }
                    
                System.out.println("   Masukkan Nilai");
                    System.out.print("     a. Algoritma    : ");
                        while(algo){
                            nilaiAlgoritma[i] = Integer.parseInt(input.readLine());
                                if(nilaiAlgoritma[i]<0){
                                    System.out.println("--- !!! Angka yang anda masukkan kurang dari 0");
                                    System.out.print("        Algoritma    : ");
                                    algo=true;
                                } else if(nilaiAlgoritma[i]>100){
                                    System.out.println("--- !!! Angka yang anda masukkan lebih dari 100");
                                    System.out.print("        Algoritma    : ");
                                    algo=true;
                                } else {algo=false;}
                        }
                    System.out.print("     b. B. Indonesia : ");
                        while(indo){
                            nilaiBInd[i] = Integer.parseInt(input.readLine());
                                if(nilaiBInd[i]<0){
                                    System.out.println("--- !!! Angka yang anda masukkan kurang dari 0");
                                    System.out.print("        B. Indonesia : ");
                                    indo=true;
                                } else if(nilaiAlgoritma[i]>100){
                                    System.out.println("--- !!! Angka yang anda masukkan lebih dari 100");
                                    System.out.print("        B. Indonesia : ");
                                    indo=true;
                                } else {indo=false;}
                        }
                    System.out.print("     c. B. Inggris   : ");
                        while(ingg){
                            nilaiBIngg[i] = Integer.parseInt(input.readLine());
                                if(nilaiBIngg[i]<0){
                                    System.out.println("--- !!! Angka yang anda masukkan kurang dari 0");
                                    System.out.print("        B. Inggris   : ");
                                    ingg=true;
                                } else if(nilaiBIngg[i]>100){
                                    System.out.println("--- !!! Angka yang anda masukkan lebih dari 100");
                                    System.out.print("        B. Inggris   : ");
                                    ingg=true;
                                } else {ingg=false;}
                        }
            }
            
            System.out.println("==================================");
            
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
            System.out.print("\n"
                           + "----------------------------------------------------------------------------------------------------------\n"
                           + "| NO |    NIM    |        NAMA        | ALGORITMA | B INDONESIA | B INGGRIS | JUMLAH | RATA | KETERANGAN |\n"
                           + "----------------------------------------------------------------------------------------------------------\n");
            
            for(i=0;i<b;i++){
                x=1+i;
                
                System.out.println("  "+x + ".      "+nim[i] + "            "+nama[i] + "               "+nilaiAlgoritma[i] + "          "+nilaiBInd[i] + "        "+nilaiBIngg[i] + "        "+jumlahNilai[i] + "       "+nilaiRata[i] + "   "+keterangan[i]);
            }
            
            System.out.println("==========================================================================================================\n");
    }
}
