package app.graficos;
import java.awt.*;
import javax.swing.*;
/**
 * TrabajandoConFuentes
 */
public class TrabajandoConFuentes {

    public static void main(String[] args) {

        MarcoConFuentes miMarco = new MarcoConFuentes();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
        
    }
}
class MarcoConFuentes extends JFrame{
    public  MarcoConFuentes() {
        setTitle("Pruebas con Fuentes");
        setSize(400,400);
        LaminaConFuentes miLamina = new LaminaConFuentes();
        add(miLamina);
        miLamina.setForeground(Color.BLUE);
    }
}
class LaminaConFuentes extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        Font miFuente = new Font("Courier New",Font.BOLD,26);
        g2.setFont(miFuente);
        
        g2.drawString("Alvaro", 100, 100);

        g2.setFont(new Font("Arial",Font.ITALIC,24));
        
        g2.drawString("Curso de Java", 100, 200);
        
    }
}