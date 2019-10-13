package app.poo;

/**
 * Coche
 */
public class Coche {

    private int largo;
    private int ancho;
    private int motor;
    private int ruedas;
    private int pesoPlataforma;
    String color;
    int pesoTotal;
    boolean asientosCuero, climatizador;

    // método constructor
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String dimeLargo() {// getter

        return "El largo del coche es " + largo;

    }

    public void estableceColor() {//setter
        color = "Azul";

    }
    public String dimeColor() {

        return "El color del coche es "+color;
        
    }

}