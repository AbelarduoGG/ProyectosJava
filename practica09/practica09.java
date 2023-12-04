/*
9. Realizar un sistema en diagrama de flujo que solicite al usuario dos números enteros,
el sistema deberá de desplegar en pantalla si el segundo número ingresado es divisible del primero.
Por ejemplo:
Si el usuario ingresa un 8 y después un 2     → El segundo número si es divisible del primero
Si el usuario ingresa un 9 y después un 4     → El segundo número no es divisible del primero
Si el usuario ingresa un 20 y después un 10     → El segundo número si es divisible del primero

Abel Isai Vargas Rodríguez
*/

package practica09;

import java.util.Scanner;

public class practica09 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
         int numero1, numero2, resultado ;
        
         System.out.println("Ingresa un numero entero: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingresa otro numero entero: ");
        numero2 = teclado.nextInt();
        
      resultado = numero1 % numero2;
      
      if(resultado ==0){
          System.out.println("El numero es divisible del primero");
      }else{System.out.println("El numero no es divisible del primero");
          
      }
        
        
    }
    
}