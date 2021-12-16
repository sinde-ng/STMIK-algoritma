package Pertemuan10;

import java.io.*;

/**
 * @author naufalYafi
 * 09 December 2021
 */

public class TUGAS_Input_dan_Laporan_Sorting {
    
    // +++=====----- DEKLARATION -----=====+++
    // Main
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Boolean ulang = true;
    static String pertanyaan,noKaryawan;
    static int i,j,no=0,data=0,
                // Subtotal
                    subtotal_gajiPokok=0,
                    subtotal_tunjanganKeluarga=0,
                    subtotal_tunjanganAnak=0,
                    subtotal_Pph=0,
                    subtotal_gajiBersih=0,
                // Total
                    total_gajiPokok=0,
                    total_tunjanganKeluarga=0,
                    total_tunjanganAnak=0,
                    total_Pph=0,
                    total_gajiBersih=0;
    // Array 
    static int[] GAJIPOKOK = {7500000,6000000,4000000,2000000};
    
    static String[] namaKaryawan = new String[9999];
    static int[] jumlahAnak = new int[9999];
    static int[] pilihJabatan = new int[9999];
    static int[] pilihStatus = new int[9999];
    
    static String[] statusKaryawan = new String[9999];
    static String[] jabatanKaryawan = new String[9999];
    static int[] gajiPokok = new int[9999];
    static int[] tunjanganKeluarga = new int[9999];
    static int[] potongan_tunjanganKeluarga = new int[9999];
    static int[] tunjanganAnak = new int[9999];
    static int[] potongan_tunjanganAnak = new int[9999];
    static int[] pph = new int[9999];
    static int[] gajiBersih = new int[9999];
    
