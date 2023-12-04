/*
 11. Realizar un sistema en Diagrama de Flujo que muestre al usuario el siguiente menú :

Calculadora básica
1. Sumar dos números
2. Restar dos números
3. Multiplicar dos números
4. Dividir dos números
Elige una opción

Una vez que el usuario elija una opción del menú, se deberán solicitar los dos números 
y mostrar en pantalla el resultado.

Abel Isai Vargas Rodríguez
*/

package practica11;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner (System.in);
        
        int eleccion;
        double numero1=0, numero2=0, resultado=0;
        
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Dividir dos números");
        System.out.println("4. Multiplicar dos números");
        System.out.println("");
        System.out.println("Elige una opción");
        eleccion = teclado.nextInt();
        System.out.println("");
        
        if(eleccion >= 1 && eleccion <= 4){
            
            System.out.println("Ingresa el primer número");
            numero1 = teclado.nextDouble();
            System.out.println("Ingresa el segundo número");
            numero2 = teclado.nextDouble();
            
            
        }
        
        
        switch(eleccion){
        
            case 1:
             
            resultado=numero1+numero2;
            System.out.println("El resultado es " + resultado);
            break;
            
            case 2:

        
            resultado=numero1-numero2;
            System.out.println("El resultado es " + resultado);
            break;    
                
                
            case 3:


            resultado=numero1*numero2;
            System.out.println("El resultado es " + resultado);
            break;    
                
                
            case 4:

            resultado=numero1/numero2;
            System.out.println("El resultado es " + resultado);
            break;    
        
            default:
            
                System.out.println("Opción incorrecta");
                break;
    }  
        
    }
    
}
