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
        Reloj miReloj = new Reloj(3000,true);
        miReloj.enMarcha();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");

    }
}

class Reloj {
    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    public void enMarcha(){
        ActionListener oyente= new DameLaHora2();
        Timer miTemporizador =new Timer(intervalo, oyente);
        miTemporizador.start();
    }
    private int intervalo;
    private boolean sonido;
    private class DameLaHora2 implements ActionListener{
        public void actionPerformed(ActionEvent evento){
            Date ahora=new Date();
            System.out.println("Te pongo la hora cada 3 segundos "+ahora);
            if (sonido) {//no está definida en la clase interna puede acceder a las variables 
                Toolkit.getDefaultToolkit().beep();
                
            }
        }
    }
}