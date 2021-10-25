package Pertemuan4;

import java.io.*;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class Materi_Jump {

    public static void main(String[] args){
    
        BufferedReader 
                isi = new
            BufferedReader(new InputStreamReader(System.in)); 
        
        try {
        
            int n,t;
            t=0;
            
            while(true){
                System.out.print("t = ");
                n=Integer.parseInt(isi.readLine());
                
                t=t+n;
                
                if(t>=50)
                    break;
            
            }
            
            System.out.println(t);
            
        }
        
        catch (Exception e){
            System.out.println("salah : "+e);
        }
        
    }
    
}
