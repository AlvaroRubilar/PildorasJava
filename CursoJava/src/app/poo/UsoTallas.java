package app.poo;

import java.util.Scanner;

/**
 * UsoTallas
 */
public class UsoTallas {

    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private Talla(String abreviatura) {// enum solo permite private
            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura() {
            return abreviatura;
        }

        private String abreviatura;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una talla: MINI, MEDIANO,  GRANDE, MUY_GRANDE");
        String entradaDatos = entrada.next().toUpperCase();
        Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);// ingresa al enum
        System.out.println("Talla = " + laTalla);
        System.err.println("Abreviatura = " + laTalla.dameAbreviatura());
        entrada.close();

    }
}