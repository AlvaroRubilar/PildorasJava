package app.graficos;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

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
        // File miImagen= new File("CursoJava/src/app/graficos/retriever.png");
        try {
            imagen = ImageIO.read(new File("CursoJava/src/app/graficos/xbox.png"));
            
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
        }
        
        g.drawImage(imagen, 0, 0,null);
        g.copyArea(0, 0, 10  , 10, 150, 75);
        
    }
    private Image imagen;
}