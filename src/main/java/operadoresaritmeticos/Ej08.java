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
        tiempo= entradaDatos.nextInt();
        
        //constantes 
        final int SEGUNDOS = tiempo%60;
        final  int MINUTOS= (tiempo%3600)/60;
        final int HORAS = tiempo/3600;
        
        
        System.out.println("Los segundos "+ tiempo +" son= "  + HORAS +" horas " + MINUTOS + " minutos "+ SEGUNDOS + " segundos ");
        
        
        
    }
    
}
