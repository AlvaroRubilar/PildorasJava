package app.graficos;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.geom.*;
/**
 * TrabajandoColores
 */
public class TrabajandoColores {
    public static void main(String[] args) {
        MarcoConColor miMarco = new MarcoConColor();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConColor extends JFrame {
    public MarcoConColor() {

        setTitle("Prueba de Dibujo");

        setSize(400, 400);

        LaminaConColor miLamina = new LaminaConColor();

        add(miLamina);

    }
}

class LaminaConColor extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.BLUE.darker());
        g2.fill(rectangulo);

        Ellipse2D elipse=new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        g2.setPaint(new ColorUIResource(153, 204, 255).brighter());
        
        g2.fill(elipse);
        
        

    }
}
