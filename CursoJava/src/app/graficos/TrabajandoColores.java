package app.graficos;
import javax.swing.*;


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
        miLamina.setBackground(Color.PINK);

    }
}

class LaminaConColor extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        
        g2.setPaint(Color.BLUE);
        g2.fill(rectangulo);
        g2.setPaint(Color.MAGENTA);
        g2.draw(rectangulo);

        Ellipse2D elipse=new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        Color miColor = new Color(125,189,200);
        g2.setPaint(miColor);
        
        g2.fill(elipse);
        
        

    }
}
