/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresrelacionales;

/**
 *
 * @author Windows10
 */
public class Ej04 {

    /**
     * a.- Declara e inicializa dos variables int (a=10, b=20). b.- Declara
     * cuatro variables booleanas. c.- Guarda, en las variables booleanas, el
     * resultado de realizar las siguientes operaciones relacionales: a<b, a>b,
     * a==b, a!=b. d.- Muestra en pantalla el resultado de las operaciones,
     * usando las variables booleanas.
     *
     *
     */
    public static void main(String[] args) {
        //a
        int a = 10, b = 20;
        //b
        boolean resultado, resultado2, resultado3, resultado4;
        //c
        resultado = a < b;
        resultado2 = a > b;
        resultado3 = a == b;
        resultado4 = a != b;
        //d
        System.out.println("el resultado es= "+ resultado);
        System.out.println("el resultado es= "+ resultado2);
        System.out.println("el resultado es= "+ resultado3);
        System.out.println("el resultado es= "+ resultado4);
    }

}
