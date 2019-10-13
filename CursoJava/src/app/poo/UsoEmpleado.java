package app.poo;


import java.util.*;

/**
 * UsoEmpleado
 */
public class UsoEmpleado {

    public static void main(String[] args) {
        
    }
}

/**
 * Empleado
 */
class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        //cosntructor
        nombre=nom;
        
        sueldo=sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1,dia);
        altaContrato=calendario.getTime();


        
    }

    public String dameNombre() {//getter
        
        return nombre;
        
    }
    public double dameSueldo(){//getter
        
        return sueldo;
    }
    public Date dameFechaContrato(){//getter
       
        return altaContrato;
    }
    public void subeSueldo(double porcentaje){//setter
       
        double aumento= sueldo*porcentaje/100;
        sueldo+=aumento;

    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;

    
}