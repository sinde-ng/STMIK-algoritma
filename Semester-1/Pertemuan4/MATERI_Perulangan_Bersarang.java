package Pertemuan4;

/** 
 * @author naufalYafi
 * 07 October 2021
 */

public class MATERI_Perulangan_Bersarang {
    
    public static void main(String[] args){
        
        int batas=6, counter=0, faktorial=1;
        
        for(counter=0; counter<=batas; counter++){
            
            faktorial = 1;
            
                for(int faktor=2; faktor<=counter; faktor++){
                    faktorial *= faktor;
                }
            System.out.println(counter + "!" + " = " + faktorial);
            
        }
        
    }
    
}
