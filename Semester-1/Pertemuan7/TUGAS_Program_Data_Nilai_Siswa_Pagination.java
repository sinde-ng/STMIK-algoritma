package Pertemuan7;

import java.io.*;

/**
 * 
 * @author NaufalYafi
 * 02 November 2021
 */

public class TUGAS_Program_Data_Nilai_Siswa_Pagination {
    
    public static void main(String[] args) throws IOException{
        // DEKLARASI
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.print("Banyak Data : ");
                int x = Integer.parseInt(input.readLine());
            
            // ARRAY
                String[] nama = new String[x];
                String[] nim = new String[x];
                String[] grd = new String[x];
                String[] yud = new String[x];
                String[] ket = new String[x];
                    int[] nAlgo = new int[x];
                    int[] nIndo = new int[x];
                    int[] nIngg = new int[x];
                    int[] jml = new int[x];
                    double[] nRata = new double[x];
            
            // UTAMA
                int i,no=0,
                    sub_totalAlgo=0,sub_totalIndo=0,sub_totalIngg=0,
                    grand_totalAlgo=0,grand_totalIndo=0,grand_totalIngg=0;
            
            System.out.print("\n");
            
        for(i=0;i<x;i++){
            no=i+1;
            
            // INPUT
                System.out.print(no + ". Masukkan Nama      : ");
                    nama[i] = input.readLine();
                System.out.print("   Masukkan NIM       : ");
                    nim[i] = input.readLine();
                System.out.println("   Masukkan Nilai");
                System.out.print("      a. Algoritma    : ");
                    nAlgo[i] = Integer.parseInt(input.readLine());
                System.out.print("      b. B. Indonesia : ");
                    nIndo[i] = Integer.parseInt(input.readLine());
                System.out.print("      c. B. Inggris   : ");
                    nIngg[i] = Integer.parseInt(input.readLine());
                    
        }
        
        System.out.println(" ");
        System.out.println(" ");
        // OUTPUT
        
        System.out.print("                                                          LAPORAN NILAI SISWA" +"\n"
                        +" ------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                        +" | NO |   NIM   |       NAMA       |    ALGORITMA   |  B. Indonesia  |   B. Inggris   | JUMLAH | RATA - RATA | Grade |      Yudisium     | Keterangan |\n"
                        +" |----|---------|------------------|----------------|----------------|----------------|--------|-------------|-------|-------------------|------------|\n");
                                                                                                                                           
        for(i=0;i<x;i++){
            no=i+1;
            
            // PERHITUNGAN
                // SATUAN
                    jml[i] = nAlgo[i]+nIndo[i]+nIngg[i];
                    nRata[i] = jml[i]/3;
                    
                // SUBTOTAL
                    int Algo = nAlgo[i];
                        sub_totalAlgo = sub_totalAlgo+Algo;
                    int Indo = nIndo[i];
                        sub_totalIndo = sub_totalIndo+Indo;
                    int Ingg = nIngg[i];
                        sub_totalIngg = sub_totalIngg+Ingg;
                        
                // GRANDTOTAL
                    grand_totalAlgo = grand_totalAlgo+Algo;
                    grand_totalIndo = grand_totalIndo+Indo;
                    grand_totalIngg = grand_totalIngg+Ingg;
                    
            // PENGGOLONGAN
                if(nRata[i]>=90){
                    grd[i]="A";
                    yud[i]="Sangat Memuaskan";
                    ket[i]="Lulus";
                } else if(nRata[i]>=75){
                    grd[i]="B";
                    yud[i]="Memuaskan";
                    ket[i]="Lulus";
                } else if(nRata[i]>=65){
                    grd[i]="C";
                    yud[i]="Baik";
                    ket[i]="Lulus";
                } else if(nRata[i]>=55){
                    grd[i]="D";
                    yud[i]="Cukup";
                    ket[i]="Tidak Lulus";
                } else {
                    grd[i]="E";
                    yud[i]="Mengulang";
                    ket[i]="Tidak Lulus";
                }
            
            System.out.printf(" |%-4s|%-9s|%-18s|%-16s|%-16s|%-16s|%-8s|%-13s|%-7s|%-19s|%-12s|\n"," "+no," "+nim[i]," "+nama[i],"       "+nAlgo[i],"       "+nIndo[i],"       "+nIngg[i]," "+jml[i],"      "+nRata[i],"   "+grd[i],""+yud[i]," "+ket[i]);
            
            if(no%3==0){
                
                System.out.printf(" ==================================================================================================================================================\n"
                                + " |             SUBTOTAL :          |%-16s|%-16s|%-16s|\n","      "+sub_totalAlgo,"      "+sub_totalIndo,"      "+sub_totalIngg);
                
                System.out.println("\n Tekan enter untuk melanjutkan");
                    String jawab = input.readLine();
                    
                    sub_totalAlgo=0;sub_totalIndo=0;sub_totalIngg=0;
                
                System.out.print("\n                                                          LAPORAN NILAI SISWA\n"
                                +" ------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                                +" | NO |   NIM   |       NAMA       |    ALGORITMA   |  B. Indonesia  |   B. Inggris   | JUMLAH | RATA - RATA | Grade |      Yudisium     | Keterangan |\n"
                                +" |----|---------|------------------|----------------|----------------|----------------|--------|-------------|-------|-------------------|------------|\n");
            }
        }
        
        System.out.printf(" --------------------------------------------------------------------------------------------------------------------------------------------------\n"
                        + " |           GRANDTOTAL :          |%-16s|%-16s|%-16s|","      "+grand_totalAlgo,"      "+grand_totalIndo,"      "+grand_totalIngg
                        + "\n __________________________________________________________________________________________________________________________________________________\n");
    }
}
