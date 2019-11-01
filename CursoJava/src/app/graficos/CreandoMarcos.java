package app.graficos;
import javax.swing.*;
/**
 * CreandoMarcos
 */
public class CreandoMarcos {

    public static void main(String[] args) {

        MiMarco marco1=new MiMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza  el programa
        
    }
}
class MiMarco extends JFrame{
    public MiMarco(){
        // setSize(500,300);//tamaño
        // setLocation(500,300);//ubicación
        setBounds(500, 300, 250, 250);// x, y , ancho, alto
    }
}