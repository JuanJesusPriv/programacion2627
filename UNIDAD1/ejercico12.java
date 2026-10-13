package UNIDAD1;

import java.util.Scanner;

public class ejercico12 {
    public static void main(String[] args) {
        double a, b, c = 0;

        System.out.print("Introduce el primer numero: ");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        Scanner teclado2 = new Scanner(System.in);
        b = teclado2.nextDouble();

        System.out.print("Introduce el tercer numero: ");
        Scanner teclado3 = new Scanner(System.in);
        c = teclado3.nextDouble();

        double resultado1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double resultado2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("Las soluciones son: " + resultado1 + " y " + resultado2);

        teclado.close();
        teclado2.close();
        teclado3.close();
    }
}
