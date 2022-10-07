/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej05 {

    /**
     *  Cada grupo de clase de un centro educativo tiene 30 horas de clase a la semana. 
     * Calcula el número de profesores que se necesitan, 
     * teniendo en cuenta que un profesor imparte un número de horas de clase a la semana, 
     * que se debe pedir al usuario, junto con el número total de grupos que tiene el centro escolar.

     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        final  int HORAS_GRUPO=30;
        int cantidadGrupos;// entrada de teclado para recibir la cantidad
        double horasProfesor;//variable para dividir las horasPro/ cantidaGrupos
        double numeroProfesores;//resultado del algoritmo
        int totalHorasGrupo;//vamos a guardar el resultado de multi. horasG*cantidaGrupos
        //ojo los calculos pueden dar cantidad de profesores en decimales, hacerlo con enteros es un error
        //es necesaio usar variable double para los calculos con decimales !!!y en la division!!!!!!
        System.out.println("Indique la cantidad de  grupos");
        cantidadGrupos= datos.nextInt();
        totalHorasGrupo= cantidadGrupos* HORAS_GRUPO;//obtengo las horas totales
        System.out.println("Indique las horas que ejerce un profesor");
        horasProfesor=datos.nextInt();//obtengo las horas de cada profesor
        numeroProfesores= totalHorasGrupo/horasProfesor;
        //uso Math.ceil para el redondeo hacia arriba
        System.out.println("Se necesitaran "+ (int)Math.ceil(numeroProfesores)+ " profesores");
        
        
    }
    
}
