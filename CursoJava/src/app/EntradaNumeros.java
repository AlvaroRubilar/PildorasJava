package app;

import javax.swing.JOptionPane;

/**
 * EntradaNumeros
 */
public class EntradaNumeros {

    public static void main(String[] args) {
       String num1 = JOptionPane.showInputDialog("Introduce un número");
       double num2 = Double.parseDouble(num1);
       System.out.print("La raiz de "+num2+" es ");
       System.out.printf("%1.4f",Math.sqrt(num2));
    }
}