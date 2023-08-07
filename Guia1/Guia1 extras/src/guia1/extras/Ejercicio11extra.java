package guia1.extras;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio11extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
        Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.*/
        Scanner sc = new Scanner(System.in);
        int n, cifras;
        char car;
        do{
            System.out.print("Introduce un número entero: ");
            n = sc.nextInt();
            cifras= 0;    //esta variable es el contador de cifras
            while(n!=0){             //mientras a n le queden cifras
                   n = n/10;         //le quitamos el último dígito
                   cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras+ " cifras");
            System.out.print("Continuar? ");
            car = (char)System.in.read();
        }while(car!='n' && car != 'N');   
    }
 }