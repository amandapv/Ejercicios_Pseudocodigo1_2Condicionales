/*
    Escribir un programa que nos pida por teclado dos números enteros y que
    continuación nos escriba en pantalla la suma de los dos números solamente si
    los dos son positivos. Si no se cumplen que los dos son positivos se visualizará
    un mensaje indicándolo. La salida tiene que tener el formato siguiente:
    Números introducidos: XX, XX
    La suma de los dos números es: XXX
    No se calcula la suma porque algunos de los números o los dos no son
    positivos.
 */

import java.util.Scanner;


public class ejercicio2 {
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
            System.out.println("No se calcula la suma porque algunos de los números o los dos no son positivos.");
        }
    }
}
