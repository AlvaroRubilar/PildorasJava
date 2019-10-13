package app.poo;

/**
 * UsoCoche
 */
public class UsoCoche {

    public static void main(String[] args) {
       
        Coche Renault = new Coche();// Instanciar una clase. Ejemplar de clase
       
        Renault.ruedas = 3; // Debemos encapsular esta variable
       
        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");

    }
}