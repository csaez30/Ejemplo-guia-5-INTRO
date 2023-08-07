package ejercicios9a11;
import java.util.Scanner;
/**
 * @author juanj
 */
public class Ejercicios9a11 {
public static void main(String[] args) {
     // ejercicio9();
      ejercicio10();       
     // ejercicio11();       
    }
    public static void ejercicio9(){
    /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. */
        String palabra;
        System.out.println("Introduzca una palabra de 8 letras: \n");
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        if (palabra.length()==8)
            System.out.println("CORRECTO, tu palabra tiene el largo perfecto");
        else 
            System.out.println("Absolutamente INCORRECTO...tiene "+palabra.length()+" letras!");       
    }
  
    public static void ejercicio10(){
    /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java*/
        String palabra;
        System.out.println("Introduzca una palabra con 'A': \n");
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        System.out.println("devuel " +palabra.substring(0,3));
        if ( palabra.substring(0,1).equalsIgnoreCase("a")) //esta 2da parte bastaria
            System.out.println("CORRECTO, tu palabra EMPIEZA con 'A'");
        else if (palabra.contains("A") || palabra.contains("a"))
            System.out.println("Esta MAL, PERO no tan MAL...tiene una 'A'!"); 
        else
            System.out.println("INCORRECTO...ni siquiera hay una 'A'!"); 
    }
       public static void ejercicio11(){
    /* web para una empresa que fabrica motores*/
        int tipoMotor;
        System.out.println("Ingresa el tipo de Motor, entre 1 y 4: 3\n");
        Scanner sc = new Scanner(System.in);
        tipoMotor = sc.nextInt();
           switch (tipoMotor) {
               case 1:
                   System.out.println("La bomba es una bomba de agua");
                   break;
               case 2:
                   System.out.println("La bomba es una bomba de gasolina");
                   break;
               case 3:
                   System.out.println("La bomba es una bomba de hormigon");
                   break;
               case 4:
                   System.out.println("La bomba es una bomba de pasta alimenticia");
                   break;
               default:
                   System.out.println("No existe un valor válido para tipo de bomba");
           }
    }
}