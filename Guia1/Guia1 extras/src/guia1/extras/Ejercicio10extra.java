package guia1.extras;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio10extra {
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10*/
        Scanner miScanner = new Scanner(System.in);
        int numElegido;
        int numIntentos = 0;
        //Uso del método estático random de la clase Math y asignar el 
        //valor aleatorio a la variable entera aleatorio.
        int aleatorio1 =(int) (Math.random()* 10 + 1);  //devuelve un valor de tipo double 
        int aleatorio2 =(int) (Math.random()* 10 + 1);
        int aleatorio = aleatorio1*aleatorio2;
        //El número escrito se almacena en la variable numElegido y aumenta
        //en 1 el número de intentos.
        System.out.print("Escriba el número: ");
        numElegido = miScanner.nextInt();
        numIntentos++;
        //Bucle while que se repetirá si el número elegido es distinto al 
        //número generado aleatoriamente
        //Aumenta el número de intentos en 1 y muestra de nuevo el mensaje
        //y almacena el nuevo valor en la variable numElegido
        while(numElegido != aleatorio){
            numIntentos++;
            if(numElegido > aleatorio) System.out.println("Es un numero mas bajo...");
            else System.out.println("Es un numero mas alto...");
            System.out.println("Has fallado!!!, Inténtalo de nuevo");
            System.out.print("Escriba el número: ");
            numElegido = miScanner.nextInt();
        }
        
        System.out.println("Enhorabuena, has acertado el número al " +
                "intento número " + numIntentos);
    }
    
}
