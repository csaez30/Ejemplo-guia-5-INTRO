package guia1.extras;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio3extra {
 public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una 
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */
        String letra;
        System.out.println("Digite una letra, veremos si es vocal: \n");
        Scanner sc = new Scanner(System.in);
        letra = sc.next();
        if (letra.substring(0,1).equalsIgnoreCase("a")|| letra.substring(0,1).equalsIgnoreCase("e") || letra.substring(0,1).equalsIgnoreCase("i")|| 
               letra.substring(0,1).equalsIgnoreCase("o") || letra.substring(0,1).equalsIgnoreCase("u"))
            System.out.println("SE TRATA DE UNA VOCAL");
        else 
            System.out.println("Emm...no es vocal esta letra");
    }
}