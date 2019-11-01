package app.graficos;
import javax.swing.*;
//import java.awt.Frame;
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
        setBounds(500, 300, 550, 250);// x, y , ancho, alto
        // setResizable(true);//puede cambiar el tamaño de la ventana
       // setExtendedState(Frame.MAXIMIZED_BOTH);//
       setTitle("Mi ventana");//poner título
    }
}