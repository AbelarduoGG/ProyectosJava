/*
10. Realizar un sistema en Diagrama de Flujo que solicite al usuario un numero entre 1 y 7 , el 
número introducido representa un día de la semana (Iniciando con el Lunes), se deberá evaluar el número 
e imprimir en pantalla el día de la semana que corresponde, en caso que el usuario ingrese un número diferente 
de 1 a 7 se desplegará un mensaje de error.

Abel Isai Vargas Rodríguez
 */
package practica10;

import java.util.Scanner;

public class Díadelasemana {
    
    public static void main (String [] args){
        
        Scanner teclado = new Scanner (System.in);
        
        int dia;
        
        System.out.println("Ingrese un número del 1 al 7");
        dia = teclado.nextInt();
        System.out.println("");
        
        switch(dia){
            
            case 1:
                System.out.println("LUNES");
                break;
                
            case 2:
                System.out.println("MARTES");
                break;
                
            case 3:
                System.out.println("MIERCOLES");
                break;
                
            case 4:
                System.out.println("JUEVES");
                break;
                
            case 5:
                System.out.println("VIERNES");
                break;
                
            case 6:
                System.out.println("SABADO");
                break;
        
            case 7:
                System.out.println("Domingo");
                break;
                
            default:
                System.out.println("OPCIÓN INCORRECTA");
                break;
    
        }
   
    }
    
}
