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
public class Ej08 {

    /**
     * En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología.
     * El presupuesto anual del hospital se reparte de la siguiente forma:
     * Ginecología 40%, Traumatología 30%, Pediatría 30%. Obtener la cantidad de dinero que recibirá cada área,
     * para cualquier cantidad de presupuesto.

     */
    public static void main(String[] args) {
        final double GINECOLIGIA=0.4;//constantes de los porcentajes de los departamentos
        final double TRAUMATOLOGIA= 0.3;
        final double PEDIATRIA= 0.3;
        
        double presupuesto;//variable entrada de datos
        
        double resulTrauma;//variables para obtener resultados
        double resulGine;
        double resulPedi;
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Indique el presupuesto total para los tres departamentos");
        presupuesto=datos.nextDouble();
        
        // proceso
        
        resulGine= presupuesto*GINECOLIGIA;
        resulTrauma= presupuesto*TRAUMATOLOGIA;
        resulPedi= presupuesto*PEDIATRIA;
        
        //Muestro resultados en un bloque de texto
        
        String resultado ="""
                          Este año hemos recibido un total de %.3f  euros para los tres departamentos.
                          
                          Ginecología recibirá= %.3f euros
                          Traumatología recibirá= %.3f euros
                          Pediatría recibirá= %.3f euros
                          
                          """.formatted(presupuesto,resulGine,resulTrauma,resulPedi);
        
        System.out.println(resultado);
    }
    
}
