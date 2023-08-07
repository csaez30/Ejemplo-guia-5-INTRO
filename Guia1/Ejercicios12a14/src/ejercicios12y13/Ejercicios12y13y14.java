package ejercicios12y13;
import java.util.Scanner;
/**
  * @author juanj
 */
public class Ejercicios12y13y14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ejercicio12();
         ejercicio13();       
         ejercicio14();       
    }
    public static void ejercicio12(){
    /* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta. */
        float nota;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese una nota valida (entre 0 y 10,0) ");
            nota = sc.nextFloat();
        } while (nota<0 || nota >10);
        
        System.out.println("La nota " + nota+ " es valida.");
       
    }
    public static void ejercicio13(){
    /*  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario 
        hasta que la suma de los números introducidos supere el límite inicial.*/
        int limite, num, suma=0;
        System.out.println("Ingrese el limite de la suma...");
        Scanner sc = new Scanner(System.in);
        limite = sc.nextInt();
        System.out.println("Ahora ingrese numeros positivos a sumar...");
        do {
            num = sc.nextInt();
            if (num>0)
               suma += num;
            else 
                System.out.println("ese numero no fue sumado..."); 
            System.out.println("sumado hasta ahora: "+ suma); 
        } while (suma<limite);
        System.out.println("Se llego al limite con "+ suma); 
    }      
     public static void ejercicio14(){
    /* web para una empresa que fabrica motores*/
        int a, b, opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: \n");
        a = sc.nextInt();
        b = sc.nextInt();
        do {
           System.out.println("---Ingrese una opcion de calculo--- \n"+ 
           "MENU\n " + "1. SUMAR\n " + "2. RESTAR\n " + "3. DIVIDIR\n " + "4. MULTIPLICAR\n " + "5.SALIR");
                                                   
           opcion = sc.nextInt();
           switch (opcion) {
               case 1:
                   System.out.println("se sumaron> "+ (a+b));
                   break;
               case 2:
                   System.out.println("se restan > "+ (a-b));
                   break;
               case 3:
                   System.out.println("se dividen > "+ (a/b));
                   break;
               case 4:
                   System.out.println("se multiplican> "+ (a*b));
                   break;
               case 5:
                   System.out.println("Salir... adios!");
                   break;
               default:
                   System.out.println("No es una opcion valida...");
           }
        } while (opcion!=5);
    }
}
