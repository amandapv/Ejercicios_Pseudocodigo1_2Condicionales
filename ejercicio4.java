/*
    Escribir un programa que pida por teclado tres valores de tipo entero, y que
    calcule si se cumple que la suma de dos de ellos es igual al tercero. La salida del
    programa tiene que tener el formato:
    Números introducidos: N1 N2 N3
    Se cumple que N1=N2+N3
    Se cumple que N2=N1+N3
    Se cumple que N3=N1+N2
    Los números no cumplen la condición
 */

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;


        System.out.println("Dime un número 1");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número 2");
        num2 = teclado.nextInt();

        System.out.println("Dime otro número 3");
        num3 = teclado.nextInt();

        if (num1 + num2 == num3) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num3 + "=" + num1 + "+" + num2 + ". Es decir, num3 = num1 + num2");
        }else if (num2 + num3 == num1) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num1 + "=" + num2 + "+" + num3 + ". Es decir, num1 = num2 + num3");
        } else if (num1 + num3 == num2) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num2 + "=" + num1 + "+" + num3 + ". Es decir, num2 = num1 + num3");
        } else {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Los números no cumplen la condición");
        }
    }
}
