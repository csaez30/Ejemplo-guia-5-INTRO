package guia1.extras;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio5extra {
    public static void main(String[] args) {
        // Una obra social tiene tres clases de socios:  Los socios tipo ‘A’, B, C
     char tipoSocio;  
     float costo;
        System.out.println("Ingresa el tipo de SOCIO, A, B, o C\n");
        Scanner sc = new Scanner(System.in);
        tipoSocio = sc.next().charAt(0); // lee lee el primer carácter del escáner
        System.out.println("Ingresa el costo del tratamiento (previo al descuento)\n");
        costo = sc.nextFloat();
           switch (tipoSocio) {
               case 'A':
                   System.out.println("El SOCIO es tipo A. Obtiene un 50% de dto. el importe queda en $"+ (costo*0.5));
                   break;
               case 'B':
                   System.out.println("El SOCIO es tipo B. Obtiene un 35% de dto. el importe queda en $"+ (costo*0.35));
                   break;
               case 'C':
                   System.out.println("El SOCIO es tipo C. no tiene descuentos. importe $"+ costo);
                   break;
               default:
                   System.out.println("No existe un valor válido para tipo de SOCIO");
           }
    }
    
}
