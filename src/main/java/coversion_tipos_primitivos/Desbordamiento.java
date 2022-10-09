/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversion_tipos_primitivos;

/**
 *
 * @author Windows10
 */
public class Desbordamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 1_000_000_000; // Mil millones

        int numeroGrande = numero1 * numero2;

        // Valor esperado 100_000_000_000
        // Rango de los int -2_147_483_648 hasta 2_147_483_647 (inclusive)
        // Se produce desbordamiento
        System.out.println(numeroGrande);

        // En operaciones entre números, si la operación se desborda 
        // (queda fuera del rango), el compilador no da error pero 
        // arroja un valor erróneo
        // Probamos a guardar en un long
        long numeroMuyGrande = numero1 * numero2;
        System.out.println(numeroMuyGrande);

        // numero1*numero2 es una operación entre int y el resultado será int,
        // se desborda y se guarda el resultado erróneo en el long
        // Si forzamos la operación a long el resultado es correcto
        numeroMuyGrande = numero1 * (long) numero2;
        System.out.println(numeroMuyGrande);

        // Otro ejemplo de desbordamiento
        numero1 = Integer.MAX_VALUE; // Mayor valor posible de los int
        System.out.println("Número mayor de los int: " + numero1);
        numero1 += 1; // Se desborda
        System.out.println("Después de sumar 1: " + numero1);
    }

}
