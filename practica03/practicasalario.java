/*
 3. Realizar un sistema en diagrama de flujo que calcule el salario mensual de un trabajador con base en las horas trabajadas al día;
El sistema debe de solicitar al trabajador cuántas horas labora al día, el mes se considera como 30 días de trabajo, por 
cada hora laborada se paga 150 pesos. Al final el sistema debe de desplegar en pantalla la cantidad total de lo que se le 
pagará al trabajador.

Abel Isai Vargas Rodríguez
*/
package practica03;

import java.util.Scanner;

public class practicasalario {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        double salario, horastrabajadas;
        
        System.out.println("Este programa calcula tu salario mensual ");
        System.out.println("");
        System.out.println("Ingrese cuantas horas trabaja al día ");
        horastrabajadas = teclado.nextDouble();
        
        salario = (horastrabajadas * 30)*150;
        
        System.out.println("");
        System.out.println("Tu salario mensual es $" + salario);
    
    }
    
}
