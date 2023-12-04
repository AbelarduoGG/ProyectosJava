/*
13. Realziar un sistema en Diagrama de flujo que solicite al usuario un número entre el 1 y 12
(Representan los meses del año). El sistema desplegará en pantalla la temporda del año según el mes
que el usuario almacenó de la siguiente forma;

Los meses, 12, 1, 2 son de invierno
Los meses 3,4,5 son de primavera
Los meses 6,7,8 son de verano
Los meses 9,10,11 son de otoño

Nota:Resolver el sistema utilizando una instrucción switch

Abel Isai Vargas Rodríguez
 */
package practica13;

import java.util.Scanner;

public class tempordasdelaño {
    
    public static void main(String [] args){
        
        Scanner teclado = new Scanner (System.in);
        
        int numerodemes;
        
        System.out.println("Ingrese el número del mes que se encuentra ");
        numerodemes = teclado.nextInt();
    
            switch(numerodemes){
                 
                case 12,1,2:
                     System.out.println("Invierno");
                     break;
                case 3,4,5:
                     System.out.println("Primavera");
                     break;
                case 6,7,8:
                     System.out.println("Vernao");
                     break;
                case 9,10,11:
                     System.out.println("Otoño");
                     break;  
                default:
                    System.out.println("Cantidad incorrecta");
                    break;
    }
    
    
}
    
}
