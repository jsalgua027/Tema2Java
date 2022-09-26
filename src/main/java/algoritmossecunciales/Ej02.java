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
public class Ej02 {

    /**
     * Algoritmo que lea por teclado el valor del radio de una circunferencia y
     * calcule la longitud, el área de la circunferencia y el volumen de la
     * misma.
     *
     */
    public static void main(String[] args) {
        //variables para el algoritmo
        Scanner teclado = new Scanner(System.in);
        final double PI = 3.14; //constante PI para los calculos
        
        System.out.println("Indique el radio de la circunferencia");
        double radio = teclado.nextDouble();
        // realizamos los calculos 
        //Longuitud de una circunferencia es 2*pi*radio
        double longitudCircunferencia = 2 * PI * radio;
        //El area de una circunferencia es PI*radio al cuadrado
        double areaCircunferencia = 2 * PI * (Math.pow(radio, 2));
        // el volumen es radio al cubo por pi por 4/3.
        double volumenCircunferencia = (Math.pow(radio, 3)) * PI * (4.0 / 3);//ojo con la división 4/3 es división de enteros

      //  imprimo por pantalla el resultado
        System.out.println("""
                           dado el radio: %.2f
                           su longitud es: %.2f
                           su area es: %.2f
                           su volumen es: %.2f
                           
                           
                           """.formatted(radio, longitudCircunferencia, areaCircunferencia, volumenCircunferencia));

          
    }
    
}
