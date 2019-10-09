package app;

import javax.swing.JOptionPane;

/**
 * EntradaEjemplo2
 */
public class EntradaEjemplo2 {

    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
        int edadUsuario = Integer.parseInt(edad);
        edadUsuario++;
        System.out.println("Hola " + nombreUsuario + " el año que que viene tendrás " + edadUsuario + " años");
    }
}