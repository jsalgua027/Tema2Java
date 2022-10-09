/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversion_tipos_primitivos;

/**
 *
 * @author Windows10
 */
public class DuobleFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El valor esperado sería 2.5 pero el compilador realiza la
        // división entera y obvia los decimales. Al final guarda el resultado
        // sin esos decimales
        double resultado = 5 / 2;  // Pérdida de información
        System.out.println(resultado);

        // En este caso se guarda un int en un double (promoción de tipo)
        double valor = 4;
        System.out.println(valor);
    }

}
