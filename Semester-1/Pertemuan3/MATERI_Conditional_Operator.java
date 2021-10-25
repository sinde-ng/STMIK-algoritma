package Pertemuan3;

import javax.swing.*;

/**
 * @author naufalYafi
 * 05 October 2021
 */

public class MATERI_Conditional_Operator {

    public static void main(String[] args){
        
        String a = JOptionPane.showInputDialog("Masukkan Nilaimu!");
    
        int nilai =  Integer.parseInt(a);
        
        JOptionPane.showMessageDialog(null,
                nilai>60?"Selamat":"Maaf","Hasil",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    
    } 
}
