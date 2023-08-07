package helloworld;

import java.util.Scanner;
/**
 *
 * @author juanj
 */
public class Ejercicio1a5 {
    public static void main(String[] args) {
      ejercicio1();
      ejercicio2();       
      ejercicio3();       
      ejercicio4();        
      ejercicio5();
    }
    public static void ejercicio1(){
    /* Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma */
        int num1, num2;
        System.out.println("Ingrese dos numeros para sumar...");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        num2= sc.nextInt();
        //int suma = num1+num2;  opcional
        System.out.println("La suma de los numeros "+ num1+ " y "+ num2 +" es " + (num1+num2));
    }
    public static void ejercicio2(){
    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla*/
        String nombre;
        System.out.println("Cual es tu nombre?");
        Scanner sc = new Scanner(System.in);
        nombre = sc.next();
        System.out.println("Tu nombre es "+ nombre);
    }
    public static void ejercicio3(){
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas.*/
        String frase;
        System.out.println("Escribi una frase...");
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        System.out.println("La frase en MAYUS es "+ frase.toUpperCase());
        System.out.println("La frase en MINUS es "+ frase.toLowerCase());     
    }
    public static void ejercicio4(){
    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
        float celcius, Farenheit;
        System.out.println("Ingresa los grados Celcius a convertir: ");
        Scanner sc = new Scanner(System.in);
        celcius = sc.nextFloat();
        Farenheit = 32 + (9 * celcius / 5);
        System.out.println("En Celcius "+ celcius+ " grados, corresponden a "+
                Farenheit +" grados F ");
    }
     public static void ejercicio5(){
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt() */
        int numero;
        System.out.println("Ingresa un numero por favor: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        System.out.println("El doble de "+numero+ " es "+ numero*2);
        System.out.println("El triple del "+numero+ " es "+ numero*3);
        System.out.println("El raiz cuadrada de "+numero+ " es "+ Math.sqrt(numero));
    }
}
