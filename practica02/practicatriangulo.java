/*
2. Realizar un sistema que calcule el área de un triángulo.
La baes y altura son ingresados por el usuario, al final, el 
sistema debe desplegar en pantalla el área del triángulo.

Abel Isai Vargas Rodríguez
*/

package practica02;

import java.util.Scanner;

public class practicatriangulo {
    
 public static void main(String[] args){
     
     double base, altura, area;
     
     Scanner teclado = new Scanner (System.in);
     
     System.out.println("Este programa calcula el área de un triangulo ");
     System.out.println("");
     
     System.out.println("Insera la base de la figura ");
     base = teclado.nextDouble();
     
     System.out.println("Inserta la altura de la figura ");
     altura = teclado.nextDouble();
     
     area = (base*altura)/2;
     System.out.println("");
     System.out.println("El area de tu figura es " + area);
     
 }   
}
