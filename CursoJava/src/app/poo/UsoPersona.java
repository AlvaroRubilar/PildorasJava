package app.poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * UsoPersona
 */
public class UsoPersona {

    public static void main(String[] args) {
        Persona lasPersonas[]=new Persona[2];
        lasPersonas[0]=new Empleado2("Luis Conde", 50000, 2099, 2, 25);
        lasPersonas[1]=new Alumno("Ana López", "Biológicas");
        for (Persona p : lasPersonas) {
            System.out.println(p.dameNombre()+" , "+p.dameDescripcion());

            
        }
    }
}

/**
 * Persona
 */
abstract class Persona {

    public Persona(String nom) {
        nombre = nom;
    }

    public String dameNombre() {
        return nombre;
    }

    public abstract String dameDescripcion();// diseño herencia

    private String nombre;

}

class Empleado2 extends Persona {

    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        // constructor
        super(nom);
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

        ++Idsiguiente;
        Id = Idsiguiente;

    }

    
    public String dameDescripcion() {
        
        return "Es empleado tiene un ID: " + Id + " con un sueldo de " + sueldo;
    }

    public double dameSueldo() {// getter

        return sueldo;
    }

    public Date dameFechaContrato() {// getter

        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {// setter

        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    private double sueldo;
    private Date altaContrato;
    private static int Idsiguiente;
    private int Id;

}



/**
 * Alumno
 */
class Alumno extends Persona {
    public Alumno(String nom, String car) {

        super(nom);
        carrera = car;
    }
    
    public String dameDescripcion() {
        
        return "Este Alumno está estudiando la carrera de "+carrera;
    }
    private String carrera;

}