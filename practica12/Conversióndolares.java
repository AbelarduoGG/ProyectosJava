/*
12. Realizar un sistema en Diagrama de Flujo que muestre al usuario el siguiente menú

Conversión de divisas
1. Conversión Pesos a Dólares
2. Conversión de Dólares a Pesos
3. Conversión de Euros a Pesos
4. Conversión de Pesos a Euros
Elige una opción

al ingresar a la opción deseada preguntar por la cantidad a convertir y 
desplegar el resultado correspondiente.
  
20 pesos  = 1 Dólar  
24 pesos  = 1 Euro.

Abel Isai Vargas Rodríguez
 */


package practica12;

import java.util.Scanner;

public class Conversióndolares {
    
    Scanner teclado = new Scanner (System.in);
    
    public static void main (String []args){
        
        Scanner teclado = new Scanner (System.in);
        
        int opcion=0;
        double monedaoriginaria=0, monedacambio=0;
        
        System.out.println("1. Conversión pesos a dólares");
        System.out.println("2. Conversión dólares a pesos");
        System.out.println("3, Conversión euros a pesos");
        System.out.println("4. Conversión pesos a euros");
        System.out.print("Eliga una opción: ");
        opcion = teclado.nextInt();
        System.out.println("");
        
        if(opcion >= 1 && opcion <= 4){
            
            System.out.println("Ingresa la primer cantidad");
            monedaoriginaria = teclado.nextDouble();
            
        }
        
        
        switch(opcion){
            
            case 1:
                monedacambio = monedaoriginaria/20;
                System.out.println("El valor es " + monedacambio);
                break;
                
            case 2:
                monedacambio = monedaoriginaria*20;
                System.out.println("El valor es " + monedacambio);
                break;
            
            case 3:
                monedacambio = monedaoriginaria*24;
                System.out.println("El valor es " + monedacambio);
                break;
                 
            case 4:
                monedacambio = monedaoriginaria/24;
                System.out.println("El valor es " + monedacambio);
                break;
            
            default:
                System.out.println("Valor incorrecto");
                
        }
        
        
    }
    
}
