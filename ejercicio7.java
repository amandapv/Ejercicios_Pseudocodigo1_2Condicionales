/*
Diseñar un programa que calcule importe final de la venta considerando que sobre el valor bruto se hace un descuento según la siguiente tabla:
Valores <=20000			Descuento 0%
Valores >20000 y <= 100000 		Descuento 5 %
Valores > 100000 			Descuento 10 %
 */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        double resultado = 0;

        System.out.println("Dime un número");
        num = teclado.nextInt();

        if (num <=20000) {
            System.out.println("No se aplica descuento a esa cantidad, el precio final queda en " + num);
        } else if (num > 20000 && num <= 100000) {
            resultado = num * 0.95;
            System.out.println("Con el descuento del 5%, el total se queda en " + resultado);
        } else if (num > 100000) {
            resultado = num * 0.9;
            System.out.println("Con el descuento del 10%, el total se queda en " + resultado);
        }
    }
}
