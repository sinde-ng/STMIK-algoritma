package Pertemuan6;

import java.io.*;

/** 
 * @author naufalYafi
 * 25 October 2021
 */

public class LATIHAN_Array {
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nim = new String[2];
        String[] nama = new String[2];
        int[] nilai = new int[2];
        int[] jumlah = new int[2];
        int i,x;
        
        for(i=0;i<=1;i++){
            x=i+1;
            System.out.print(x +". Masukkan Nama : ");
                nama[i] = input.readLine();
            System.out.print("   Masukkan NIM : ");
                nim[i] = input.readLine();
            System.out.print("   Masukkan Nilai : ");
                nilai[i] = Integer.parseInt(input.readLine());
        }
        
        System.out.println("--- Output ---");
        
        for(i=0;i<=1;i++)
        {   x=i+1;
            System.out.println("=== Input ke -"+x + " ===");
            System.out.println("Nama : "+nama[i]);
            System.out.println("NIM : "+nim[i]);
            System.out.println("Nilai : "+nilai[i]);
        }
        
    }
}
