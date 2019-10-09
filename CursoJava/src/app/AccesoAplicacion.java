package app;

import javax.swing.JOptionPane;

/**
 * AccesoAplicacion
 */
public class AccesoAplicacion {

    public static void main(String[] args) {

        String clave = "Alvaro";
        String pass = "";

        while (clave.equals(pass) == false) {

            pass=JOptionPane.showInputDialog("Intoduce la contraseña, por favor");
            if(clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }
            

        }
        System.out.println("Contraseña correcta. Acceso permitido");

    }
}