/*
8. Realizar un sistema en diagrama de flujo que solicite al usuario un número entero, el sistema 
deberá de desplegar en pantalla si el número es par ó non.

Abel Isai Vargas Rodríguez 
 */

package practica08;

import java.util.Scanner;
    
public class ParoNon {
        
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero, nonopar;
        
        System.out.println("Ingresa un número entero ");
        numero = teclado.nextInt();
        
        nonopar = numero % 2;
        
        if(nonopar == 0){
            
            System.out.println("El número es par");
            
        }else{
            System.out.println("El número es impar");
        }
        
        
    }
    
}
