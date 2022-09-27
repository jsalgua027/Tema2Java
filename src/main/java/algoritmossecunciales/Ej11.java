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
public class Ej11 {

    /**
     * Se requiere obtener el área de la figura, a partir de R y H. Realiza un
     * algoritmo para resolver el problema.
     *
     *
     * El área de un semicírculo es la mitad del área de un círculo. Por lo
     * tanto, el área de un semicírculo es igual al número pi por el cuadrado
     * del radio del semicírculo partido por dos.
     *
     * La otra parte de la figura es un triangulo equilatero (Los tres lados
     * iguales) usamos pitagoras para obtener la altira dado que transformamos
     * el tringulo equilatero en dos triangulos rectangulos, para hayar la
     * altura usamos pitagoras: c al cuadrado = la suma de los catetos al
     * cuadrado la mitad de un lado cateto1 el lado entero el cateto2 una vez
     * tengamos la altura = (base * altura/2)
     *
     *
     *
     */
    public static void main(String[] args) {
        double r=0;// siendo r radio
        double h=0;// siendo h un lado del triangulo
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Indique que radio tiene el semi circulo ");
        r=datos.nextDouble();
        System.out.println("Indique que dimension tiene uno de los lados del triangulo");
        h=datos.nextDouble();
        //cálculo el area del semi circulo
        double areaSemiCirculo=(Math.PI*Math.pow(r, 2))/2;
        //Cálculo el area del tringulo equilatero
        double catetoTrinaguloRect=h/2;// variable para realizar pitagoras
        double alturaTrinaguloEquila= Math.sqrt(Math.pow(h, 2)- Math.pow(catetoTrinaguloRect, 2));//obtengo la altura
        double areaTrianguloEquila=(h*alturaTrinaguloEquila)/2;
        //obtengo el resultado definitivo
        double areaTotalFigura= areaSemiCirculo+areaTrianguloEquila;
        
        System.out.println("El area de la figura es= " + areaTotalFigura);
        //
    }

}
