import java.util.LinkedList;    //Librerías para la utilización de pilas
import java.util.Scanner;   //Librerías para nuestro teclado  

public class PilaLibros{
    
    public static void main(String[] args){

        LinkedList<String> PilaLibros = new LinkedList<>();   //Creamos nuestra pila de tipo String

        PilaLibros.push("EL VIAJE AL CENTRO DE LA TIERRA");    //Añadimos algunos títulos a nuestra pila
        PilaLibros.push("EL DIARIO DE ANA FRANK");
        PilaLibros.push("SHADOWHUNTERS");

        Scanner leer = new Scanner(System.in);  //Declaramos el scanner de teclado

        for(int x=0; x==0;){    //Creamos un búcle para mantenernos en el menú

            int opc;    //Nuestra variable para escoger una opción del menú
            String titulo;  //Nuestra vaiable para guardar los titulos que el usuario quiera eliminar o añadir

            System.out.println("Menú:");    //Imprimimos el menú para el usuario
            System.out.println("1. Ver pila de Titulos.");
            System.out.println("2. Cantidad de títulos en la pila.");
            System.out.println("3. Añadir nuevo título de la pila.");
            System.out.println("4. Eliminar título de la pila.");
            System.out.println("5. Vaciar la pila.");
            System.out.println("6. Eliminar primer título de la pila.");
            System.out.println("7. Ver primer título en la pila.");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            opc = leer.nextInt();   //Leemos la opción que quiera seleccionar

            switch(opc){    //Con un switch agarramos la opción elegida y damos los dichos cases
                
                case 1:
                    System.out.println("");
                    System.out.println("Tu pila es: " + PilaLibros);    //Imprimimos la pila como tal
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("La cantidad de títulos es: " + PilaLibros.size());  //Imprimimos el tamaño de la pila
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    System.out.print("Inserta el nuevo título: "); 
                    titulo = leer.nextLine();   //Guardamos el titulo de la pila en nuestra variable 
                    titulo = leer.nextLine();
                    titulo = titulo.toUpperCase();

                    if(PilaLibros.contains(titulo)){    //En caso de encontrar el titulo en nuestra pila, le indicamos que ya está guardado
                        System.out.println("Este libro ya se encuentra en la pila.");
                        System.out.println("");
                    }else{      //En caso de no encontrar el título, añadimos el escrito a la pila
                        PilaLibros.push(titulo);
                        System.out.println("Título insertado.");
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.print("Inserta título a eliminar: ");
                    titulo = leer.nextLine();   //Guardamos el titulo que desea eliminar en la variable
                    titulo = leer.nextLine();
                    titulo = titulo.toUpperCase();

                    if(PilaLibros.contains(titulo)){    //En caso de encontrar el titulo en la pila, lo eliminamos de esta misma
                        PilaLibros.remove(titulo);
                        System.out.println("Título eliminado");
                        System.out.println("");
                    }else{      //En caso de no encontrar el titulo que desea eliminar, se lo indicamos
                        System.out.println("Este titulo no se encuentra en la pila.");
                        System.out.println("");
                    }
                    break;

                case 5:     //Con el método "clear" limpiamos absolutamente todos los elementos de la pila
                    PilaLibros.clear();
                    System.out.println("");     
                    System.out.println("La pila se ha vacíado.");
                    System.out.println("");
                    break;

                case 6:     
                    if(PilaLibros.isEmpty()){   //Verificamos que la pila tenga elementos que eliminar
                        System.out.println("");
                        System.out.println("La pila está vacía.");
                        System.out.println("");
                    }else{      //Con el método "pop" eliminamos el último elemento de la pila
                        System.out.println("");
                        PilaLibros.pop();
                        System.out.println("Elemento eliminado.");
                        System.out.println("");
                    }
                    break;

                case 7:    
                    if(PilaLibros.isEmpty()){   //Verificamos que la pila tenga elementos que eliminar
                        System.out.println("");
                        System.out.println("La pila está vacía.");
                        System.out.println("");
                    }else{      //Con el método "peek" vemos el último elemento de la pila
                        System.out.println("");
                        System.out.println("El último elemento es: " + PilaLibros.peek());
                        System.out.println(""); 
                    }
                    break;

                case 8:     //Le indicamos al usuario que salió del programa
                    System.out.println("");
                    System.out.println("Hasta luego.");
                    x=1;    //Sumamos una unidad a "x" para romper el búcle del menú
                    break;

                default:    //En caso de indicar alguna otra opción (fuera del menú) le indicamos al usuario que es una opción invalida
                    System.out.println("");
                    System.out.println("Esta opción es invalida.");
                    System.out.println("");
                    break;
            }

        }

    }
    
}