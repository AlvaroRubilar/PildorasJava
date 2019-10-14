package app.poo;

import java.util.*;

/**
 * UsoEmpleado
 */
public class UsoEmpleado {

    public static void main(String[] args) {

        Empleado misEmpleados[] = new Empleado[4];
        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado("Antonio Fernández");
        for (Empleado e : misEmpleados) {

            e.subeSueldo(5);

        }
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() + "\nSueldo: " + e.dameSueldo() + "\nFecha de Alta: "
                    + e.dameFechaContrato() + "\n");
        }
    }
}

/**
 * Empleado
 */
class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        // constructor
        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

        ++Idsiguiente;
        Id = Idsiguiente;

    }

    public Empleado(String nom) {// constructor

        this(nom, 3000, 2000, 01, 01);

    }

    public String dameNombre() {// getter

        return nombre + " \nId: " + Id;

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

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int Idsiguiente;
    private int Id;

}

/**
 * Jefatura
 */
class Jefatura extends Empleado {
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {

        super(nom, sue, agno, mes, dia);

    }

    public void estableceIncetivo(double b) {

        incentivo = b;

    }

    public double dameSueldo() {

        double sueldoJefe = super.dameSueldo();// machacando el método

        return sueldoJefe + incentivo;
    }

    private double incentivo;

}