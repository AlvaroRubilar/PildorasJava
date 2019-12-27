package app.graficos;
import java.awt.*;
import javax.swing.*;
/**
 * PruebaImagenes
 */
public class PruebaImagenes {

    public static void main(String[] args) {

        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        
    }
}
class MarcoImagen extends JFrame{
    public  MarcoImagen() {
        setTitle("Marco con Imagen");
        setBounds(500, 300, 300, 200);
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);
        
    }
}
class LaminaConImagen extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
    }
}