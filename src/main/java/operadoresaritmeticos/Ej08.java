/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables

        Scanner entradaDatos = new Scanner(System.in); // objeto Scanner llamado entrada datos
        int tiempo; // el tiempo que se solicita por teclado y seran segundos
        System.out.println("Indique el tiempo a convertir");
        tiempo = entradaDatos.nextInt();

        //constantes 
         int horas = tiempo / 3600; //obtengo las horas
         int minutos = (tiempo % 3600) / 60;// obtengo minutos
         int segundos = tiempo % 60; // obtengo segundo

        System.out.println("Los segundos " + tiempo + " son= " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");

    }

}
