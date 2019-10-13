package app.poo;

/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        trabajador1.cambiaSeccion("RRHH");
      
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }

}

/**
 * InnerPruebas
 */
class Empleados {
    public Empleados(String nom) {

        nombre = nom;
        seccion = "Administración";

    }

    public void cambiaSeccion(String seccion) {// setter

        this.seccion = seccion;

    }

   

    public String devuelveDatos() {

        return "El nombre es " + nombre + " y la sección es " + seccion;
    }

    private final String nombre;
    private String seccion;

}