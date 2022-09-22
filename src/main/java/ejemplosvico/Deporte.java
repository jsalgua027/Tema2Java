/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosvico;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Deporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar al usuario los minutos que esta corriendo Forrest Gump
        //y el progama me tiene que decir la ditasncia recorrida que corre a 8km/

        // variables y constantes
        final int VELOCIDAD = 8; //km/h
        int minutosCorriendo;//variable que se le pide
        final double MINUTOS_HORA = 60.0;
        double distanciaRecorrida;
        //creacion del objeto Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los minutos que esta corriendo: ");
        //entrada de datos
        // Usando teclado y el metodo nextInt leemos un numero entero
        minutosCorriendo = teclado.nextInt();
        
        System.out.println("Los minutos introducidos son = "+ minutosCorriendo);

        //proceso
        distanciaRecorrida=(minutosCorriendo/MINUTOS_HORA)*VELOCIDAD;
        //mostrar resultados
        System.out.println("La distancia recorrida es = " + distanciaRecorrida + "KM");
    }

}
