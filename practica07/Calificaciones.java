/*
 7. Realizar un sistema en diagrama de flujo que solicite al usuario su calificación de Programación, Redes y  Matemáticas, una vez que el 
usuario ingresa las calificaciones se deberá obtener el promedio de las tres calificaciones, con base en el promedio, imprimir en pantalla 
si el usuario aprobó o reprobó el cuatrimestre (Para que sea aprobatorio, el promedio debe ser mayor o igual a 8) 

Nota: Las calificaciones están en el rango de 0 a 10

Abel Isai Vargas Rodríguez
 */

package practica07;

import java.util.Scanner;

public class Calificaciones {
    
    public static void main(String [] args){
        
        Scanner teclado = new Scanner (System.in);
        
        double calificacionProgra, calificacionRedes, calificacionMate, resultado;
        
        System.out.println("Ingresarás tus calificaciones en rango de 0 a 10");
        System.out.println("Ingresa la calificación de programación ");
        calificacionProgra=teclado.nextDouble();
        
        System.out.println("Ingresa la calificación de Redes ");
        calificacionRedes=teclado.nextDouble();
        
        System.out.println("Ingresa la calificación de Matematicas ");
        calificacionMate = teclado.nextDouble();
        
        resultado=(calificacionProgra + calificacionRedes + calificacionMate)/3;
        
        System.out.println("");
        System.out.println("Tu promedio es " + resultado);
        
        if(resultado>=8){
            
            System.out.println("Promedio aprobatorio");
            
        }else{
            
            System.out.println("Promedio reprobatorio");
            
        }
        
    }
}