/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversion_tipos_primitivos;

/**
 *
 * @author Windows10
 */
public class ShortBytelnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cualquier operación con short,byte o char produce un int
        // a excepción de operaciones entre long
        byte uno = 1;
        byte dos = 2;
        // byte tres = uno+dos;  // Error, uno+dos es tipo int
        int tres = uno + dos; // No hay problema porque se guarda en int

        short cuatro = 4;
        // short cinco = cuatro + uno; // Error, uno+cuatro es tipo int
        int cinco = cuatro + uno; // No hay problema porque se guarda en int

        char a = 'a';
        char b = 'b';
        int unicodea = a;
        int unicodeb = b;
        // char suma = a+b; // Error, a+b es tipo int
        int suma = a + b;  // Se guarda en int la representación decimal a+b
        char charSuma = (char) suma; // Se guarda el char correspondiente
        System.out.println("Unicode a: " + unicodea + " Unicode b: " + unicodeb);
        System.out.println("Suma de a+b: " + suma + " se corresponde con: " + charSuma);

        // RECORDAR QUE ESTO OCURRE CON BYTE, SHORT Y CHAR, exceptuando el 
        // uso de +=, -=, *= y /=, que en ese caso el resultado es el mismo 
        // que el operando original
        byte x = 5;
        x += 6; // x = x+6 no es de tipo int, es de typo byte
    }

}
