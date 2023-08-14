/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import java.util.Scanner;
import servicios.ServicioProducto;

/**
 * 6. Se necesita una aplicación para una tienda en la cual queremos almacenar
 * los distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author peras
 */
public class ColeccionesEJ6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ServicioProducto sP = new ServicioProducto();

        
        do {
System.out.println("Ingrese opcion de menu:\n1: Agregar producto\n2. Mostrar listado\n3. Eliminar Prodcuto\n4. Modificar precio\n5. Salir");
            switch (scan.nextInt()) {
                case 1:
                    sP.agregarProducto();

                    break;
                case 2:
                    sP.mostrarTodo();

                    break;
                case 3:
                    sP.eliminarProducto();

                    break;
                case 4:
                    sP.modificarPrecio();

                    break;
                default:
                    System.out.println("Fin");
            }
            System.out.println("Desea continuar?\n1.Seguir\n Otro Salir");
        } while (scan.nextInt()==1);
    }

}
