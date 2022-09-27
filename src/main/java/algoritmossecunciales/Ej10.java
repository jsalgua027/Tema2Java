/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class Ej10 {

    /**
     * Una empresa constructora se dedica a realizar bloques de pisos en
     * parcelas como las que figuran en la imagen de la derecha. Necesitan saber
     * el área de la parcela según las medidas A, B y C. Realiza el ejercicio
     * usando JOption para solicitar y mostrar datos al usuario.
     *
     *
     */
    public static void main(String[] args) {
        /*Solicito los datos mediante JOptionpane, uso la clase envolvente para
        recoger un String y tranformalo a un double 
         */
        JOptionPane.showMessageDialog(null, "Le vamos a solicitar los lados de la figura");
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide A?"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide B?"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto mide C?"));

        /*
            realizo  los cálculos, para ello he dividido la figura en tres 
            triangulos rectangulos para calcular el area de los dos primeros N y X
            me basta con las dimensiones del ladoB y ladoC
            para calcular el area del a necesito restar al ladoA el ladoC para sacar la altura.
            y obtener el area F
            en los tres triangulos uso la formula base por altura /2,
            Despues sumo las tres areas para obtener el resultado final. 
         */
        // variables resultado de cada area
        double areaN = (ladoC * ladoB) / 2;
        double areaX = (ladoB * ladoC) / 2;
        double areaF = ((ladoA - ladoC) * ladoB) / 2;
        System.out.println(areaN + "-------" + areaX + "-----" + areaF);
        double areaTotal = areaN + areaF + areaX;

        //muestro el resultado
        JOptionPane.showMessageDialog(null, "El area total es de: " + areaTotal);
//
    }

}
