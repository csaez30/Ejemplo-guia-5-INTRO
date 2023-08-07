package guia1.extras;
import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio9extra {
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo, divisor, cociente = 0;
        System.out.println("ingresa el dividendo (numero a dividir)");
        Scanner sc = new Scanner(System.in);
        dividendo = sc.nextInt(); 
        System.out.println("entre cuantos? (numero divisor)");
        divisor = sc.nextInt(); 
        while (dividendo >0) {
            cociente++;
            dividendo = dividendo-divisor;  // restas mediante un bucle						
        } 
        System.out.println("Cociente " + cociente);
        System.out.println("Resto " + (-dividendo));
    }  
}
/*13/2
13 - 2 = 11
11 - 2 = 9
9 - 2 = 7
7 - 2 = 5
5 - 2 = 3
3 - 2 = 1
1 - 1 = -1*/