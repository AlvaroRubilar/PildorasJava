package app.graficos;

import javax.swing.JFrame;
import java.awt.*;

/**
 * CreandoMarcoCentrado
 */
public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);

    }
}

class MarcoCentrado extends JFrame {
    public MarcoCentrado() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Marco Centrado");
        Image miIcono =miPantalla.getImage("CursoJava/src/app/graficos/retriever.png");
        setIconImage(miIcono);
    }
}