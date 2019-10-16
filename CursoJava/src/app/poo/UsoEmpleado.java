package app.poo;

import java.util.*;

/**
 * UsoEmpleado
 */
public class UsoEmpleado {

    public static void main(String[] args) {
        Jefatura jefeRRHH = new Jefatura("Álvaro", 55000, 2006, 9, 25);
        jefeRRHH.estableceIncetivo(2570);

        Empleado misEmpleados[] = new Empleado[6];
        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefeRRHH;// polimorfismo en acción. Principio de sustitución
        misEmpleados[5] = new Jefatura("María", 95000, 1999, 5, 26);

        for (Empleado e : misEmpleados) {

            e.subeSueldo(5);

        }
        for (Empleado e : misEmpleados) {
            //En dame sueldo se usa segun la clase llamado enlazado dinámico
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

        this(nom, 30000, 2000, 01, 01);

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