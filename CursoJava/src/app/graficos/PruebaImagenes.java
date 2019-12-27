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

class MarcoImagen extends JFrame {
    public MarcoImagen() {
        setTitle("Marco con Imagen");
        setBounds(500, 300, 300, 200);
        LaminaConImagen miLamina = new LaminaConImagen();
        add(miLamina);

    }
}

class LaminaConImagen extends JPanel {

    public LaminaConImagen() {

        try {
            imagen = ImageIO.read(new File("CursoJava/src/app/graficos/retriever.png"));

        } catch (IOException e) {
            System.out.println("La imagen no se encuentra");
            // File miImagen= new File("CursoJava/src/app/graficos/retriever.png");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 200; j++) {

                if (i + j > 0) {
                    g.copyArea(0, 0, anchuraImagen, alturaImagen, i * anchuraImagen, j * alturaImagen);
                }
            }
        }

    }

    private Image imagen;
}