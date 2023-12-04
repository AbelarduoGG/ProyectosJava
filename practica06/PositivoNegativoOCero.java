/*
6. Realizar un sistema en diagrama de flujo que solicite al usuario un número entero, con base en 
el número ingresado imprimir en pantalla si el número es positivo, negativo ó cero.
Abel Isai Vargas Rodríguez
 */
package practica06;

import java.util.Scanner;

public class PositivoNegativoOCero {
    
    public static void main(String[]args){
        
     Scanner teclado = new Scanner(System.in);
     
     double numero;
     
     System.out.println("Ingresa el número ");
      numero = teclado.nextDouble();  
        
      if(numero>0){
          System.out.println("El número es positivo ");
      }
      
      if(numero<0){
       System.out.println("El numero es negativo");
    }
      
      if(numero==0){
          System.out.println("El numero es cero");
      }
        
    }
}
