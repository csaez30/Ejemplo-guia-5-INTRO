package guia1.extras;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio7extra {
    public static void main(String[] args) {
     /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
    El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/
     int cant, i = 0; int num, mayor=0, menor=9999; 
        System.out.println("CUANToS Numeros seran?");
        Scanner sc = new Scanner(System.in);
        cant = sc.nextInt(); 
        float promedio=0;   
            
        while (i < cant) {
            System.out.println("Ingresa el numero "+(i+1)+": ");
            num = sc.nextInt();
            if (num >0 ){
                    if (num<menor) menor=num;
                    if (num>mayor) mayor=num;
                promedio+=num;
                i++;
            }else{
                System.out.println("No se tendra en cuenta estE NUMERO, es NEGATIVO!!");
            }
        }
        System.out.println("El promedio de numeros fue: "+ (promedio/cant));
        System.out.println("El Mayor fue "+ mayor+ " y el menor era "+menor);
    }  
}
