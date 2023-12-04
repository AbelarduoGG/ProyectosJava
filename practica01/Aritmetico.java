/*
1. Realizar un sistema en diagrama de flujo en el que se solicite al usuario 2 números, el sistema deberá de 
desplegar en pantalla el resultado de la suma, resta, multiplicación y división de los 2 números ingresados por 
el usuario.

Abel Isai Vargas Rodríguez
*/


package practica01;

//Con tal de poder utilizar Scanner
import java.util.Scanner;

public class Aritmetico {

public static void main(String[] args){
    
    //Declaración de variables
    double numero1, numero2, resultado;
    
    //Se  utiliza Scanner para ingresar datos
    Scanner entrada = new Scanner(System.in);
 
    System.out.println("Este programa saca suma, resta, multiplicación y división de dos números");
    System.out.println("");
    
    System.out.println("Ingresa el primer número");
    numero1 = entrada.nextDouble();
    
    System.out.println("Ingresa un segundo número");
    numero2 = entrada.nextDouble();
    
    System.out.println("");
    
    resultado = numero1 + numero2;
    System.out.println("La SUMA es " + resultado);
    
    resultado = numero1 - numero2;
    System.out.println("La RESTA es " + resultado);
    
    resultado = numero1 * numero2;
    System.out.println("La MULTIPLICACIÓN es " + resultado);
    
    resultado = numero1 / numero2;
    System.out.println("La DIVISIÓN es " + resultado);    
    
}
    
}
