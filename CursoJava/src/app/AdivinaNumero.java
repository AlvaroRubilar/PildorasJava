package app;

import java.util.Scanner;

/**
 * AdivinaNumero
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int aleatorio = (int)Math.round(Math.random()*100);
        int numero=0, intentos=0;
       do {
            intentos++;
            System.out.println("Introduce un número, por favor");
            numero = entrada.nextInt();
            if(numero>aleatorio){
                System.out.println("Más bajo");
            }else if (numero<aleatorio) {
                System.out.println("Más alto");
                
            } 
            
        }while(numero!=aleatorio)
        System.out.println("Correcto el número es "+ aleatorio + " en "+intentos+" intentos.");
        entrada.close();
    }
}