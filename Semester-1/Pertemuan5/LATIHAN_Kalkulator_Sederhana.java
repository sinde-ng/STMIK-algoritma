package Pertemuan5;

import java.io.*;

/** 
 * @author maufalYafi
 * 20 October 2021
 */

public class LATIHAN_Kalkulator_Sederhana {

    public static void main(String[] args) throws IOException{
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int bilPertama,bilKedua;
        String pertanyaan;
        Boolean jawaban = true;
        
        while (jawaban){
            System.out.println("===== Program Kasir Sederhana =====");
        
            // INPUT bilPertama = 14
                System.out.print("Bilangan 1 : ");
                    bilPertama = Integer.parseInt(input.readLine());
            // INPUT bilKedua = 9
                System.out.print("Bilangan 2 : ");
                    bilKedua = Integer.parseInt(input.readLine());
        
            // Proses
                // penjumlahan
                    int jumlah = bilPertama+bilKedua;
                // pengurangan
                    int kurang = bilPertama-bilKedua;
                // perkalian
                    int kali = bilPertama*bilKedua;
                // pembagian
                    double bagi = (double)bilPertama/(double)bilKedua;
        
            // OUTPUT
                System.out.print("Penjumlahan : "+jumlah +"\n"
                               + "Pengurangan : "+kurang +"\n"
                               + "Perkalian   : "+kali +"\n"
                               + "Pembagian   : "+bagi +"\n");
            // Loop
                System.out.print("Apakah anda ingin melakukannya lagi (y/n)? ");
                    pertanyaan = input.readLine();
                        if (pertanyaan.equalsIgnoreCase("y")){
                            jawaban = true;
                        }else{
                            System.exit(0);
                        }
        }
    }
}
