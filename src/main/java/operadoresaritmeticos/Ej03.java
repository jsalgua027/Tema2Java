/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author Windows10
 */
public class Ej03 {

    /**
     * En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej03, dentro
     * del paquete operadoresaritmeticos, que contenga una llamada al método
     * public static void main(String[] args). Realiza lo siguiente dentro del
     * método main: a.- Declara e inicializa tres variables int (a=10, b=5, i=0)
     * b.- Declara e inicializa dos variables double (c=71.3 y d=4.8) c.-
     * Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d,
     * c-d, c*d, c/d. El resultado de cada operación se almacena en una nuevas
     * variables que se crearán para tal efecto, con el nombre que tú decidas,
     * siempre siguiendo las recomendaciones de legibilidad de código. d.-
     * Muestra el resultado de cada operación usando text blocks, usando las
     * variables creadas en el paso c). e.- También muestra en pantalla los
     * resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d. f.-
     * Finalmente, el programa muestra en consola la siguiente información, en
     * distintas instrucciones: valor de i, valor de i++, valor de i y valor de
     * ++i.
     *
     */
    public static void main(String[] args) {
        //a
        int a = 10, b = 5, i = 0;
        //b
        double c = 71.3, d = 4.8;
        //c
        int resultadoSumaEnteros = a + b;
        int resultadoRestaEnteros = a - b;
        int resultadoMultiplicacionEnteros = a * b;
        int resultadoDivisionEnteros = a / b;

        double resultadoSumaDecimales = c + d;
        double resultadoRestaDecimales = c - d;
        double resultadoMultiplicacionDecimales = c * d;
        double resultadoDivisionDecimales = c / d;
        //casting para que uno de ellos sea double  double 
        // int resultadoDivisionEnteros = a / (double)b; Casting explicito!!!!!

        //d
        //los resultado los estoy imprimiendo en diferentes lineas
        System.out.println("El resultado es= " + resultadoSumaEnteros);
        System.out.println("El resultado es= " + resultadoRestaEnteros);
        System.out.println("El resultado es= " + resultadoMultiplicacionEnteros);
        System.out.println("El resultado es= " + resultadoDivisionEnteros);
        System.out.println("***************DECIMALES**************************************");
        System.out.println("El resultado es= " + resultadoSumaDecimales);
        System.out.println("El resultado es= " + resultadoRestaDecimales);
        System.out.println("El resultado es= " + resultadoMultiplicacionDecimales);
        System.out.println("El resultado es= " + resultadoDivisionDecimales);
        System.out.println("****************APARTADO C********************");
        
        // en un solo codigo con el printf indicando la cantidad de decimales % f por el tipo de variable 
        // y la cantidad de decimales------> %.3f con 3 decimales por jemplo 
        System.out.printf("suma %.3f resta %.4f multiplicacion %.2f division %.1f",
                 resultadoSumaDecimales, resultadoRestaDecimales,
                resultadoMultiplicacionDecimales, resultadoDivisionDecimales);

        // imprimo los enteros en un text block-----> con las tres comillas 
        //  se mete en un String para ello y despues imprimo el String
        String resultadoTextBlock = """
                                    la suma es= %d
                                    la resta es= %d
                                    la multiplicacion es= %d
                                    la division es= %d
                                                                   
                                                                      
                                    """.formatted(resultadoSumaEnteros, resultadoRestaEnteros,
                resultadoMultiplicacionEnteros, resultadoDivisionEnteros);
        
        System.out.println(resultadoTextBlock);

        //c 
        a *= 3; // a = a*3
        b -= 1; // b =b-1
        c += d; // c= c+d
        System.out.println("El resultado es= " + a);
        System.out.println("El resultado es= " + b);
        System.out.println("El resultado es= " + c);
        System.out.println("****************APARTADO F********************");
        //f    OJO MUY IMPORTANTE
        System.out.println("i: "+i);
        System.out.println("i++:"+ (i++));// i++ primero se usa el valor y despues se autoincrementa
        System.out.println("i: "+i);
        System.out.println("++i:"+(++i));// ++i primero autoincrementa y despues usa el valor

        
        // Modulo [ % ] IMPORTANTE
        
        a= 11;
        b= 5;
        
        int cociente=a/b;
        int resto =a%b;
        
        System.out.println("cociente "+ cociente + "resto "+ resto);
        
        
        
        
    }

}
