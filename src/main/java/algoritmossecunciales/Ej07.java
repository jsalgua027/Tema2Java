/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej07 {

    /**
     * Realiza un conversor de euros a dólares. ¿Cómo se calcula el cambio de
     * euros a dólares? El tipo de cambio del euro a dólar en este momento es,
     * según el conversor de divisas XE, 1 EUR = 1,18135 USD. Esto quiere decir
     * que por 1 euro tendrías hoy 1,181 dólares (si alguien te los vendiera a
     * ese precio). O que por 1000 euros, obtendrías 1.181 dólares
     * (multiplicamos los euros por el tipo de cambio euro-dólar).25 ago 2020
     */
    public static void main(String[] args) {
        // entrada de datos
        Scanner datos =new Scanner(System.in);
        //varibles, como el precio de la moneda varia no lo pongo como constante.
        double precioEstimadoDolar= 1.181; // un euro vale 1,181 dolares ;
        double cantidadEuros;
        double resultado;
        
        System.out.println("Indique la cantidad de Euros");
        cantidadEuros=datos.nextDouble();
        //proceso
        resultado=cantidadEuros*precioEstimadoDolar;
        
        String muestroConversion="""
                                 
                                 %.3f Euros  son=  %.3f Dolares
                                 
                                 """.formatted(cantidadEuros,resultado);
        
        System.out.println(muestroConversion);
        
        
    }

}
