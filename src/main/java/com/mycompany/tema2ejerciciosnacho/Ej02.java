/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tema2ejerciciosnacho;

/**
 *
 * @author Windows10
 */
public class Ej02 {

    /**
     * Realiza lo siguiente dentro del método main: a.- Declara e inicializa
     * tres variables int en la misma instrucción (a=1, b=2, c=3). b.- Declara e
     * inicializa tres variables double en la misma instrucción (d=4.5, e=5.7,
     * f=6.9). c.- Muestra las variables en dos líneas, la primera línea
     * mostrará las variables tipo entero y la segunda línea mostrará las
     * variables tipo double. d.- Realiza los siguiente intercambios de valores:
     * en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el
     * resultado. *
     */
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        double d = 4.5, e = 5.7, f = 6.9;

        System.out.print(" la variable a es= " + a);
        System.out.print(" la variable b es= " + b);
        System.out.print(" la variable c es= " + c + "\n");
        System.out.print(" la variable d es= " + d);
        System.out.print(" la variable e es= " + e);
        System.out.print(" la variable f es= " + f + "\n");
        System.out.println("**************************Otra forma de hacerlo****************");
        System.out.println("Las variables enteras son: a es= "+a+" b es= "+b+ " c es= "+c );
        System.out.println("Las variables enteras son: d es= "+d+" e es= "+e+ " f es= "+f );
        
        b=c;
        c=a;
        a=b;
        
        System.out.println("*******************************************************");
        System.out.println("El resultado de los intercambios es= "+ b);

    }

}
