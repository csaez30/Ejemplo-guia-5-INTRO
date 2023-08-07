package guia1.extras;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio6extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.*/
        int cant, i = 0; float altura;
        System.out.println("CUANTAS personas mediremos??\n");
        Scanner sc = new Scanner(System.in);
        cant = sc.nextInt(); 
        float promedio =0; 
        int petizos =0;    
        while (i < cant) {
            System.out.println("Ingresa la altura de la persona(Use coma! (NO punto))");
            altura = sc.nextFloat();
            if (altura >0 ){
                    if (altura<1.6) petizos+=1;
                promedio+=altura;
                i++;
            }else{
                System.out.println("No se tendra en cuenta esta altura, es NEGATIVA");
            }
        }
        System.out.println("El promedio de alturas fue: "+ (promedio/cant));
        System.out.println("La cantidad de personas por debajo de 1,60mts fueron: "+ petizos);
    }
}
