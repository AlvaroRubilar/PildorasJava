package app.poo;

/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        
        Empleados trabajador2 = new Empleados("Ana");

        Empleados trabajador3 = new Empleados("Antonio");

        Empleados trabajador4 = new Empleados("María");
        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
       
        System.out.println(trabajador2.devuelveDatos());
       
        System.out.println(trabajador3.devuelveDatos());

        System.out.println(trabajador4.devuelveDatos());
    }

}

/**
 * InnerPruebas
 */
class Empleados {
    public Empleados(String nom) {

        nombre = nom;
        seccion = "Administración";
        Id=IdSiguiente;
        IdSiguiente++;

    }

    public void cambiaSeccion(String seccion) {// setter

        this.seccion = seccion;

    }

    public String devuelveDatos() {

        return "El nombre es " + nombre + ", la sección es " + seccion + " y el Id = " + Id;
    }

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente=1;

}