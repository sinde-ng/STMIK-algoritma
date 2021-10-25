package Pertemuan3;

import java.util.Scanner;

/** 
 * @author naufalYafi
 * 05 October 2021
 */

public class TUGAS_Menentukan_Gaji_Karyawan {

    public static void main(String[] args){
    
        Scanner userInput = new Scanner(System.in);
        
        int jabatan,gajiPokok,status,jumlahAnak;
        double tunjanganKeluarga,tunjanganAnak,gajiKotor,potonganPPh,gajiBersih; 
        String nama,jenisJabatan,jenisStatus,nik;
        
        //input
            // Nomor Induk Karayawan
                System.out.print("Nomor Induk Karyawan : ");
                nik = userInput.next();
            // Nama Karyawan
                System.out.print("Nama Karyawan : ");
                nama = userInput.next();
        
            // Daftar Jabatan    
                System.out.print(" === JABATAN === \n"
                               + " 1. Manager \n"
                               + " 2. Staf \n"
                               + " 3. Pemasaran \n"
                               + " 4. Umum \n");
        
            // Input Jabatan
                System.out.print("Jabatan : ");
                jabatan = userInput.nextInt();
                
        //proses
            switch (jabatan) {
                
                // Manager
                    case 1:
                        jenisJabatan = "Manager";
                        gajiPokok = 5000000;
                        
                        //input
                            //status
                                System.out.print(" === STATUS === \n"
                                               + "1. Berkeluarga \n"
                                               + "2. Lajang \n");
                                System.out.print("Status : ");
                                status = userInput.nextInt();
                                
                        //proses
                            
                            if(status == 1){
                                jenisStatus = "Berkeluarga";
                                
                                System.out.print("Jumlah anak : ");
                                jumlahAnak = userInput.nextInt();
                                
                                // Menghitung Tunjangan 
                                    tunjanganKeluarga = gajiPokok*0.1;
                                    tunjanganAnak = gajiPokok*(jumlahAnak*0.05);
                                    
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                    
                            }
                            
                            else if(status == 2){
                                jenisStatus = "Lajang";
                                
                                // Menghitung Tunjangan
                                    tunjanganKeluarga = 0;
                                    tunjanganAnak = 0;
                                    jumlahAnak = 0;
                                
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                    
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                
                            }
                            
                            else {
                                System.out.println("Data tidak ditemukan !!!");
                            }
                        
                        break;
                        
                // Staf    
                    case 2:
                        jenisJabatan = "Staf";
                        gajiPokok = 3000000;
                        
                        //input
                            //status
                                System.out.print(" === STATUS === \n"
                                               + "1. Berkeluarga \n"
                                               + "2. Lajang \n");
                                System.out.print("Status : ");
                                status = userInput.nextInt();
                                
                        //proses
                            
                            if(status == 1){
                                jenisStatus = "Berkeluarga";
                                
                                System.out.print("Jumlah anak : ");
                                jumlahAnak = userInput.nextInt();
                                
                                // Menghitung Tunjangan 
                                    tunjanganKeluarga = gajiPokok*0.1;
                                    tunjanganAnak = gajiPokok*(jumlahAnak*0.05);
                                    
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                    
                            }
                            
                            else if(status == 2){
                                jenisStatus = "Lajang";
                                
                                // Menghitung Tunjangan
                                    tunjanganKeluarga = 0;
                                    tunjanganAnak = 0;
                                    jumlahAnak = 0;
                                
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                    
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                
                            }
                            
                            else {
                                System.out.println("Data tidak ditemukan !!!");
                            }
                        
                        break;
                        
                // Pemasaran
                    case 3:
                        jenisJabatan = "Pemasaran";
                        gajiPokok = 2500000;
                        
                        //input
                            //status
                                System.out.print(" === STATUS === \n"
                                               + "1. Berkeluarga \n"
                                               + "2. Lajang \n");
                                System.out.print("Status : ");
                                status = userInput.nextInt();
                                
                        //proses
                            
                            if(status == 1){
                                jenisStatus = "Berkeluarga";
                                
                                System.out.print("Jumlah anak : ");
                                jumlahAnak = userInput.nextInt();
                                
                                // Menghitung Tunjangan 
                                    tunjanganKeluarga = gajiPokok*0.1;
                                    tunjanganAnak = gajiPokok*0.05;
                                    
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                    
                            }
                            
                            else if(status == 2){
                                jenisStatus = "Lajang";
                                
                                // Menghitung Tunjangan
                                    tunjanganKeluarga = 0;
                                    tunjanganAnak = 0;
                                    jumlahAnak = 0;
                                
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                    
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                
                            }
                            
                            else {
                                System.out.println("Data tidak ditemukan !!!");
                            }
                        
                        break;
                        
                // Umum
                    case 4:
                        jenisJabatan = "Umum";
                        gajiPokok = 2000000;
                        
                        //input
                            //status
                                System.out.print(" === STATUS === \n"
                                               + "1. Berkeluarga \n"
                                               + "2. Lajang \n");
                                System.out.print("Status : ");
                                status = userInput.nextInt();
                                
                        //proses
                            
                            if(status == 1){
                                jenisStatus = "Berkeluarga";
                                
                                System.out.print("Jumlah anak : ");
                                jumlahAnak = userInput.nextInt();
                                
                                // Menghitung Tunjangan 
                                    tunjanganKeluarga = gajiPokok*0.1;
                                    tunjanganAnak = gajiPokok*0.05;
                                    
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                    
                            }
                            
                            else if(status == 2){
                                jenisStatus = "Lajang";
                                
                                // Menghitung Tunjangan
                                    tunjanganKeluarga = 0;
                                    tunjanganAnak = 0;
                                    jumlahAnak = 0;
                                
                                // Menghitung Gaji
                                    gajiKotor = gajiPokok+tunjanganKeluarga+tunjanganAnak;
                                    potonganPPh = gajiKotor*0.025;
                                    gajiBersih = gajiKotor-potonganPPh;
                                    
                                // Output
                                    System.out.print("\n");
                                    System.out.println(" --- Program Mencari Gaji Bersih dan Kotor --- ");
                                    System.out.print("Nomor Induk Karyawan  : "+nik +"\n"
                                                   + "Nama Karyawan         : "+nama +"\n"
                                                   + "Jabatan               : "+jenisJabatan +"\n"
                                                   + "Status                : "+jenisStatus + "\n"
                                                   + "Jumlah Anak           : "+jumlahAnak + "\n"
                                                   + "\n"
                                                   + "  Gaji Pokok          : Rp. "+gajiPokok + "\n"
                                                   + "  Tunjangan Keluarga  : Rp. "+tunjanganKeluarga + "\n"
                                                   + "  Tunjangan Anak      : Rp. "+tunjanganAnak + "\n"
                                                   + "                       -------------------------------------- + \n"
                                                   + "  Gaji Kotor          : Rp. "+gajiKotor +"\n"
                                                   + "  Potongan PPh 2.5%   : Rp. "+potonganPPh +"\n"
                                                   + "                       -------------------------------------- - \n"
                                                   + "  Gaji Bersih         : Rp. "+gajiBersih + "\n");
                                
                            }
                            
                            else {
                                System.out.println("Data tidak ditemukan !!!");
                            }
                        
                        break;
                        
                // Error
                    default:
                        System.out.println("Data tidak ditemukan !!!");
                
            }
        
    }
}
