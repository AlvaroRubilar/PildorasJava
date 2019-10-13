package app.poo;

/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco", 1);
        Empleados trabajador2 = new Empleados("Ana", 1);
        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }

}

/**
 * InnerPruebas
 */
class Empleados {
    public Empleados(String nom, int Id) {

        nombre = nom;
        seccion = "Administración";
        this.Id = Id;

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

}