/*
    Se pide por teclado un número y que a continuación escriba el mensaje “el
    número leído es positivo” o bien el mensaje “el número leído es negativo”
    dependiendo de que el número sea positivo o negativo. Consideramos al
    número cero positivo.
 */

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 0;

        System.out.println("Introduce un número y te digo si es positivo o negativo");

        num = teclado.nextInt();

        if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
    }
}