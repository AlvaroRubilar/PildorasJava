package app.poo;

/**
 * UsoVehiculo
 */
public class UsoVehiculo {

    public static void main(String[] args) {

        Coche miCoche1 = new Coche();

        miCoche1.estableceColor("rojo");
        Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

        miFurgoneta1.estableceColor("azul");

        miFurgoneta1.configuraAsientos("si");

        miFurgoneta1.configuraClimatizador("si");

        System.out.println(miCoche1.dimeDatosGenerales() + ". " + miCoche1.dimeColor());

        System.out.println(miFurgoneta1.dimeDatosGenerales() + ". " + miFurgoneta1.dimeDatosFurgoneta());
    }
}