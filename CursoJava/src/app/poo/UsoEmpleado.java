package app.poo;

import java.util.*;

/**
 * UsoEmpleado
 */
public class UsoEmpleado {

    public static void main(String[] args) {
        
        //   Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        //   Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02); Empleado
        //   empleado3 = new Empleado("María Martín", 10500, 2002, 03, 15);
          
        //   empleado1.subeSueldo(5); empleado2.subeSueldo(5); empleado3.subeSueldo(5);
          
        //   System.out.println("Nombre: "+
        //   empleado1.dameNombre()+"\nSueldo: "+empleado1.dameSueldo()
        //   +"\nFecha de Alta: "+empleado1.dameFechaContrato());
        //   System.out.println("Nombre: "+
        //   empleado2.dameNombre()+"\nSueldo: "+empleado2.dameSueldo()
        //   +"\nFecha de Alta: "+empleado2.dameFechaContrato());
        //  System.out.println("Nombre: "+
        //  empleado3.dameNombre()+"\nSueldo: "+empleado3.dameSueldo()
        //  +"\nFecha de Alta: "+empleado3.dameFechaContrato());
         
        Empleado misEmpleados[] = new Empleado[3];
        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
        for (int i = 0; i < 3; i++) {
            misEmpleados[i].subeSueldo(5);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: "+misEmpleados[i].dameNombre()+"\nSueldo: "+misEmpleados[i].dameSueldo()+"\nFecha de Alta: "+misEmpleados[i].dameFechaContrato()+"\n");
        }
    }
}

/**
 * Empleado
 */
class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        // cosntructor
        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();

    }

    public String dameNombre() {// getter

        return nombre;

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

}