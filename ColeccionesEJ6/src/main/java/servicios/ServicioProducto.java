/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *6.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 * @author peras
 */
public class ServicioProducto {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    HashMap <String,Integer> listadoProductos = new HashMap();
    
    public void agregarProducto(){
        System.out.println("Ingrese nombre de producto a agregar:");
        String nombre = scan.next();
        System.out.println("Ingrese precio: ");
        Integer precio = scan.nextInt();
        
        Producto x = new Producto(nombre, precio);
        
        listadoProductos.put(x.getNombre(), x.getPrecio());
        
    }
    
   public void mostrarTodo(){
       for (Map.Entry<String, Integer> entry : listadoProductos.entrySet()) {
           Object key = entry.getKey();
           Object val = entry.getValue();
           System.out.println("Nombre "+key+" Precio "+val);
       }
   }
    // aca me dijeron MARMOL>granito>cuarzo
    public void eliminarProducto(){
        System.out.println("Que prodcuto quiere eliminar");
        mostrarTodo();
        String producto = scan.next();
        listadoProductos.remove(producto);
    }
    
    public void modificarPrecio(){
        System.out.println("Que producto va a modificar?");
        mostrarTodo();
        String producto = scan.next();
        System.out.println("Cual es el nuevo precio");
        Integer nuevoPrecio = scan.nextInt();
        listadoProductos.replace(producto, nuevoPrecio);
        mostrarTodo();
    }
}
