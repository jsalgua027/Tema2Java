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
public class EjemplosExpesionesLogicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //leer por teclado nombre y apellido1 de una persona
        //edad, peso (kg) y estatura (cm)
        
        /*
        guardar en variables boolenas el resultado d evaluar las siguients expresiones
        
        */
        
        
        //A si la edad esta comprendida enre 25 y 35 años incluido 
        //B el peso es mayor de 50kg o menor o igual de 1000kg
        //C no mide 175cm
        //D la estatura esta entre 100cm y 180cm excluidos
        //E la edad mas 10 años no supera los 60 años
        //F el nombre es igual a "Pablo". ignorando mayusculas y minusculas
        //.Usa equalsIgnorecase de los Strings
        //G si el apellido contienen  la letra "J" Usa contains de String
        //H si el apellido termina en "-dez" usa endsWhith de los strings
        //I si la edad no esta entre los 40 7 505 años
        
        String nombre, apellido;
        int edad, estatura;
        double peso;
        
        Scanner teclado = new Scanner(System.in);
        
        //si hay qu leer textos y numeros con scanner!!!!!!
        //primero se lee los textos y al final los numeros
        
        
        //si los anterior no es posible, hay que tener en cuenta
        //que despues de leer un numero si vamos a leer un texto!!!!!!!!!
        //hay que limpiar el buffer (teclado.nextline())

        System.out.println("Introduce la edad");
        edad= teclado.nextInt();
        System.out.println("Su  edad es "+ edad);
        System.out.println("Intoduce el peso");
        peso=teclado.nextDouble();
        System.out.println("Su peso es " + peso);
        System.out.println("introduce su estatura");
        estatura=teclado.nextInt();
        System.out.println("su estatura es " + estatura);
        
        // limpiar porqueria
        teclado.nextLine();//Ojo!!!!!!!!!!!!!!!!
        System.out.println("introduce tu nombre");
        nombre = teclado.nextLine();
        System.out.println("tu nombre es "+nombre);
    
       
        //A
        System.out.println("****************APARTADO A******************");
         boolean a = edad>=25 && edad<=35;
         System.out.println("¿edad esta entre 25 y 35? " + a);
        //B
        System.out.println("*************APARTADO B *****************");
        boolean b = peso >50 && peso<100;
        System.out.println("El peso esta entre 50kg y 100kg "+ b);
        //C
        System.out.println("*************APARTADO C**************");
        boolean c= !(estatura==175);
        System.out.println("¿No es la estatura 175? "+ estatura);
        //E
        
    }
    
}
