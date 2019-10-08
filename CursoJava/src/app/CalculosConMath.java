package app;

/**
 * CalculosConMath
 */
public class CalculosConMath {

    public static void main(String[] args) {
        // refundición de variable
        double base = 5;
        double exponente = 3;

        int resultado = (int) Math.pow(base, exponente);
        System.out.println("El resultado de " + (int)base + " elevado a " + (int)exponente + " es " + resultado);
    }
}