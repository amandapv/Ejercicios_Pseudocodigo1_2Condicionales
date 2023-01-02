/*
Repetir el ejercicio anterior utilizando una variable de tipo lógico que represente si se cumple o no que uno de los dos
números es igual a la suma de los otros dos.
 */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        boolean cond1 = false;
        boolean cond2 = false;
        boolean cond3 = false;

        System.out.println("Dime un número 1");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número 2");
        num2 = teclado.nextInt();

        System.out.println("Dime otro número 3");
        num3 = teclado.nextInt();

        cond1 = num1 + num2 == num3;
        cond2 = num2 + num3 == num1;
        cond3 = num1 + num3 == num2;

        if (cond1) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num3 + "=" + num1 + "+" + num2 + ". Es decir, num3 = num1 + num2");
        }else if (cond2) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num1 + "=" + num2 + "+" + num3 + ". Es decir, num1 = num2 + num3");
        } else if (cond3) {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Se cumple que " + num2 + "=" + num1 + "+" + num3 + ". Es decir, num2 = num1 + num3");
        } else {
            System.out.println("Números introducidos: " + num1 + ", " + num2 + ", " + num3 + ". Los números no cumplen la condición");
        }
    }
}
