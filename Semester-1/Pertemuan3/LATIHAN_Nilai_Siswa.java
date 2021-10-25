package Pertemuan3;

import java.util.*;

/** 
 * @author naufalYafi
 * 06 September 2021
 */

public class LATIHAN_Nilai_Siswa {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String nama,grade;
        int nilaiResponsi,nilaiTugas,nilaiUjian,nilaiAkhir;
        
        System.out.println("--- Program Hitung Nilai Akhir ---");
        
        System.out.print("Nama Mahasiswa : ");
        nama = input.next();
        
        System.out.print("Nilai Responsi : ");
        nilaiResponsi = input.nextInt();
        
        System.out.print("Nilai Tugas : ");
        nilaiTugas = input.nextInt();
        
        System.out.print("Nilai Ujian Tengah Semester : ");
        nilaiUjian = input.nextInt();
        
        nilaiResponsi = (nilaiResponsi*20)/100;
        nilaiTugas = (nilaiTugas*30)/100;
        nilaiUjian = (nilaiUjian*50)/100;
        nilaiAkhir = nilaiResponsi+nilaiTugas+nilaiUjian;
        
        if (nilaiAkhir >= 90){
            grade = "A";
        }
        else if (nilaiAkhir >= 80){
            grade = "B";
        }
        else if (nilaiAkhir >= 70){
            grade = "C";
        }
        else if (nilaiAkhir >= 60){
            grade = "D";
        }
        else{
            grade = "E";
        }
        
        System.out.println("--- Hasil ---");
        System.out.print("Nama                        : "+nama +"\n"
                       + "Nilai Responsi              : "+nilaiResponsi +"\n"
                       + "Nilai Tugas                 : "+nilaiTugas +"\n"
                       + "Nilai Ujian Tengah Semester : "+nilaiUjian +"\n"
                       + "Nilai Akhir                 : "+nilaiAkhir +"\n"
                       + "Grade                       : "+grade +"\n");
        
    }
}
