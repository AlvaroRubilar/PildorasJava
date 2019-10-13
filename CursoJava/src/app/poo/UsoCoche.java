package app.poo;

/**
 * UsoCoche
 */
public class UsoCoche {

    public static void main(String[] args) {
       
        Coche miCoche = new Coche();
        miCoche.estableceColor("marrón");
        System.out.println(miCoche.dimeDatosGenerales());
        System.out.println(miCoche.dimeColor());
        miCoche.configuraAsientos("no");
        System.out.println(miCoche.dimeAsientos());
        

    }
}