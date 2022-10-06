/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class Ej03 {

    /**
     * Algoritmo que lea tres notas numéricas de tipo float y calcule la nota
     * media.
     */
    public static void main(String[] args) {
        //entrada de teclado
        Scanner teclado = new Scanner(System.in);
        //variables para la entrada de teclado
        float variable1 = 0f;
        float variable2 = 0f;
        float variable3 = 0f;

        //solicito las variables
//        System.out.println("Indique el primer numero decimal");
//        variable1 = teclado.nextFloat();
        variable1 = Float.parseFloat(JOptionPane.showInputDialog("Indique el primer numero decimal"));
//        System.out.println("Indique el segundo numero decimal");
//        variable2 = teclado.nextFloat();
        variable2 = Float.parseFloat(JOptionPane.showInputDialog("Indique el segundo numero decimal"));
//        System.out.println("Indique el tercer numero decimal");
//        variable3 = teclado.nextFloat();
        variable3 = Float.parseFloat(JOptionPane.showInputDialog("Indique el tercer numero decimal"));
        // variable para realizar el calculo
        float mediaVariables = (variable1 + variable2 + variable3) / 3.0f;
//        System.out.println("La media de las tres variables es= " + mediaVariables);
        
        JOptionPane.showMessageDialog(null, "La media de las tres variables es= " + mediaVariables);

    }

}
