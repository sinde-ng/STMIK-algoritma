package Pertemuan5;

import javax.swing.JOptionPane;

/** 
 * @author naufalYafi
 * 20 October 2021
 */

public class MATERI_Javax_Swing {
    
    public static void main(String[] args){
        int A,B,C;
        
        // INPUT
            String strA = JOptionPane.showInputDialog("Nilai A: ");
            String strB = JOptionPane.showInputDialog("Nilai B: ");
        
        // PROSES
            A = Integer.parseInt(strA); // convert String to Integer
            B = Integer.parseInt(strB); // convert String to Integer
            
            C = A + B;
            
        // OUTPUT
            JOptionPane.showMessageDialog(null,"Jumlah : "+A + " + "+B + " = "+C);
    }
}
