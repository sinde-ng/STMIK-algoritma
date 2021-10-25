package Pertemuan5;

import java.io.*;

/** 
 * @author naufalYafi
 * 20 October 2021
 */

public class MATERI_Buffered_Reader {
    
    public static void main(String args[]) throws Exception {
    
        /*
        - Deklarasi Objek
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        - Method (Deklarasi)
            int read() = untuk membaca satu karakter
            int read(char[] cbuf, int off, int len) = untuk membaca karakter dengan ukuran tertentu dalam sebuah array 
            boolean markSupported() = untuk memeriksa dukungan input stream terhadap method mark dan reset       
            String readLine() = untuk membaca teks dalam sebuah baris                         
            boolean ready() = untuk menguji input stream yang telah siap untuk dibaca                          
            long skip(long n) = untuk melewati pembacaan sebuah karakter
            void reset() = untuk mengembalikan atau mengukur ulang stream
            void mark(int readAheadLimit) = untuk menandai posisi stream saat ini
            void close() = untuk menutup input stream dan menampilkan beberapa sumber sistem yang tegabung dalam stream
        */
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader userInput = new BufferedReader(input);
        
        System.out.print("Nama : ");
        String nama = userInput.readLine();
        System.out.println("Selamat Datang : "+nama);
    }   

}
