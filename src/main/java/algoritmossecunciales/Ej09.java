/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej09 {

    /**
     * Programa que pida el precio de un artículo y 
     * calcule su valor aplicándole un 21% de IVA.


     */
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
         final double IVA = 0.21;
         double precioProducto;// cariable entrada datos
         double precioProductoIva;// precio final
         
         
         System.out.println("Indique el precio del producto");
         precioProducto= teclado.nextDouble();
         //proceso
         
         precioProductoIva= precioProducto+(precioProducto*IVA);
         
         System.out.println("El precio del articulo con el IVA es= " + precioProductoIva + "euros");
         
         
         
    }
    
}
