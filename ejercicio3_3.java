/*
    Modificar el ejercicio anterior para que en vez de escribir un mensaje genérico
    en caso de que alguno o los dos números sean negativos, escriba una
    salida diferenciada para cada una de las situaciones que se pueden producir
    utilizando los siguientes mensajes:
    - No se calcula la suma porque el primer número es negativo.
    - No se calcula la suma porque el segundo número es negativo.
    - No se calcula la suma porque los dos números son negativos
 */

import java.util.Scanner;
//NO FUNCIONA. NUNCA SALE EL ÚLTIMO ELSE
public class ejercicio3_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int suma = 0;

        System.out.println("Dime un número");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número");
        num2 = teclado.nextInt();

        if (num1 >= 0 && num2 >= 0) {
            suma = num1 + num2;
            System.out.println("Números introducidos: " + num1 + ", " + num2);
            System.out.println("La suma de los dos números es: " + suma);


        } else {
            if (num1 < 0 && num2 >= 0) {
                System.out.println("No se calcula la suma porque el primer número es negativo.");
            } else if (num2 < 0 && num1 >= 0) {
                System.out.println("No se calcula la suma porque el segundo número es negativo.");
            } else {
                System.out.println("No se calcula la suma porque los dos números son negativos.");
            }
        }
    }
}
