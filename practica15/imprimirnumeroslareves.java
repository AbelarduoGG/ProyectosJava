/*
15. Realizar un sistema en diagrama de flujo que solicite al usuario un número entero entre 1 y 50, una vez que el usuario ingrese el número, 
el sistema deberá de imprimir en pantalla desde el número 50 hasta el número ingresado, por ejemplo :

Si el usuario ingresó un 5
5, 4, 3, 2, 1
Si el usuario ingresó un 20
20, 19, 18, 17...

Abel Isai Vargas Rodríguez
 */
package practica15;

import java.util.Scanner;

public class imprimirnumeroslareves {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int cantidad=50;
        
        System.out.println("Ingresa un número entre el 1 y el 50 ");
        numero = teclado.nextInt();
        
        if(numero>= 1 && numero <= 50){
            
            while(cantidad>=numero){
                
                System.out.print(cantidad +", ");
                cantidad--;
            }
            
            
        }else{
            
            System.out.println("Cantidad incorrecta");
            
        }
    
        System.out.println("");
        
    }
    
}
