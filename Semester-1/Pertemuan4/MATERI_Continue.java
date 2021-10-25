package Pertemuan4;

import java.io.*;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class MATERI_Continue {

    public static void main(String[] args) throws IOException {
        
        BufferedReader 
                isi = new
            BufferedReader(new InputStreamReader(System.in));
        
        try{
            
            int i=1,n,t=0,r,count=0;
            
            while(i<=5){
                
                System.out.print("n : ");
                n = Integer.parseInt(isi.readLine());
                
                if (n<60)
                    continue;
                    t=t+n;
                    count++;
                    i++;
            }
            
            r = t/count;
            System.out.println("Rata - rata : "+r);
        }
        
        catch (Exception a){
            
            System.out.println("Error : "+a);
            
        }
        
    }
    
}
