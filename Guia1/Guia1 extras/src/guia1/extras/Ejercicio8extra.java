package guia1.extras;


import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Ejercicio8extra {
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y 
mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. */
        int cant=0, num, pares=0, impares=0; 
        Scanner sc = new Scanner(System.in);
        float promedio=0;   
        do {
            System.out.println("Ingresa el numero "+(cant+1)+": ");
            num = sc.nextInt();
            if (num >0 ){
                if (num%2==0) pares++;
                else impares++;
                promedio+=num;
                cant++;
            }else{
                System.out.println("No se tendra en cuenta estE NUMERO, es NEGATIVO!!");
            }
        } while (num%5!=0 && num!=0);
        System.out.println("El promedio de numeros fue: "+ (promedio/cant));
        System.out.println("Los pares fueron "+ pares+ " y hubieron "+impares+" impares.");
    }   
}