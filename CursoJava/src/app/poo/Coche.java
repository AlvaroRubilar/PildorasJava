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
    private String color;
    private int pesoTotal;
    private boolean asientosCuero, climatizador;

    // método constructor
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String dimeDatosGenerales() {// getter

        return "La plataforma del vehículo tiene "+ruedas+" ruedas "+". Mide "+largo/1000+" metros con un ancho de "+ ancho +" cm y un peso de plataforma de "+pesoPlataforma+" Kg";

    }

    public void estableceColor(String colorCoche) {//setter
        color = colorCoche;

    }
    
    public String dimeColor() {//getter

        return "El color del coche es "+color;
        
    }
    public void configuraAsientos(String asientosCuero){//setter
        this.asientosCuero=asientosCuero.equalsIgnoreCase("si")? true:false;
        //operador ternario
        

    }
    public String dimeAsientos() {//getter
        return asientosCuero? "El coche tiene asientos de cuero":"El coche tiene asientos de serie";
        
    }


}