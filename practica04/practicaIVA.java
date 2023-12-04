/*
4. Realizar un sistema en diagrama de flujo en el que se solicite al usuario la cantidad de productos a comprar, una vez ingresados, 
se debe solicitar al usuario el precio del producto a comprar.

El sistema debe de calcular lo siguiente :
La cantidad total a pagar
El IVA a pagar por los productos (16%)
La cantidad final a pagar (Cantidad total + IVA)

Al final el sistema debe de desplegar en pantalla:
La cantidad total a pagar (Sin IVA)
El IVA a pagar
La cantidad final a pagar (Cantidad total + IVA)

Abel Isai Vargas Rodríguez
 */
package practica04;

    import java.util.Scanner;

public class practicaIVA {
    
public static void main (String[] args){
        
    Scanner teclado = new Scanner(System.in);
    
    int cantidad;
    double precio, total;
    
    System.out.println("Este programa calcula el precio por productos con y sin IVA ");
    System.out.println("");
    
    System.out.println("Ingrese la cantidad de productos comprados ");
    cantidad = teclado.nextInt();
    System.out.println("Ingresa el precio del producto ");
    precio = teclado.nextDouble();
    
    total = precio * cantidad;
    
    System.out.println("");
    System.out.println("El precio por producto SIN IVA es " + total);
    
    total = total * .16;
    
    System.out.println("El IVA es " + total);
    
    total = total + (precio*cantidad);
    System.out.println("El total con IVA es " + total);
    
}
    
}
