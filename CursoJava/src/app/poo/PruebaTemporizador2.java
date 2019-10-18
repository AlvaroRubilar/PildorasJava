package app.poo;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.*;

/**
 * PruebaTemporizador2
 */
public class PruebaTemporizador2 {

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();
        miReloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");

    }
}

class Reloj {
    
    public void enMarcha(int intervalo,final  boolean sonido){
        // deben ser del tipo final en las clases internas locales
        class DameLaHora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora=new Date();
                System.out.println("Te pongo la hora cada 3 segundos "+ahora);
                if (sonido) {//no está definida en la clase interna puede acceder a las variables 
                    Toolkit.getDefaultToolkit().beep();
                    
                }
            }
        }
        ActionListener oyente= new DameLaHora2();
        Timer miTemporizador =new Timer(intervalo, oyente);
        miTemporizador.start();
    }
    
  
}