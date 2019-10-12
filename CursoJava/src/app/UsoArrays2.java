package app;

import javax.swing.JOptionPane;

/**
 * UsoArrays2
 */
public class UsoArrays2 {

    public static void main(String[] args) {
        String paises[] = new String[8];

        for (int i = 0; i < paises.length; i++) {
            paises[i]=JOptionPane.showInputDialog("Introduce País " +(i+1));
            
        }
        
       
        for (String elemento : paises) {
            System.out.println("País "+elemento);
            
        }
    }
}