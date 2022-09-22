/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tema2ejerciciosnacho;

/**
 *
 * @author Windows10
 */
public class Ej01 {

    /* En un nuevo proyecto, llamado Tema2+tunombre, dentro del paquete variables, crea una nueva clase llamada Ej01, que contenga una llamada al método public static void main(String[] args). Realiza lo siguiente dentro del método main:
	a.- Declara una variable primitiva de cada uno de los tipos estudiados.
	b.- Declara una constante numérica de tipo double y otra de tipo int. Presta especial atención a la hora de poner el nombre de estas constantes y usa el modificador final.
	c.- Declara un objeto String.
	d.- Inicializa las variables, las constantes y el objeto con literales de tu elección.
	e.- Muestra en pantalla cada una de las variables, constantes y objetos anteriores, en distintas líneas, usando println(). 
f.- Utilizaprintf(), para limitar a dos dígitos la salida de variables de tipo float y double.
     */
    public static void main(String[] args) {
        
        //declaro e inicializo las variables y constantes
        // variables de todos los tipos
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4l;
        double g = 15.445;
        boolean casa = true;
        float h = 7.556f;
        String nombre = "nacho";
        char letra = 'a';
        
        // constantes
        final double NUMERO = 2.5;
        final int ENTERO = 145;
        
        // apartado E
        
        System.out.println("la variable int c tiene un valor de: "+ c);
        System.out.println("****************************************");
        System.out.println("la variable boolean casa indica que es: " + casa);
        System.out.println("*****************APARTADO F***********************");
        System.out.printf("La variable vale %.2f%n", h);
        System.out.printf("La variable vale %.2f%n", g);
        
        
    }
}
