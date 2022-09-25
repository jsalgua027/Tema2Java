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
public class Ej06 {

    /**
     * Tres personas deciden invertir su dinero para formar una empresa. Cada
     * una de ellas invierte una cantidad distinta, que debes solicitar al
     * usuario por teclado. Implementa un algoritmo que imprima el porcentaje
     * que invierte cada uno con respecto al total de la inversión. 100*CANTIDAD
     * INDIVIDUAL INVERTIDA / TOTAL INVERTIDO
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cantidadSocio1;// variables para cada socio
        double cantidadSocio2;
        double cantidadSocio3;

        double totalInvertido;// total de lo invertido entre los tres

        final int MULTIPLICADOR = 100;// constante para el proceso arimetico

        double porcentajeSocio1;//variables resultado para cada socio
        double porcentajeSocio2;
        double porcentajeSocio3;

        // solicito los datos
        System.out.println("Vamos a indicar la cantidad que invierte cada socio");
        System.out.println("El socio UNO, ¿Que cantidad invierte?");
        cantidadSocio1 = teclado.nextDouble();
        System.out.println("El socio DOS, ¿Que cantidad invierte?");
        cantidadSocio2 = teclado.nextDouble();
        System.out.println("El socio TRES, ¿Que cantidad invierte?");
        cantidadSocio3 = teclado.nextDouble();
        totalInvertido = cantidadSocio1 + cantidadSocio2 + cantidadSocio3;
        System.out.println("El total de lo invertido por los tres socios es de: " + totalInvertido);
        //proceso
        porcentajeSocio1 = (MULTIPLICADOR * cantidadSocio1) / totalInvertido;
        porcentajeSocio2 = (MULTIPLICADOR * cantidadSocio2) / totalInvertido;
        porcentajeSocio3 = (MULTIPLICADOR * cantidadSocio3) / totalInvertido;

        //muestro los resultados
        System.out.println("*************************INFORME DE RESULTADOS*******************************");

        String resultados = """
                           Siendo el total de lo invertido %.2f 
                           
                            -El Socio UNO a invertido= %.2f que es: %.2f por ciento del total de la inversion
                           
                            -El Socio DOS a invertido= %.2f que es: %.2f por ciento del total de la inversion
                           
                            -El Socio TRES a invertido= %.2f que es: %.2f por ciento del total de la inversion
                           
                           
                           
                           """.formatted(totalInvertido, cantidadSocio1, porcentajeSocio1,
                cantidadSocio2, porcentajeSocio2, cantidadSocio3, porcentajeSocio3);

        System.out.println(resultados);

    }

}
