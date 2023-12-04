/*
5. Realizar un sistema en diagrama de flujo que solicite al usuario su edad, con base en la edad ingresada, 
desplegar en pantalla si es o no mayor de edad.

Abel Isai Vargas Rodríguez
 */

package practica05;

import java.util.Scanner;

public class Edad {
    
     public static void main(String[]args){
        
         Scanner teclado = new Scanner(System.in);
         int edad;
         
         System.out.println("Ingresa tu edad ");
         edad = teclado.nextInt();
        
         if(edad>=18){
             System.out.println("Eres mayor de edad");
         }
         else{
             System.out.println("Eres menor de edad");
         }    
         
    }
}
