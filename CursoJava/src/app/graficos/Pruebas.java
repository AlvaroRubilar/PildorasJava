package app.graficos;

import java.awt.*;
import javax.swing.*;

/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce la fuente");
        boolean estaLaFuente=false;
        String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String nombreDeLaFuente : nombresDeFuentes) {
            estaLaFuente = (nombreDeLaFuente.equals(fuente)) ? true :estaLaFuente;
        }
        System.out.println((estaLaFuente==true)? "Fuente instalada":"No está instalada la fuente");
    }
}