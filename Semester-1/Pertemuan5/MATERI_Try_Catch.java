package Pertemuan5;

import java.io.*;

/**
 * @author naufalYafi
 * 20 October 2021
 */

public class MATERI_Try_Catch {
    
    public static void main(String[] args){
        
        // try catch digunakan untuk untuk mengurung eksekusi yang menampilkan error dan dapat membuat program tetap berjalan tanpa dihentikan secara langsung
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Angka : ");
        int data = 0;
        try {
            data = Integer.parseInt(input.readLine());
        }
        catch(IOException e){
            System.out.println("Error!");
        }
            if (data%2==0){
                System.out.println("Bilangan genap : "+data);
            } else {
                System.out.println("Bilangan ganjil : "+data);
            }
    }
}
