package UNIDAD1;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        int num, num2 = 0;
        int operacion;
        String resultado;

        System.out.print("Introduce el primer número: ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        Scanner teclado2 = new Scanner(System.in);
        num2 = teclado2.nextInt();

        if (num >= num2) {
            operacion = num - num2;
            resultado = "El resultado es: " + operacion;
        } else {
            operacion = num + num2;
            resultado = "El resultado es: " + operacion;
        }

        System.out.println(resultado);

        teclado.close();
    }
}