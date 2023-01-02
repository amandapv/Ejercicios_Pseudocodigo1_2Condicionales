/*
Hacer un programa que pida por teclado dos números y que calcule y escriba su suma, solamente si los dos son pares y el
primero es menor que 50 y el segundo está dentro del intervalo cerrado 100-500. En caso de que no se cumpla las condiciones,
en vez de la suma, visualizar un mensaje de error.
 */

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int suma = 0;

        System.out.println("Dime un número 1");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número 2");
        num2 = teclado.nextInt();

        if ( (num1 % 2 == 0) && (num2 % 2 == 0) && (num1 < 50) && (num2 >= 100 && num2 <= 500) ) {
            suma = num1 + num2;
            System.out.println("La suma de esos dos números es de " + suma);
        } else {
            System.out.println("Los números tienen que ser pares y el primero tiene que ser menor que 50 y el segundo tiene que estar dentro de un intervalo cerrado entre 100 y 500");
        }
    }
}
