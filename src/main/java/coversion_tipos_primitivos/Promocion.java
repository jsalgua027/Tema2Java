/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversion_tipos_primitivos;

/**
 *
 * @author Windows10
 */
public class Promocion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En operaciones entre long e int el tipo siempre será long, que
        // es el más grande

        int num1 = 23234;
        long num2 = 4432L;

        //int resultado = num1 + num2;   // El resultado de num+num2 es long
        long resultado = num1 + num2;

        // RECORDAR QUE EN OPERACIONES ARITMÉTICAS EL TIPO SE PROMOCIONA AL
        // TIPO MAYOR DE LOS OPERANDOS IMPLICADOS.
        // Si hay en una operación enteros y reales, entonces se promociona
        // al real más grande (float o double).
        float a = 3.4f;
        long b = 23452L;

        // long res = a+b;  // Error, el tipo será float
        float res = a + b;

        // Si hay dos reales, al más grande
        double x = 234.234;
        float y = 234234.234f;

        // float res = x+y;  // Error, el tipo será double
        double res2 = x + y;
    }

}
