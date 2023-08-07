package guia1.extras;

import java.util.Scanner;
/**
 * @author juanj
 */
public class Ejercicio4extra {
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano*/
  /*Para la notación moderna de los números romanos se utilizan las siguientes normas:
Los números se leen de izquierda a derecha empezando por los símbolos con mayor valor, o conjunto de símbolos de mayor valor.
Un símbolo seguido de otro de igual o inferior valor, suma (p. ej., X·X·I = 10+10+1 = 21), mientras que si está seguido de otro 
de mayor valor, ambos símbolos forman un conjunto en el cual debe restarse el valor del primero al valor del siguiente 
        (p. ej., X·IX = 10+(10-1) = 19).
La unidad (I) y los números con base 10 (X, C y M) pueden repetirse hasta 3 veces consecutivas como sumandos.
Los números con base 5 (V, L y D), no pueden repetirse seguidos, ya que la suma de esos dos símbolos tiene representación con alguno 
de los símbolos anteriores.
La unidad y los símbolos de base 10 también pueden estar restando antes de un símbolo de mayor valor, pero con las siguientes normas:
Sólo pueden aparecer restando sobre los símbolos con base 5 y 10 de valor inmediatamente superior, pero no de otros con valores más altos 
   (p. ej., 'IV', 'IX' o 'XC', pero no 'IL' ni 'IC' ni 'XM').
En el caso de estar restando, no pueden repetirse.
Los símbolos con base 5 no pueden utilizarse para restar (p. ej., 45 se escribe 'XLV' y no 'VL').
      I=1 V=5 X=10 L=50 C=100 D=500 M=1000  */      
      System.out.println("Pone un numero positivo, te lo cambio a ROMANO...");
      Scanner sc = new Scanner(System.in);
      int N;
      do {
             System.out.print("QUE SEA un número entre 1 y 3999: ");
             N = sc.nextInt();
      } while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));                            
  }

  //método para pasar a números romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      
      //obtenemos cada cifra del número
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

      //millar
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }

      //centenas
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                 romano = romano + "D";
                 for (i = 6; i <= centenas; i++) {
                      romano = romano + "C";
                 }
      } else if (centenas == 4) {
                 romano = romano + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      romano = romano + "C";
             }
      }

      //decenas
      if (decenas == 9) {
          romano = romano + "XC";
      } else if (decenas >= 5) {
                 romano = romano + "L";
                 for (i = 6; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      } else if (decenas == 4) {
                 romano = romano + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      }

      //unidades
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  
    }
    
}
