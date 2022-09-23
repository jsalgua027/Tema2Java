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
public class Ej01 {

    /**
     * Algoritmo que lea por teclado una cantidad de grados centígrados y los
     * pase a grados Fahrenheit.
     *
     */
    public static void main(String[] args) {
        //(0 °C × 9 / 5) + 32 = 32 °F

        //variables
        final double CONVERSOR_FAHRENHEIT = 1.8;
        final double CONVERSOR_FAHRENHEIT2 = 32;

        double gradosPedidos;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        //solicitos los datos 
        System.out.println("Indique los grados que quiere transformar ");
        gradosPedidos = entrada.nextDouble();
        //proceso
        resultado = (gradosPedidos * CONVERSOR_FAHRENHEIT) + CONVERSOR_FAHRENHEIT2;

        // muestro los datos
        System.out.println(gradosPedidos + " son = " + resultado + " Fahrenheit");
           
    }

}
