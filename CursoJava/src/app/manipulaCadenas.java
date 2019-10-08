package app;

/**
 * manipulaCadenas
 */
public class manipulaCadenas {

    public static void main(String[] args) {
        String nombre = "Álvaro";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es "+ nombre.charAt(0));
        int ultimaLetra = nombre.length();
        System.out.println("La última letra es la " + nombre.charAt(ultimaLetra-1));
    }
}