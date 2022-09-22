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
public class Ej04 {

    /**
     * Uber establece un precio mínimo por servicio de 1,25€ fijos y además 8
     * céntimos por Km recorrido. Elabora un programa que lea el número de km a
     * recorrer y proporcione el presupuesto.
     *
     */
    public static void main(String[] args) {
        // variables
        final double PRECIO_MINIMO = 1.25; //precio en euros
        final double PRECIO_POR_KILOMETRO = 0.8; //precio en euros
        // entrada de datos
        Scanner teclado = new Scanner(System.in);
        int kilometros;// variable para recoger los datos 
        
        System.out.println("Indica los kilometros a recorrer");
        kilometros=teclado.nextInt();
        
        double resultado= PRECIO_MINIMO+(kilometros*PRECIO_POR_KILOMETRO);
        
        System.out.println("El presupuesto para esos kilometro es de= "+ resultado+ " euros");
    }

}
