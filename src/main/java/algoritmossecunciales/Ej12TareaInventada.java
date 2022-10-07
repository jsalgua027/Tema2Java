/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmossecunciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class Ej12TareaInventada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear algoritmo que solicice datos tanto por Scanner como por JOptionPanel
        //que realice varias operaciones y muestre los resultados.

        //el algoritmo va a solicitar el nombre y apellido del  usuario, y por otro lado
        //va a solicitar una serie de numero para realizar unos calculos básicos
        //la idea es motrar los resultados con dos decimeles usando un textBlock
        //creo el scanner
        Scanner teclado = new Scanner(System.in);
        //creo las variables
        double variable1;
        double variable2;
        double variable3;
        double variable4;

        String nombre;
        String apellido;

//        //solicito los datos
//        System.out.println("Introduce valores variable1");
//        variable1 = teclado.nextDouble();
//        System.out.println("Introduce valores variable2");
//        variable2 = teclado.nextDouble();
//        System.out.println("Introduce valores variable3");
//        variable3 = teclado.nextDouble();
//        System.out.println("Introduce valores variable4");
//        variable4 = teclado.nextDouble();
//
//        //Limpio el buffer paso de (numeros a string)
//        teclado.nextLine();
//        System.out.println("Introduce el nombre");
//        nombre = teclado.nextLine();
//        System.out.println("Introduce el apellido");
//        apellido = teclado.nextLine();

        //realizo los calculos básicos
        //declaro e inicializo variables para los resultados
//        double resultadoSuma = variable1 + variable2;
//        double resultadoDivision = variable2 / variable3;
//        double resulRaizCuadrada = Math.sqrt(variable4);

//        //genero el textBlock para mostrar los resultados con dos decimales
//        String text = """
//                   Yo: %s con el apellido %s con mi poca creatividad.....
//                   
//                   El resultado de sumar dos variables es: %.2f 
//                   
//                   El rsultado de dividir dos variables es= %.2f
//                   
//                   El resultado de realizar la raiz cuadrada a la variable es: %.2f
//                   
//                   """.formatted(nombre, apellido, resultadoSuma, resultadoDivision, resulRaizCuadrada);

//        System.out.println(text);

        // parte de JOptionpanel
        variable1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la variable1"));
        variable2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la variable2"));
        variable3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la variable3"));
        variable4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la variable4"));

        nombre = JOptionPane.showInputDialog("Introduce el nombre");
        apellido = JOptionPane.showInputDialog("Introduce el apellido");

        double resultadoSuma = variable1 + variable2;
        double resultadoDivision = variable2 / variable3;
        double resulRaizCuadrada = Math.sqrt(variable4);
        
        
         //genero el textBlock para mostrar los resultados con dos decimales
        String text = """
                   Yo: %s con el apellido %s con mi poca creatividad.....
                   
                   El resultado de sumar dos variables es: %.2f 
                   
                   El rsultado de dividir dos variables es= %.2f
                   
                   El resultado de realizar la raiz cuadrada a la variable es: %.2f
                   
                   """.formatted(nombre, apellido, resultadoSuma, resultadoDivision, resulRaizCuadrada);

        
        // muestro por JOptionPanel
        
        JOptionPane.showMessageDialog(null,text);
        
        
        
        
    }

}
