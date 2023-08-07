package ejercicios6;

import java.util.Scanner;
/**
 * @author juanj
 */
public class Ejercicios6a8 {
    public static void main(String[] args) {
      ejercicio6();
      ejercicio7();       
      ejercicio8();       
    }
    public static void ejercicio6(){
    /* Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla */
        int num1, num2;
        System.out.println("Ingrese dos numeros iguales o distintos...");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2= sc.nextInt();
        if (num1>num2)
            System.out.println("El mayor de ambos es "+ num1);
        else if (num2>num1)
            System.out.println("De los 2, el mayor es "+ num2);
        else
             System.out.println("Es que ambos numeros son iguales!!!");         
    }
    public static void ejercicio7(){
    /*Crear un programa que dado un numero determine si es par o impar*/
        int num;
        System.out.println("Ingrese un numero...");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num%2==0)
            System.out.println("Es PAR este numero ");
        else
            System.out.println("Este numero es IMPAR!");  
    }
    public static void ejercicio8(){
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.*/
        String palabra;
        System.out.println("Cual es la palabra elegida...?");
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        if (palabra.equals("eureka"))
            System.out.println("eureka!! digo CORRECTOOO!");
        else 
            System.out.println("Emm...no es correcto lo que escribes");
    }
}
