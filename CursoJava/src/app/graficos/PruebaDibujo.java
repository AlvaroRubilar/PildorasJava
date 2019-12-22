package app.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * PruebaDibujo
 */
public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos miMarco = new MarcoConDibujos();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConDibujos extends JFrame {
    public MarcoConDibujos() {

        setTitle("Prueba de Dibujo");

        setSize(400, 400);

        LaminaConFiguras miLamina = new LaminaConFiguras();

        add(miLamina);

    }
}

class LaminaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);

    }
}