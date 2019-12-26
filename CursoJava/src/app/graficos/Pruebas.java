package app.graficos;
import java.awt.*;
import javax.swing.*;
/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {
        
        String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String nombreDeLaFuente: nombresDeFuentes){
            System.out.println(nombreDeLaFuente);
        }
    }
}