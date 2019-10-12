package app;
import javax.swing.JOptionPane;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        double resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número"));
        for (int i = numero; i > 0; i--) {
            resultado *=  i;

        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}