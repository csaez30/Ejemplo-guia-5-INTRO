package guia1.extras;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio1extra {
      public static void main(String[] args) {
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas*/
        int minutos;
        System.out.println("Ingrese los minutos y tendra su equivalente...");
        Scanner sc = new Scanner(System.in);
        minutos = sc.nextInt();
        System.out.println("El equivalente en horas es: "+ (minutos/60));
        System.out.println("El equivalente en dias es: "+ (minutos/60/24));
        
    }
    
}
