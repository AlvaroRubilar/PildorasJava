package app.poo;

/**
 * UsoCoche
 */
public class UsoCoche {

    public static void main(String[] args) {
       
        Coche miCoche = new Coche();
        miCoche.estableceColor("amarillo");
        
        System.out.println(miCoche.dimeColor());
       
        

    }
}