package app.poo;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.*;

/**
 * PruebaTemporizador
 */
public class PruebaTemporizador {

    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);

    }
}

/**
 * DameLahora
 */
class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 seg: " + ahora);
        Toolkit.getDefaultToolkit().beep();
    }

}