    // +++=====----- PROCEDURAL -----=====+++
    // Header
        static void header(){
            
            System.out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                            +"|    |                             |                   |                    |        |                Tunjangan                |                    |                    |\n"
                            +"| NO |        Nama Karyawan        |      Jabatan      |      Gaji Pokok    | Status |-----------------------------------------|        PPH         |     Gaji Bersih    |\n"
                            +"|    |                             |                   |                    |        |      Keluarga      |         Anak       |                    |                    |\n"
                            +"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            //                  3             28                        18                 19                7                19                 19                   19                     19
            //                                 a                         b                  c                d                e                  f                     g                      h
        }
    // Data
        static void data(int angka, String a, String b, int c, String d, int e, int f, int g, int h){
            System.out.printf("| %-3s| %-28s| %-18s| %-19s| %-7s| %-19s| %-19s| %-19s| %-19s|\n",angka,a,b,c,d,e,f,g,h);
        }
    // Subtotal
        static void subtotal(int a, int b, int c, int d, int e){
            System.out.print("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.printf("| %-4s %-28s| %-18s| %-19s| %-7s| %-19s| %-19s| %-19s| %-19s|\n","","Subtotal :","",a,"",b,c,d,e);
            System.out.print("==========================================================================================================================================================================\n");
        }
    // Total
        static void total(int a, int b, int c, int d, int e){
            System.out.print("\n==========================================================================================================================================================================\n");
            System.out.printf("| %-4s %-28s| %-18s| %-19s| %-7s| %-19s| %-19s| %-19s| %-19s|\n","","Total :","",a,"",b,c,d,e);
            System.out.print("==========================================================================================================================================================================\n");
        }
    
    // +++=====----- FUNCTION -----=====+++
    // Menghitung Tunjangan Keluarga
        static int hasil_tunjanganKeluarga(int a, int b){
            // a == pilihStatus
            // b == gajiPokok
            int tK;
                if(a==2){
                    tK = b*10/100;
                } else {
                    tK = b;
                }
            return tK;
        }
    // Menghitung Tunjangan Anak
        static int hasil_tunjanganAnak(int a, int b){
            // a == jumlahAnak
            // b == gajiPokok
            int tA;
                tA=b*(a*5)/100;
            return tA;
        }
    // Menghitung PPH
        static int hasil_pph(int a){
            // a == gajiPokok
            int pH;
                pH = a*25/1000;
            return pH;
        }
    
    // +++=====----- MAIN -----=====+++
    public static void main(String[] args)throws IOException{
        
        
        
        // +++=====----- INPUT -----=====+++
        while(ulang){
            no++;
            System.out.print("\n"+no+". Nomor Karyawan    : ");
                noKaryawan = input.readLine();
            System.out.print("   Nama Karyawan     : ");
                namaKaryawan[data] = input.readLine();
            System.out.print("   Kode Jabatan[1-4] : ");
                pilihJabatan[data] = Integer.parseInt(input.readLine());
            System.out.print("   Status[1=BK 2=KW] : ");
                pilihStatus[data] = Integer.parseInt(input.readLine());
                    if(pilihStatus[data]==2){
                        statusKaryawan[data] =  "KW";
                        System.out.print("   Jumlah Anak[1..3] : ");
                            jumlahAnak[data] = Integer.parseInt(input.readLine());
                    } else{
                        statusKaryawan[data] = "BK";
                        jumlahAnak[data] = 0;
                    }
            
            // +++=====----- PROCESS -----=====+++         
            switch(pilihJabatan[data]){
                case 1:
                    gajiPokok[data] = GAJIPOKOK[0];
                    jabatanKaryawan[data] = "Manager";
                    tunjanganKeluarga[data] = hasil_tunjanganKeluarga(pilihStatus[data],gajiPokok[data]);
                    tunjanganAnak[data] = hasil_tunjanganAnak(jumlahAnak[data],gajiPokok[data]);
                    pph[data] = hasil_pph(gajiPokok[data]);
                    gajiBersih[data] = tunjanganKeluarga[data]+tunjanganAnak[data]-pph[data];
                    break;
                case 2:
                    gajiPokok[data] = GAJIPOKOK[1];
                    jabatanKaryawan[data] = "Kabag";
                    tunjanganKeluarga[data] = hasil_tunjanganKeluarga(pilihStatus[data],gajiPokok[data]);
                    tunjanganAnak[data] = hasil_tunjanganAnak(jumlahAnak[data],gajiPokok[data]);
                    pph[data] = hasil_pph(gajiPokok[data]);
                    gajiBersih[data] = tunjanganKeluarga[data]+tunjanganAnak[data]-pph[data];
                    break;
                case 3:
                    gajiPokok[data] = GAJIPOKOK[2];
                    jabatanKaryawan[data] = "Pemasaran";
                    tunjanganKeluarga[data] = hasil_tunjanganKeluarga(pilihStatus[data],gajiPokok[data]);
                    tunjanganAnak[data] = hasil_tunjanganAnak(jumlahAnak[data],gajiPokok[data]);
                    pph[data] = hasil_pph(gajiPokok[data]);
                    gajiBersih[data] = tunjanganKeluarga[data]+tunjanganAnak[data]-pph[data];
                    break;
                case 4:
                    gajiPokok[data] = GAJIPOKOK[3];
                    jabatanKaryawan[data] = "Umum";
                    tunjanganKeluarga[data] = hasil_tunjanganKeluarga(pilihStatus[data],gajiPokok[data]);
                    tunjanganAnak[data] = hasil_tunjanganAnak(jumlahAnak[data],gajiPokok[data]);
                    pph[data] = hasil_pph(gajiPokok[data]);
                    gajiBersih[data] = tunjanganKeluarga[data]+tunjanganAnak[data]-pph[data];
                    break;
            }
            // Pertanyaan
                System.out.print("Data lagi [y/t] ");
                    pertanyaan = input.readLine();
                        if(pertanyaan.equalsIgnoreCase("y")){
                            data++;
                            ulang = true;
                        } else{
                            ulang = false;
                        }
        }
        int sort=0;
        String[] Snama = new String[8];
        
        String[] NAMA = {namaKaryawan[0],namaKaryawan[1],namaKaryawan[2],namaKaryawan[3],namaKaryawan[4],namaKaryawan[5],namaKaryawan[6],namaKaryawan[7]};
        for(int j=0;j<NAMA.length;j++){
            for(int i=j+1;i<NAMA.length;i++){
                if(NAMA[i].compareTo(NAMA[j])<0){
                    String temp = NAMA[j];
                    NAMA[j] = NAMA[i];
                    NAMA[i] = temp;
                }
            }
            Snama[sort] = NAMA[j];
            sort++;
        }
        
        // +++=====----- OUTPUT -----=====+++
        
        int halaman=1;
        // Menampilkan header
            System.out.println("\nLaporan Gaji Karyawan Sumber Waras");
            System.out.println("Per 30 Nopember 2020");
            System.out.println("                                                                                                                                                      Hal : "+halaman);
            header();
        no = 0;
        for(i=0;i<=data;i++){ 
            no++;
            
            // Menghitung Total
                total_gajiPokok = subtotal_gajiPokok+gajiPokok[i];
                total_tunjanganKeluarga = subtotal_tunjanganKeluarga+tunjanganKeluarga[i];
                total_tunjanganAnak = subtotal_tunjanganAnak+tunjanganAnak[i];
                total_Pph = subtotal_Pph+pph[i];
                total_gajiBersih = subtotal_gajiBersih+gajiBersih[i];
            // Menghitung Subtotal
                subtotal_gajiPokok = subtotal_gajiPokok+gajiPokok[i];
                subtotal_tunjanganKeluarga = subtotal_tunjanganKeluarga+tunjanganKeluarga[i];
                subtotal_tunjanganAnak = subtotal_tunjanganAnak+tunjanganAnak[i];
                subtotal_Pph = subtotal_Pph+pph[i];
                subtotal_gajiBersih = subtotal_gajiBersih+gajiBersih[i];
            // Menampilkan semua data
                System.out.printf("| %-3s| %-28s| %-18s| %-19s| %-7s| %-19s| %-19s| %-19s| %-19s|\n"
                ,no,NAMA[i],jabatanKaryawan[i],gajiPokok[i],statusKaryawan[i],tunjanganKeluarga[i],tunjanganAnak[i],pph[i],gajiBersih[i]);
            if(no%3==0){
                // Menampilkan subtotal
                    subtotal(subtotal_gajiPokok,subtotal_tunjanganKeluarga,subtotal_tunjanganAnak,subtotal_Pph,subtotal_gajiBersih);
                // Refresh subtotal
                    subtotal_gajiPokok=0;subtotal_tunjanganKeluarga=0;subtotal_tunjanganAnak=0;subtotal_Pph=0;subtotal_gajiBersih=0;
                // Lanjut Halaman
                    System.out.print("Tekan Sembarang tombol ke halaman berikutnya : ");
                        String jawab = input.readLine();
                // Menampilkan header
                    halaman++;
                    System.out.println("\nLaporan Gaji Karyawan Sumber Waras");
                    System.out.println("Per 30 Nopember 2020");
                    System.out.println("                                                                                                                                                      Hal : "+halaman);
                    header();
            }
        }
        // Menampilkan subtotal
            subtotal(subtotal_gajiPokok,subtotal_tunjanganKeluarga,subtotal_tunjanganAnak,subtotal_Pph,subtotal_gajiBersih);
        // Menampilkan total
            total(total_gajiPokok,total_tunjanganKeluarga,total_tunjanganAnak,total_Pph,total_gajiBersih);
    }
}
